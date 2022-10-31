package gfc.helloGRPC;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Hello.proto")
public final class helloGRPCGrpc {

  private helloGRPCGrpc() {}

  public static final String SERVICE_NAME = "gfc.helloGRPC.helloGRPC";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gfc.helloGRPC.request,
      gfc.helloGRPC.response> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hello",
      requestType = gfc.helloGRPC.request.class,
      responseType = gfc.helloGRPC.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gfc.helloGRPC.request,
      gfc.helloGRPC.response> getHelloMethod() {
    io.grpc.MethodDescriptor<gfc.helloGRPC.request, gfc.helloGRPC.response> getHelloMethod;
    if ((getHelloMethod = helloGRPCGrpc.getHelloMethod) == null) {
      synchronized (helloGRPCGrpc.class) {
        if ((getHelloMethod = helloGRPCGrpc.getHelloMethod) == null) {
          helloGRPCGrpc.getHelloMethod = getHelloMethod = 
              io.grpc.MethodDescriptor.<gfc.helloGRPC.request, gfc.helloGRPC.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gfc.helloGRPC.helloGRPC", "Hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gfc.helloGRPC.request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gfc.helloGRPC.response.getDefaultInstance()))
                  .setSchemaDescriptor(new helloGRPCMethodDescriptorSupplier("Hello"))
                  .build();
          }
        }
     }
     return getHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gfc.helloGRPC.request,
      gfc.helloGRPC.response> getByeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bye",
      requestType = gfc.helloGRPC.request.class,
      responseType = gfc.helloGRPC.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gfc.helloGRPC.request,
      gfc.helloGRPC.response> getByeMethod() {
    io.grpc.MethodDescriptor<gfc.helloGRPC.request, gfc.helloGRPC.response> getByeMethod;
    if ((getByeMethod = helloGRPCGrpc.getByeMethod) == null) {
      synchronized (helloGRPCGrpc.class) {
        if ((getByeMethod = helloGRPCGrpc.getByeMethod) == null) {
          helloGRPCGrpc.getByeMethod = getByeMethod = 
              io.grpc.MethodDescriptor.<gfc.helloGRPC.request, gfc.helloGRPC.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gfc.helloGRPC.helloGRPC", "Bye"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gfc.helloGRPC.request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gfc.helloGRPC.response.getDefaultInstance()))
                  .setSchemaDescriptor(new helloGRPCMethodDescriptorSupplier("Bye"))
                  .build();
          }
        }
     }
     return getByeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static helloGRPCStub newStub(io.grpc.Channel channel) {
    return new helloGRPCStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static helloGRPCBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new helloGRPCBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static helloGRPCFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new helloGRPCFutureStub(channel);
  }

  /**
   */
  public static abstract class helloGRPCImplBase implements io.grpc.BindableService {

    /**
     */
    public void hello(gfc.helloGRPC.request request,
        io.grpc.stub.StreamObserver<gfc.helloGRPC.response> responseObserver) {
      asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    /**
     */
    public void bye(gfc.helloGRPC.request request,
        io.grpc.stub.StreamObserver<gfc.helloGRPC.response> responseObserver) {
      asyncUnimplementedUnaryCall(getByeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gfc.helloGRPC.request,
                gfc.helloGRPC.response>(
                  this, METHODID_HELLO)))
          .addMethod(
            getByeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gfc.helloGRPC.request,
                gfc.helloGRPC.response>(
                  this, METHODID_BYE)))
          .build();
    }
  }

  /**
   */
  public static final class helloGRPCStub extends io.grpc.stub.AbstractStub<helloGRPCStub> {
    private helloGRPCStub(io.grpc.Channel channel) {
      super(channel);
    }

    private helloGRPCStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected helloGRPCStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new helloGRPCStub(channel, callOptions);
    }

    /**
     */
    public void hello(gfc.helloGRPC.request request,
        io.grpc.stub.StreamObserver<gfc.helloGRPC.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bye(gfc.helloGRPC.request request,
        io.grpc.stub.StreamObserver<gfc.helloGRPC.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getByeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class helloGRPCBlockingStub extends io.grpc.stub.AbstractStub<helloGRPCBlockingStub> {
    private helloGRPCBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private helloGRPCBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected helloGRPCBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new helloGRPCBlockingStub(channel, callOptions);
    }

    /**
     */
    public gfc.helloGRPC.response hello(gfc.helloGRPC.request request) {
      return blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public gfc.helloGRPC.response bye(gfc.helloGRPC.request request) {
      return blockingUnaryCall(
          getChannel(), getByeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class helloGRPCFutureStub extends io.grpc.stub.AbstractStub<helloGRPCFutureStub> {
    private helloGRPCFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private helloGRPCFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected helloGRPCFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new helloGRPCFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gfc.helloGRPC.response> hello(
        gfc.helloGRPC.request request) {
      return futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gfc.helloGRPC.response> bye(
        gfc.helloGRPC.request request) {
      return futureUnaryCall(
          getChannel().newCall(getByeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;
  private static final int METHODID_BYE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final helloGRPCImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(helloGRPCImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((gfc.helloGRPC.request) request,
              (io.grpc.stub.StreamObserver<gfc.helloGRPC.response>) responseObserver);
          break;
        case METHODID_BYE:
          serviceImpl.bye((gfc.helloGRPC.request) request,
              (io.grpc.stub.StreamObserver<gfc.helloGRPC.response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class helloGRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    helloGRPCBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gfc.helloGRPC.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("helloGRPC");
    }
  }

  private static final class helloGRPCFileDescriptorSupplier
      extends helloGRPCBaseDescriptorSupplier {
    helloGRPCFileDescriptorSupplier() {}
  }

  private static final class helloGRPCMethodDescriptorSupplier
      extends helloGRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    helloGRPCMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (helloGRPCGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new helloGRPCFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .addMethod(getByeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
