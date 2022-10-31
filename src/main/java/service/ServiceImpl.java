package service;

import gfc.helloGRPC.helloGRPCGrpc;
import gfc.helloGRPC.request;
import gfc.helloGRPC.response;
import io.grpc.stub.StreamObserver;

public class ServiceImpl extends helloGRPCGrpc.helloGRPCImplBase {
    @Override
    public void hello(request request, StreamObserver<response> responseObserver) {
        String name = request.getName();
        response response = gfc.helloGRPC.response.newBuilder().setReply("Hii "+name).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void bye(request request, StreamObserver<response> responseObserver) {
        response response = gfc.helloGRPC.response.newBuilder().setReply("Bye "+request.getName()+"!!").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
