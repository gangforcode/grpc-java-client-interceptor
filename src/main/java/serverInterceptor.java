import io.grpc.*;
import io.jsonwebtoken.*;

import static io.grpc.Metadata.ASCII_STRING_MARSHALLER;

public class serverInterceptor implements ServerInterceptor {

    private JwtParser jwtParser = Jwts.parser().setSigningKey("grpc server with java");
    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
// extract token from metadata

        String token = metadata.get(Metadata.Key.of("Token",ASCII_STRING_MARSHALLER));
        Status status = Status.OK;

        if(token==null)
            status = Status.UNAUTHENTICATED.withDescription("Token is missing");
        else if(!token.startsWith("Bearer"))
            status = Status.UNAUTHENTICATED.withDescription("unknown authorization token type");
        else {
            Jws<Claims> claimsJws = null;
            try {
                claimsJws = jwtParser.parseClaimsJws(token.substring(6).trim());
            } catch (JwtException e) {
                status = Status.UNAUTHENTICATED.withDescription(e.getMessage()).withCause(e);
            }
            if(claimsJws!=null)
            {
                Context context = Context.current().withValue(Context.key("TokenData"),
                        claimsJws.getBody().getSubject());
                return Contexts.interceptCall(context,serverCall,metadata,serverCallHandler);
            }
        }
        serverCall.close(status, new Metadata());
            return new ServerCall.Listener<ReqT>() {
            };
        }
    }
