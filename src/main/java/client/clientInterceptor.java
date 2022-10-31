package client;

import io.grpc.*;
import jwt.jwtTokenGenerator;


public class clientInterceptor implements ClientInterceptor {
    jwtTokenGenerator tokenGenerator = new jwtTokenGenerator();


    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall
            (MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel) {
        return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(channel.newCall(methodDescriptor,callOptions)) {
            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                headers.put(Metadata.Key.of("Token",Metadata.ASCII_STRING_MARSHALLER),"Bearer "+tokenGenerator.jwtToken());
                super.start(responseListener, headers);
            }
        };
    }
}
