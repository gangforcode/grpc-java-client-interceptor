package client;

import gfc.helloGRPC.helloGRPCGrpc;
import gfc.helloGRPC.request;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class client {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost",8000)
                .intercept(new clientInterceptor())
                .usePlaintext().build();
        helloGRPCGrpc.helloGRPCBlockingStub blockingStub = helloGRPCGrpc.newBlockingStub(channel);
        request req = request.newBuilder().setName("gang for code").build();
        System.out.println(blockingStub.hello(req));
    }
}
