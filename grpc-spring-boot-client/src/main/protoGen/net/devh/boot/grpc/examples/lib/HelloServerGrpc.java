package net.devh.boot.grpc.examples.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: FileUpload.proto")
public final class HelloServerGrpc {

  private HelloServerGrpc() {}

  public static final String SERVICE_NAME = "HelloServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.HelloTwoRequest,
      net.devh.boot.grpc.examples.lib.HelloTwoReply> getHelloTwoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HelloTwo",
      requestType = net.devh.boot.grpc.examples.lib.HelloTwoRequest.class,
      responseType = net.devh.boot.grpc.examples.lib.HelloTwoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.HelloTwoRequest,
      net.devh.boot.grpc.examples.lib.HelloTwoReply> getHelloTwoMethod() {
    io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.HelloTwoRequest, net.devh.boot.grpc.examples.lib.HelloTwoReply> getHelloTwoMethod;
    if ((getHelloTwoMethod = HelloServerGrpc.getHelloTwoMethod) == null) {
      synchronized (HelloServerGrpc.class) {
        if ((getHelloTwoMethod = HelloServerGrpc.getHelloTwoMethod) == null) {
          HelloServerGrpc.getHelloTwoMethod = getHelloTwoMethod =
              io.grpc.MethodDescriptor.<net.devh.boot.grpc.examples.lib.HelloTwoRequest, net.devh.boot.grpc.examples.lib.HelloTwoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HelloTwo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.HelloTwoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.HelloTwoReply.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServerMethodDescriptorSupplier("HelloTwo"))
              .build();
        }
      }
    }
    return getHelloTwoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServerStub>() {
        @java.lang.Override
        public HelloServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServerStub(channel, callOptions);
        }
      };
    return HelloServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServerBlockingStub>() {
        @java.lang.Override
        public HelloServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServerBlockingStub(channel, callOptions);
        }
      };
    return HelloServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServerFutureStub>() {
        @java.lang.Override
        public HelloServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServerFutureStub(channel, callOptions);
        }
      };
    return HelloServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HelloServerImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.HelloTwoRequest> helloTwo(
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.HelloTwoReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getHelloTwoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloTwoMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                net.devh.boot.grpc.examples.lib.HelloTwoRequest,
                net.devh.boot.grpc.examples.lib.HelloTwoReply>(
                  this, METHODID_HELLO_TWO)))
          .build();
    }
  }

  /**
   */
  public static final class HelloServerStub extends io.grpc.stub.AbstractAsyncStub<HelloServerStub> {
    private HelloServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServerStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.HelloTwoRequest> helloTwo(
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.HelloTwoReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getHelloTwoMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class HelloServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloServerBlockingStub> {
    private HelloServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServerBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class HelloServerFutureStub extends io.grpc.stub.AbstractFutureStub<HelloServerFutureStub> {
    private HelloServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServerFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_HELLO_TWO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO_TWO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.helloTwo(
              (io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.HelloTwoReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.devh.boot.grpc.examples.lib.HelloServerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloServer");
    }
  }

  private static final class HelloServerFileDescriptorSupplier
      extends HelloServerBaseDescriptorSupplier {
    HelloServerFileDescriptorSupplier() {}
  }

  private static final class HelloServerMethodDescriptorSupplier
      extends HelloServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (HelloServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServerFileDescriptorSupplier())
              .addMethod(getHelloTwoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
