package ru.sberbank.sbervalidator.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: src/main/java/ru/sberbank/sbervalidator/service/proto/ValidatorService.proto")
public final class ValidatorServiceGrpc {

  private ValidatorServiceGrpc() {}

  public static final String SERVICE_NAME = "ValidatorService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getValidateRequestMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ValidatorRequest,
          ValidatorResponse> METHOD_VALIDATE_REQUEST = getValidateRequestMethod();

  private static volatile io.grpc.MethodDescriptor<ValidatorRequest,
          ValidatorResponse> getValidateRequestMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ValidatorRequest,
          ValidatorResponse> getValidateRequestMethod() {
    io.grpc.MethodDescriptor<ValidatorRequest, ValidatorResponse> getValidateRequestMethod;
    if ((getValidateRequestMethod = ValidatorServiceGrpc.getValidateRequestMethod) == null) {
      synchronized (ValidatorServiceGrpc.class) {
        if ((getValidateRequestMethod = ValidatorServiceGrpc.getValidateRequestMethod) == null) {
          ValidatorServiceGrpc.getValidateRequestMethod = getValidateRequestMethod = 
              io.grpc.MethodDescriptor.<ValidatorRequest, ValidatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ValidatorService", "ValidateRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ValidatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ValidatorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ValidatorServiceMethodDescriptorSupplier("ValidateRequest"))
                  .build();
          }
        }
     }
     return getValidateRequestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ValidatorServiceStub newStub(io.grpc.Channel channel) {
    return new ValidatorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ValidatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ValidatorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ValidatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ValidatorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ValidatorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void validateRequest(ValidatorRequest request,
                                io.grpc.stub.StreamObserver<ValidatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidateRequestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getValidateRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      ValidatorRequest,
                      ValidatorResponse>(
                  this, METHODID_VALIDATE_REQUEST)))
          .build();
    }
  }

  /**
   */
  public static final class ValidatorServiceStub extends io.grpc.stub.AbstractStub<ValidatorServiceStub> {
    private ValidatorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ValidatorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidatorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ValidatorServiceStub(channel, callOptions);
    }

    /**
     */
    public void validateRequest(ValidatorRequest request,
                                io.grpc.stub.StreamObserver<ValidatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidateRequestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ValidatorServiceBlockingStub extends io.grpc.stub.AbstractStub<ValidatorServiceBlockingStub> {
    private ValidatorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ValidatorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidatorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ValidatorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ValidatorResponse validateRequest(ValidatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidateRequestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ValidatorServiceFutureStub extends io.grpc.stub.AbstractStub<ValidatorServiceFutureStub> {
    private ValidatorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ValidatorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ValidatorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ValidatorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ValidatorResponse> validateRequest(
        ValidatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidateRequestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATE_REQUEST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ValidatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ValidatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VALIDATE_REQUEST:
          serviceImpl.validateRequest((ValidatorRequest) request,
              (io.grpc.stub.StreamObserver<ValidatorResponse>) responseObserver);
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

  private static abstract class ValidatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ValidatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ValidatorServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ValidatorService");
    }
  }

  private static final class ValidatorServiceFileDescriptorSupplier
      extends ValidatorServiceBaseDescriptorSupplier {
    ValidatorServiceFileDescriptorSupplier() {}
  }

  private static final class ValidatorServiceMethodDescriptorSupplier
      extends ValidatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ValidatorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ValidatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ValidatorServiceFileDescriptorSupplier())
              .addMethod(getValidateRequestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
