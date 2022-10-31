import io.grpc.ServerBuilder;
import service.ServiceImpl;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 8000;
        io.grpc.Server server = ServerBuilder.forPort(port).addService(new ServiceImpl())
                .intercept(new serverInterceptor()).build().start();
        System.out.println("server started at port: "+port );
        server.awaitTermination();
    }
}
