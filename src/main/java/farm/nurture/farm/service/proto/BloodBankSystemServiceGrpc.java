package farm.nurture.farm.service.proto;

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
    comments = "Source: blood_bank_system_service.proto")
public final class BloodBankSystemServiceGrpc {

  private BloodBankSystemServiceGrpc() {}

  public static final String SERVICE_NAME = "farm.nurture.core.contracts.BloodBankSystemService.BloodBankSystemService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.FindPasswordRequest,
      farm.nurture.farm.service.proto.FindPasswordResponse> getExecuteFindPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteFindPassword",
      requestType = farm.nurture.farm.service.proto.FindPasswordRequest.class,
      responseType = farm.nurture.farm.service.proto.FindPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.FindPasswordRequest,
      farm.nurture.farm.service.proto.FindPasswordResponse> getExecuteFindPasswordMethod() {
    io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.FindPasswordRequest, farm.nurture.farm.service.proto.FindPasswordResponse> getExecuteFindPasswordMethod;
    if ((getExecuteFindPasswordMethod = BloodBankSystemServiceGrpc.getExecuteFindPasswordMethod) == null) {
      synchronized (BloodBankSystemServiceGrpc.class) {
        if ((getExecuteFindPasswordMethod = BloodBankSystemServiceGrpc.getExecuteFindPasswordMethod) == null) {
          BloodBankSystemServiceGrpc.getExecuteFindPasswordMethod = getExecuteFindPasswordMethod = 
              io.grpc.MethodDescriptor.<farm.nurture.farm.service.proto.FindPasswordRequest, farm.nurture.farm.service.proto.FindPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farm.nurture.core.contracts.BloodBankSystemService.BloodBankSystemService", "ExecuteFindPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  farm.nurture.farm.service.proto.FindPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  farm.nurture.farm.service.proto.FindPasswordResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BloodBankSystemServiceMethodDescriptorSupplier("ExecuteFindPassword"))
                  .build();
          }
        }
     }
     return getExecuteFindPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.AddUserRequest,
      farm.nurture.farm.service.proto.AddUserResponse> getExecuteAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteAddUser",
      requestType = farm.nurture.farm.service.proto.AddUserRequest.class,
      responseType = farm.nurture.farm.service.proto.AddUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.AddUserRequest,
      farm.nurture.farm.service.proto.AddUserResponse> getExecuteAddUserMethod() {
    io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.AddUserRequest, farm.nurture.farm.service.proto.AddUserResponse> getExecuteAddUserMethod;
    if ((getExecuteAddUserMethod = BloodBankSystemServiceGrpc.getExecuteAddUserMethod) == null) {
      synchronized (BloodBankSystemServiceGrpc.class) {
        if ((getExecuteAddUserMethod = BloodBankSystemServiceGrpc.getExecuteAddUserMethod) == null) {
          BloodBankSystemServiceGrpc.getExecuteAddUserMethod = getExecuteAddUserMethod = 
              io.grpc.MethodDescriptor.<farm.nurture.farm.service.proto.AddUserRequest, farm.nurture.farm.service.proto.AddUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farm.nurture.core.contracts.BloodBankSystemService.BloodBankSystemService", "ExecuteAddUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  farm.nurture.farm.service.proto.AddUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  farm.nurture.farm.service.proto.AddUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BloodBankSystemServiceMethodDescriptorSupplier("ExecuteAddUser"))
                  .build();
          }
        }
     }
     return getExecuteAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.BulkAddUserRequest,
      farm.nurture.farm.service.proto.BulkAddUserResponse> getExecuteAddUserBulkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteAddUserBulk",
      requestType = farm.nurture.farm.service.proto.BulkAddUserRequest.class,
      responseType = farm.nurture.farm.service.proto.BulkAddUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.BulkAddUserRequest,
      farm.nurture.farm.service.proto.BulkAddUserResponse> getExecuteAddUserBulkMethod() {
    io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.BulkAddUserRequest, farm.nurture.farm.service.proto.BulkAddUserResponse> getExecuteAddUserBulkMethod;
    if ((getExecuteAddUserBulkMethod = BloodBankSystemServiceGrpc.getExecuteAddUserBulkMethod) == null) {
      synchronized (BloodBankSystemServiceGrpc.class) {
        if ((getExecuteAddUserBulkMethod = BloodBankSystemServiceGrpc.getExecuteAddUserBulkMethod) == null) {
          BloodBankSystemServiceGrpc.getExecuteAddUserBulkMethod = getExecuteAddUserBulkMethod = 
              io.grpc.MethodDescriptor.<farm.nurture.farm.service.proto.BulkAddUserRequest, farm.nurture.farm.service.proto.BulkAddUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farm.nurture.core.contracts.BloodBankSystemService.BloodBankSystemService", "ExecuteAddUserBulk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  farm.nurture.farm.service.proto.BulkAddUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  farm.nurture.farm.service.proto.BulkAddUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BloodBankSystemServiceMethodDescriptorSupplier("ExecuteAddUserBulk"))
                  .build();
          }
        }
     }
     return getExecuteAddUserBulkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.FindBloodRequest,
      farm.nurture.farm.service.proto.FindBloodResponse> getExecuteFindBloodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteFindBlood",
      requestType = farm.nurture.farm.service.proto.FindBloodRequest.class,
      responseType = farm.nurture.farm.service.proto.FindBloodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.FindBloodRequest,
      farm.nurture.farm.service.proto.FindBloodResponse> getExecuteFindBloodMethod() {
    io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.FindBloodRequest, farm.nurture.farm.service.proto.FindBloodResponse> getExecuteFindBloodMethod;
    if ((getExecuteFindBloodMethod = BloodBankSystemServiceGrpc.getExecuteFindBloodMethod) == null) {
      synchronized (BloodBankSystemServiceGrpc.class) {
        if ((getExecuteFindBloodMethod = BloodBankSystemServiceGrpc.getExecuteFindBloodMethod) == null) {
          BloodBankSystemServiceGrpc.getExecuteFindBloodMethod = getExecuteFindBloodMethod = 
              io.grpc.MethodDescriptor.<farm.nurture.farm.service.proto.FindBloodRequest, farm.nurture.farm.service.proto.FindBloodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farm.nurture.core.contracts.BloodBankSystemService.BloodBankSystemService", "ExecuteFindBlood"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  farm.nurture.farm.service.proto.FindBloodRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  farm.nurture.farm.service.proto.FindBloodResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BloodBankSystemServiceMethodDescriptorSupplier("ExecuteFindBlood"))
                  .build();
          }
        }
     }
     return getExecuteFindBloodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.AddBloodRequest,
      farm.nurture.farm.service.proto.AddBloodResponse> getExecuteAddBloodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteAddBlood",
      requestType = farm.nurture.farm.service.proto.AddBloodRequest.class,
      responseType = farm.nurture.farm.service.proto.AddBloodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.AddBloodRequest,
      farm.nurture.farm.service.proto.AddBloodResponse> getExecuteAddBloodMethod() {
    io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.AddBloodRequest, farm.nurture.farm.service.proto.AddBloodResponse> getExecuteAddBloodMethod;
    if ((getExecuteAddBloodMethod = BloodBankSystemServiceGrpc.getExecuteAddBloodMethod) == null) {
      synchronized (BloodBankSystemServiceGrpc.class) {
        if ((getExecuteAddBloodMethod = BloodBankSystemServiceGrpc.getExecuteAddBloodMethod) == null) {
          BloodBankSystemServiceGrpc.getExecuteAddBloodMethod = getExecuteAddBloodMethod = 
              io.grpc.MethodDescriptor.<farm.nurture.farm.service.proto.AddBloodRequest, farm.nurture.farm.service.proto.AddBloodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farm.nurture.core.contracts.BloodBankSystemService.BloodBankSystemService", "ExecuteAddBlood"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  farm.nurture.farm.service.proto.AddBloodRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  farm.nurture.farm.service.proto.AddBloodResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BloodBankSystemServiceMethodDescriptorSupplier("ExecuteAddBlood"))
                  .build();
          }
        }
     }
     return getExecuteAddBloodMethod;
  }

  private static volatile io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.BulkAddBloodRequest,
      farm.nurture.farm.service.proto.BulkAddBloodResponse> getExecuteAddBloodBulkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteAddBloodBulk",
      requestType = farm.nurture.farm.service.proto.BulkAddBloodRequest.class,
      responseType = farm.nurture.farm.service.proto.BulkAddBloodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.BulkAddBloodRequest,
      farm.nurture.farm.service.proto.BulkAddBloodResponse> getExecuteAddBloodBulkMethod() {
    io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.BulkAddBloodRequest, farm.nurture.farm.service.proto.BulkAddBloodResponse> getExecuteAddBloodBulkMethod;
    if ((getExecuteAddBloodBulkMethod = BloodBankSystemServiceGrpc.getExecuteAddBloodBulkMethod) == null) {
      synchronized (BloodBankSystemServiceGrpc.class) {
        if ((getExecuteAddBloodBulkMethod = BloodBankSystemServiceGrpc.getExecuteAddBloodBulkMethod) == null) {
          BloodBankSystemServiceGrpc.getExecuteAddBloodBulkMethod = getExecuteAddBloodBulkMethod = 
              io.grpc.MethodDescriptor.<farm.nurture.farm.service.proto.BulkAddBloodRequest, farm.nurture.farm.service.proto.BulkAddBloodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farm.nurture.core.contracts.BloodBankSystemService.BloodBankSystemService", "ExecuteAddBloodBulk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  farm.nurture.farm.service.proto.BulkAddBloodRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  farm.nurture.farm.service.proto.BulkAddBloodResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BloodBankSystemServiceMethodDescriptorSupplier("ExecuteAddBloodBulk"))
                  .build();
          }
        }
     }
     return getExecuteAddBloodBulkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.MultiRequests,
      farm.nurture.farm.service.proto.MultiResponses> getExecuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Execute",
      requestType = farm.nurture.farm.service.proto.MultiRequests.class,
      responseType = farm.nurture.farm.service.proto.MultiResponses.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.MultiRequests,
      farm.nurture.farm.service.proto.MultiResponses> getExecuteMethod() {
    io.grpc.MethodDescriptor<farm.nurture.farm.service.proto.MultiRequests, farm.nurture.farm.service.proto.MultiResponses> getExecuteMethod;
    if ((getExecuteMethod = BloodBankSystemServiceGrpc.getExecuteMethod) == null) {
      synchronized (BloodBankSystemServiceGrpc.class) {
        if ((getExecuteMethod = BloodBankSystemServiceGrpc.getExecuteMethod) == null) {
          BloodBankSystemServiceGrpc.getExecuteMethod = getExecuteMethod = 
              io.grpc.MethodDescriptor.<farm.nurture.farm.service.proto.MultiRequests, farm.nurture.farm.service.proto.MultiResponses>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farm.nurture.core.contracts.BloodBankSystemService.BloodBankSystemService", "Execute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  farm.nurture.farm.service.proto.MultiRequests.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  farm.nurture.farm.service.proto.MultiResponses.getDefaultInstance()))
                  .setSchemaDescriptor(new BloodBankSystemServiceMethodDescriptorSupplier("Execute"))
                  .build();
          }
        }
     }
     return getExecuteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BloodBankSystemServiceStub newStub(io.grpc.Channel channel) {
    return new BloodBankSystemServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BloodBankSystemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BloodBankSystemServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BloodBankSystemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BloodBankSystemServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BloodBankSystemServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void executeFindPassword(farm.nurture.farm.service.proto.FindPasswordRequest request,
        io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.FindPasswordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteFindPasswordMethod(), responseObserver);
    }

