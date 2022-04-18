// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blood_bank_system_service.proto

package farm.nurture.farm.service.proto;

/**
 * Protobuf type {@code farm.nurture.core.contracts.BloodBankSystemService.BulkAddUserResponse}
 */
public  final class BulkAddUserResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:farm.nurture.core.contracts.BloodBankSystemService.BulkAddUserResponse)
    BulkAddUserResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BulkAddUserResponse.newBuilder() to construct.
  private BulkAddUserResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BulkAddUserResponse() {
    count_ = 0;
    responses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BulkAddUserResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            farm.nurture.farm.service.proto.Status.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(farm.nurture.farm.service.proto.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            count_ = input.readInt32();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              responses_ = new java.util.ArrayList<farm.nurture.farm.service.proto.AddUserResponse>();
              mutable_bitField0_ |= 0x00000004;
            }
            responses_.add(
                input.readMessage(farm.nurture.farm.service.proto.AddUserResponse.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        responses_ = java.util.Collections.unmodifiableList(responses_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.internal_static_farm_nurture_core_contracts_BloodBankSystemService_BulkAddUserResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.internal_static_farm_nurture_core_contracts_BloodBankSystemService_BulkAddUserResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            farm.nurture.farm.service.proto.BulkAddUserResponse.class, farm.nurture.farm.service.proto.BulkAddUserResponse.Builder.class);
  }

  private int bitField0_;
  public static final int STATUS_FIELD_NUMBER = 1;
  private farm.nurture.farm.service.proto.Status status_;
  /**
   * <code>.farm.nurture.core.contracts.BloodBankSystemService.Status status = 1;</code>
   */
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <code>.farm.nurture.core.contracts.BloodBankSystemService.Status status = 1;</code>
   */
  public farm.nurture.farm.service.proto.Status getStatus() {
    return status_ == null ? farm.nurture.farm.service.proto.Status.getDefaultInstance() : status_;
  }
  /**
   * <code>.farm.nurture.core.contracts.BloodBankSystemService.Status status = 1;</code>
   */
  public farm.nurture.farm.service.proto.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_;
  /**
   * <code>int32 count = 2;</code>
   */
  public int getCount() {
    return count_;
  }

  public static final int RESPONSES_FIELD_NUMBER = 3;
  private java.util.List<farm.nurture.farm.service.proto.AddUserResponse> responses_;
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
   */
  public java.util.List<farm.nurture.farm.service.proto.AddUserResponse> getResponsesList() {
    return responses_;
  }
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
   */
  public java.util.List<? extends farm.nurture.farm.service.proto.AddUserResponseOrBuilder> 
      getResponsesOrBuilderList() {
    return responses_;
  }
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
   */
  public int getResponsesCount() {
    return responses_.size();
  }
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
   */
  public farm.nurture.farm.service.proto.AddUserResponse getResponses(int index) {
    return responses_.get(index);
  }
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
   */
  public farm.nurture.farm.service.proto.AddUserResponseOrBuilder getResponsesOrBuilder(
      int index) {
    return responses_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (status_ != null) {
      output.writeMessage(1, getStatus());
    }
    if (count_ != 0) {
      output.writeInt32(2, count_);
    }
    for (int i = 0; i < responses_.size(); i++) {
      output.writeMessage(3, responses_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStatus());
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, count_);
    }
    for (int i = 0; i < responses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, responses_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof farm.nurture.farm.service.proto.BulkAddUserResponse)) {
      return super.equals(obj);
    }
    farm.nurture.farm.service.proto.BulkAddUserResponse other = (farm.nurture.farm.service.proto.BulkAddUserResponse) obj;

    boolean result = true;
    result = result && (hasStatus() == other.hasStatus());
    if (hasStatus()) {
      result = result && getStatus()
          .equals(other.getStatus());
    }
    result = result && (getCount()
        == other.getCount());
    result = result && getResponsesList()
        .equals(other.getResponsesList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    if (getResponsesCount() > 0) {
      hash = (37 * hash) + RESPONSES_FIELD_NUMBER;
      hash = (53 * hash) + getResponsesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static farm.nurture.farm.service.proto.BulkAddUserResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static farm.nurture.farm.service.proto.BulkAddUserResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static farm.nurture.farm.service.proto.BulkAddUserResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static farm.nurture.farm.service.proto.BulkAddUserResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static farm.nurture.farm.service.proto.BulkAddUserResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static farm.nurture.farm.service.proto.BulkAddUserResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static farm.nurture.farm.service.proto.BulkAddUserResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static farm.nurture.farm.service.proto.BulkAddUserResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static farm.nurture.farm.service.proto.BulkAddUserResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static farm.nurture.farm.service.proto.BulkAddUserResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static farm.nurture.farm.service.proto.BulkAddUserResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static farm.nurture.farm.service.proto.BulkAddUserResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(farm.nurture.farm.service.proto.BulkAddUserResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code farm.nurture.core.contracts.BloodBankSystemService.BulkAddUserResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:farm.nurture.core.contracts.BloodBankSystemService.BulkAddUserResponse)
      farm.nurture.farm.service.proto.BulkAddUserResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.internal_static_farm_nurture_core_contracts_BloodBankSystemService_BulkAddUserResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.internal_static_farm_nurture_core_contracts_BloodBankSystemService_BulkAddUserResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              farm.nurture.farm.service.proto.BulkAddUserResponse.class, farm.nurture.farm.service.proto.BulkAddUserResponse.Builder.class);
    }

    // Construct using farm.nurture.farm.service.proto.BulkAddUserResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getResponsesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      count_ = 0;

      if (responsesBuilder_ == null) {
        responses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        responsesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.internal_static_farm_nurture_core_contracts_BloodBankSystemService_BulkAddUserResponse_descriptor;
    }

    @java.lang.Override
    public farm.nurture.farm.service.proto.BulkAddUserResponse getDefaultInstanceForType() {
      return farm.nurture.farm.service.proto.BulkAddUserResponse.getDefaultInstance();
    }

    @java.lang.Override
    public farm.nurture.farm.service.proto.BulkAddUserResponse build() {
      farm.nurture.farm.service.proto.BulkAddUserResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public farm.nurture.farm.service.proto.BulkAddUserResponse buildPartial() {
      farm.nurture.farm.service.proto.BulkAddUserResponse result = new farm.nurture.farm.service.proto.BulkAddUserResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      result.count_ = count_;
      if (responsesBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          responses_ = java.util.Collections.unmodifiableList(responses_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.responses_ = responses_;
      } else {
        result.responses_ = responsesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof farm.nurture.farm.service.proto.BulkAddUserResponse) {
        return mergeFrom((farm.nurture.farm.service.proto.BulkAddUserResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(farm.nurture.farm.service.proto.BulkAddUserResponse other) {
      if (other == farm.nurture.farm.service.proto.BulkAddUserResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (responsesBuilder_ == null) {
        if (!other.responses_.isEmpty()) {
          if (responses_.isEmpty()) {
            responses_ = other.responses_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureResponsesIsMutable();
            responses_.addAll(other.responses_);
          }
          onChanged();
        }
      } else {
        if (!other.responses_.isEmpty()) {
          if (responsesBuilder_.isEmpty()) {
            responsesBuilder_.dispose();
            responsesBuilder_ = null;
            responses_ = other.responses_;
            bitField0_ = (bitField0_ & ~0x00000004);
            responsesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResponsesFieldBuilder() : null;
          } else {
            responsesBuilder_.addAllMessages(other.responses_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      farm.nurture.farm.service.proto.BulkAddUserResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (farm.nurture.farm.service.proto.BulkAddUserResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private farm.nurture.farm.service.proto.Status status_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        farm.nurture.farm.service.proto.Status, farm.nurture.farm.service.proto.Status.Builder, farm.nurture.farm.service.proto.StatusOrBuilder> statusBuilder_;
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.Status status = 1;</code>
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.Status status = 1;</code>
     */
    public farm.nurture.farm.service.proto.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? farm.nurture.farm.service.proto.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.Status status = 1;</code>
     */
    public Builder setStatus(farm.nurture.farm.service.proto.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.Status status = 1;</code>
     */
    public Builder setStatus(
        farm.nurture.farm.service.proto.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.Status status = 1;</code>
     */
    public Builder mergeStatus(farm.nurture.farm.service.proto.Status value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            farm.nurture.farm.service.proto.Status.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.Status status = 1;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.Status status = 1;</code>
     */
    public farm.nurture.farm.service.proto.Status.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.Status status = 1;</code>
     */
    public farm.nurture.farm.service.proto.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            farm.nurture.farm.service.proto.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.Status status = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        farm.nurture.farm.service.proto.Status, farm.nurture.farm.service.proto.Status.Builder, farm.nurture.farm.service.proto.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            farm.nurture.farm.service.proto.Status, farm.nurture.farm.service.proto.Status.Builder, farm.nurture.farm.service.proto.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    private int count_ ;
    /**
     * <code>int32 count = 2;</code>
     */
    public int getCount() {
      return count_;
    }
    /**
     * <code>int32 count = 2;</code>
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 count = 2;</code>
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<farm.nurture.farm.service.proto.AddUserResponse> responses_ =
      java.util.Collections.emptyList();
    private void ensureResponsesIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        responses_ = new java.util.ArrayList<farm.nurture.farm.service.proto.AddUserResponse>(responses_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        farm.nurture.farm.service.proto.AddUserResponse, farm.nurture.farm.service.proto.AddUserResponse.Builder, farm.nurture.farm.service.proto.AddUserResponseOrBuilder> responsesBuilder_;

    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public java.util.List<farm.nurture.farm.service.proto.AddUserResponse> getResponsesList() {
      if (responsesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(responses_);
      } else {
        return responsesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public int getResponsesCount() {
      if (responsesBuilder_ == null) {
        return responses_.size();
      } else {
        return responsesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public farm.nurture.farm.service.proto.AddUserResponse getResponses(int index) {
      if (responsesBuilder_ == null) {
        return responses_.get(index);
      } else {
        return responsesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public Builder setResponses(
        int index, farm.nurture.farm.service.proto.AddUserResponse value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.set(index, value);
        onChanged();
      } else {
        responsesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public Builder setResponses(
        int index, farm.nurture.farm.service.proto.AddUserResponse.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.set(index, builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public Builder addResponses(farm.nurture.farm.service.proto.AddUserResponse value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.add(value);
        onChanged();
      } else {
        responsesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public Builder addResponses(
        int index, farm.nurture.farm.service.proto.AddUserResponse value) {
      if (responsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResponsesIsMutable();
        responses_.add(index, value);
        onChanged();
      } else {
        responsesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public Builder addResponses(
        farm.nurture.farm.service.proto.AddUserResponse.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.add(builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public Builder addResponses(
        int index, farm.nurture.farm.service.proto.AddUserResponse.Builder builderForValue) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.add(index, builderForValue.build());
        onChanged();
      } else {
        responsesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public Builder addAllResponses(
        java.lang.Iterable<? extends farm.nurture.farm.service.proto.AddUserResponse> values) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, responses_);
        onChanged();
      } else {
        responsesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public Builder clearResponses() {
      if (responsesBuilder_ == null) {
        responses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        responsesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public Builder removeResponses(int index) {
      if (responsesBuilder_ == null) {
        ensureResponsesIsMutable();
        responses_.remove(index);
        onChanged();
      } else {
        responsesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public farm.nurture.farm.service.proto.AddUserResponse.Builder getResponsesBuilder(
        int index) {
      return getResponsesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public farm.nurture.farm.service.proto.AddUserResponseOrBuilder getResponsesOrBuilder(
        int index) {
      if (responsesBuilder_ == null) {
        return responses_.get(index);  } else {
        return responsesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public java.util.List<? extends farm.nurture.farm.service.proto.AddUserResponseOrBuilder> 
         getResponsesOrBuilderList() {
      if (responsesBuilder_ != null) {
        return responsesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(responses_);
      }
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public farm.nurture.farm.service.proto.AddUserResponse.Builder addResponsesBuilder() {
      return getResponsesFieldBuilder().addBuilder(
          farm.nurture.farm.service.proto.AddUserResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public farm.nurture.farm.service.proto.AddUserResponse.Builder addResponsesBuilder(
        int index) {
      return getResponsesFieldBuilder().addBuilder(
          index, farm.nurture.farm.service.proto.AddUserResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserResponse responses = 3;</code>
     */
    public java.util.List<farm.nurture.farm.service.proto.AddUserResponse.Builder> 
         getResponsesBuilderList() {
      return getResponsesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        farm.nurture.farm.service.proto.AddUserResponse, farm.nurture.farm.service.proto.AddUserResponse.Builder, farm.nurture.farm.service.proto.AddUserResponseOrBuilder> 
        getResponsesFieldBuilder() {
      if (responsesBuilder_ == null) {
        responsesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            farm.nurture.farm.service.proto.AddUserResponse, farm.nurture.farm.service.proto.AddUserResponse.Builder, farm.nurture.farm.service.proto.AddUserResponseOrBuilder>(
                responses_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        responses_ = null;
      }
      return responsesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:farm.nurture.core.contracts.BloodBankSystemService.BulkAddUserResponse)
  }

  // @@protoc_insertion_point(class_scope:farm.nurture.core.contracts.BloodBankSystemService.BulkAddUserResponse)
  private static final farm.nurture.farm.service.proto.BulkAddUserResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new farm.nurture.farm.service.proto.BulkAddUserResponse();
  }

  public static farm.nurture.farm.service.proto.BulkAddUserResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BulkAddUserResponse>
      PARSER = new com.google.protobuf.AbstractParser<BulkAddUserResponse>() {
    @java.lang.Override
    public BulkAddUserResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BulkAddUserResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BulkAddUserResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BulkAddUserResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public farm.nurture.farm.service.proto.BulkAddUserResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