    /**
     */
    public void executeAddUser(farm.nurture.farm.service.proto.AddUserRequest request,
        io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.AddUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteAddUserMethod(), responseObserver);
    }

    /**
     */
    public void executeAddUserBulk(farm.nurture.farm.service.proto.BulkAddUserRequest request,
        io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.BulkAddUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteAddUserBulkMethod(), responseObserver);
    }

    /**
     */
    public void executeFindBlood(farm.nurture.farm.service.proto.FindBloodRequest request,
        io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.FindBloodResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteFindBloodMethod(), responseObserver);
    }

    /**
     */
    public void executeAddBlood(farm.nurture.farm.service.proto.AddBloodRequest request,
        io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.AddBloodResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteAddBloodMethod(), responseObserver);
    }

    /**
     */
    public void executeAddBloodBulk(farm.nurture.farm.service.proto.BulkAddBloodRequest request,
        io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.BulkAddBloodResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteAddBloodBulkMethod(), responseObserver);
    }

    /**
     */
    public void execute(farm.nurture.farm.service.proto.MultiRequests request,
        io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.MultiResponses> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExecuteFindPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                farm.nurture.farm.service.proto.FindPasswordRequest,
                farm.nurture.farm.service.proto.FindPasswordResponse>(
                  this, METHODID_EXECUTE_FIND_PASSWORD)))
          .addMethod(
            getExecuteAddUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                farm.nurture.farm.service.proto.AddUserRequest,
                farm.nurture.farm.service.proto.AddUserResponse>(
                  this, METHODID_EXECUTE_ADD_USER)))
          .addMethod(
            getExecuteAddUserBulkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                farm.nurture.farm.service.proto.BulkAddUserRequest,
                farm.nurture.farm.service.proto.BulkAddUserResponse>(
                  this, METHODID_EXECUTE_ADD_USER_BULK)))
          .addMethod(
            getExecuteFindBloodMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                farm.nurture.farm.service.proto.FindBloodRequest,
                farm.nurture.farm.service.proto.FindBloodResponse>(
                  this, METHODID_EXECUTE_FIND_BLOOD)))
          .addMethod(
            getExecuteAddBloodMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                farm.nurture.farm.service.proto.AddBloodRequest,
                farm.nurture.farm.service.proto.AddBloodResponse>(
                  this, METHODID_EXECUTE_ADD_BLOOD)))
          .addMethod(
            getExecuteAddBloodBulkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                farm.nurture.farm.service.proto.BulkAddBloodRequest,
                farm.nurture.farm.service.proto.BulkAddBloodResponse>(
                  this, METHODID_EXECUTE_ADD_BLOOD_BULK)))
          .addMethod(
            getExecuteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                farm.nurture.farm.service.proto.MultiRequests,
                farm.nurture.farm.service.proto.MultiResponses>(
                  this, METHODID_EXECUTE)))
          .build();
    }
  }

  /**
   */
  public static final class BloodBankSystemServiceStub extends io.grpc.stub.AbstractStub<BloodBankSystemServiceStub> {
    private BloodBankSystemServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BloodBankSystemServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BloodBankSystemServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BloodBankSystemServiceStub(channel, callOptions);
    }

    /**
     */
    public void executeFindPassword(farm.nurture.farm.service.proto.FindPasswordRequest request,
        io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.FindPasswordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteFindPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void executeAddUser(farm.nurture.farm.service.proto.AddUserRequest request,
        io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.AddUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void executeAddUserBulk(farm.nurture.farm.service.proto.BulkAddUserRequest request,
        io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.BulkAddUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteAddUserBulkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void executeFindBlood(farm.nurture.farm.service.proto.FindBloodRequest request,
        io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.FindBloodResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteFindBloodMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void executeAddBlood(farm.nurture.farm.service.proto.AddBloodRequest request,
        io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.AddBloodResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteAddBloodMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void executeAddBloodBulk(farm.nurture.farm.service.proto.BulkAddBloodRequest request,
        io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.BulkAddBloodResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteAddBloodBulkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void execute(farm.nurture.farm.service.proto.MultiRequests request,
        io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.MultiResponses> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BloodBankSystemServiceBlockingStub extends io.grpc.stub.AbstractStub<BloodBankSystemServiceBlockingStub> {
    private BloodBankSystemServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BloodBankSystemServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BloodBankSystemServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BloodBankSystemServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public farm.nurture.farm.service.proto.FindPasswordResponse executeFindPassword(farm.nurture.farm.service.proto.FindPasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecuteFindPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public farm.nurture.farm.service.proto.AddUserResponse executeAddUser(farm.nurture.farm.service.proto.AddUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecuteAddUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public farm.nurture.farm.service.proto.BulkAddUserResponse executeAddUserBulk(farm.nurture.farm.service.proto.BulkAddUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecuteAddUserBulkMethod(), getCallOptions(), request);
    }

    /**
     */
    public farm.nurture.farm.service.proto.FindBloodResponse executeFindBlood(farm.nurture.farm.service.proto.FindBloodRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecuteFindBloodMethod(), getCallOptions(), request);
    }

    /**
     */
    public farm.nurture.farm.service.proto.AddBloodResponse executeAddBlood(farm.nurture.farm.service.proto.AddBloodRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecuteAddBloodMethod(), getCallOptions(), request);
    }

    /**
     */
    public farm.nurture.farm.service.proto.BulkAddBloodResponse executeAddBloodBulk(farm.nurture.farm.service.proto.BulkAddBloodRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecuteAddBloodBulkMethod(), getCallOptions(), request);
    }

    /**
     */
    public farm.nurture.farm.service.proto.MultiResponses execute(farm.nurture.farm.service.proto.MultiRequests request) {
      return blockingUnaryCall(
          getChannel(), getExecuteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BloodBankSystemServiceFutureStub extends io.grpc.stub.AbstractStub<BloodBankSystemServiceFutureStub> {
    private BloodBankSystemServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BloodBankSystemServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BloodBankSystemServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BloodBankSystemServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<farm.nurture.farm.service.proto.FindPasswordResponse> executeFindPassword(
        farm.nurture.farm.service.proto.FindPasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteFindPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<farm.nurture.farm.service.proto.AddUserResponse> executeAddUser(
        farm.nurture.farm.service.proto.AddUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteAddUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<farm.nurture.farm.service.proto.BulkAddUserResponse> executeAddUserBulk(
        farm.nurture.farm.service.proto.BulkAddUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteAddUserBulkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<farm.nurture.farm.service.proto.FindBloodResponse> executeFindBlood(
        farm.nurture.farm.service.proto.FindBloodRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteFindBloodMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<farm.nurture.farm.service.proto.AddBloodResponse> executeAddBlood(
        farm.nurture.farm.service.proto.AddBloodRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteAddBloodMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<farm.nurture.farm.service.proto.BulkAddBloodResponse> executeAddBloodBulk(
        farm.nurture.farm.service.proto.BulkAddBloodRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteAddBloodBulkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<farm.nurture.farm.service.proto.MultiResponses> execute(
        farm.nurture.farm.service.proto.MultiRequests request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXECUTE_FIND_PASSWORD = 0;
  private static final int METHODID_EXECUTE_ADD_USER = 1;
  private static final int METHODID_EXECUTE_ADD_USER_BULK = 2;
  private static final int METHODID_EXECUTE_FIND_BLOOD = 3;
  private static final int METHODID_EXECUTE_ADD_BLOOD = 4;
  private static final int METHODID_EXECUTE_ADD_BLOOD_BULK = 5;
  private static final int METHODID_EXECUTE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BloodBankSystemServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BloodBankSystemServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE_FIND_PASSWORD:
          serviceImpl.executeFindPassword((farm.nurture.farm.service.proto.FindPasswordRequest) request,
              (io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.FindPasswordResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_ADD_USER:
          serviceImpl.executeAddUser((farm.nurture.farm.service.proto.AddUserRequest) request,
              (io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.AddUserResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_ADD_USER_BULK:
          serviceImpl.executeAddUserBulk((farm.nurture.farm.service.proto.BulkAddUserRequest) request,
              (io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.BulkAddUserResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_FIND_BLOOD:
          serviceImpl.executeFindBlood((farm.nurture.farm.service.proto.FindBloodRequest) request,
              (io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.FindBloodResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_ADD_BLOOD:
          serviceImpl.executeAddBlood((farm.nurture.farm.service.proto.AddBloodRequest) request,
              (io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.AddBloodResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_ADD_BLOOD_BULK:
          serviceImpl.executeAddBloodBulk((farm.nurture.farm.service.proto.BulkAddBloodRequest) request,
              (io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.BulkAddBloodResponse>) responseObserver);
          break;
        case METHODID_EXECUTE:
          serviceImpl.execute((farm.nurture.farm.service.proto.MultiRequests) request,
              (io.grpc.stub.StreamObserver<farm.nurture.farm.service.proto.MultiResponses>) responseObserver);
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

  private static abstract class BloodBankSystemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BloodBankSystemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BloodBankSystemService");
    }
  }

  private static final class BloodBankSystemServiceFileDescriptorSupplier
      extends BloodBankSystemServiceBaseDescriptorSupplier {
    BloodBankSystemServiceFileDescriptorSupplier() {}
  }

  private static final class BloodBankSystemServiceMethodDescriptorSupplier
      extends BloodBankSystemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BloodBankSystemServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BloodBankSystemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BloodBankSystemServiceFileDescriptorSupplier())
              .addMethod(getExecuteFindPasswordMethod())
              .addMethod(getExecuteAddUserMethod())
              .addMethod(getExecuteAddUserBulkMethod())
              .addMethod(getExecuteFindBloodMethod())
              .addMethod(getExecuteAddBloodMethod())
              .addMethod(getExecuteAddBloodBulkMethod())
              .addMethod(getExecuteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
