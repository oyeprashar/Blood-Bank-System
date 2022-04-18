// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blood_bank_system_service.proto

package farm.nurture.farm.service.proto;

/**
 * <pre>
 * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ 
 *Multi Queries 					
 *^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ 
 * </pre>
 *
 * Protobuf type {@code farm.nurture.core.contracts.BloodBankSystemService.MultiRequests}
 */
public  final class MultiRequests extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:farm.nurture.core.contracts.BloodBankSystemService.MultiRequests)
    MultiRequestsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiRequests.newBuilder() to construct.
  private MultiRequests(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiRequests() {
    onTxn_ = false;
    request_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiRequests(
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
          case 8: {

            onTxn_ = input.readBool();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              request_ = new java.util.ArrayList<farm.nurture.farm.service.proto.Request>();
              mutable_bitField0_ |= 0x00000002;
            }
            request_.add(
                input.readMessage(farm.nurture.farm.service.proto.Request.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        request_ = java.util.Collections.unmodifiableList(request_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.internal_static_farm_nurture_core_contracts_BloodBankSystemService_MultiRequests_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.internal_static_farm_nurture_core_contracts_BloodBankSystemService_MultiRequests_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            farm.nurture.farm.service.proto.MultiRequests.class, farm.nurture.farm.service.proto.MultiRequests.Builder.class);
  }

  private int bitField0_;
  public static final int ONTXN_FIELD_NUMBER = 1;
  private boolean onTxn_;
  /**
   * <code>bool onTxn = 1;</code>
   */
  public boolean getOnTxn() {
    return onTxn_;
  }

  public static final int REQUEST_FIELD_NUMBER = 2;
  private java.util.List<farm.nurture.farm.service.proto.Request> request_;
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
   */
  public java.util.List<farm.nurture.farm.service.proto.Request> getRequestList() {
    return request_;
  }
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
   */
  public java.util.List<? extends farm.nurture.farm.service.proto.RequestOrBuilder> 
      getRequestOrBuilderList() {
    return request_;
  }
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
   */
  public int getRequestCount() {
    return request_.size();
  }
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
   */
  public farm.nurture.farm.service.proto.Request getRequest(int index) {
    return request_.get(index);
  }
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
   */
  public farm.nurture.farm.service.proto.RequestOrBuilder getRequestOrBuilder(
      int index) {
    return request_.get(index);
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
    if (onTxn_ != false) {
      output.writeBool(1, onTxn_);
    }
    for (int i = 0; i < request_.size(); i++) {
      output.writeMessage(2, request_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (onTxn_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, onTxn_);
    }
    for (int i = 0; i < request_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, request_.get(i));
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
    if (!(obj instanceof farm.nurture.farm.service.proto.MultiRequests)) {
      return super.equals(obj);
    }
    farm.nurture.farm.service.proto.MultiRequests other = (farm.nurture.farm.service.proto.MultiRequests) obj;

    boolean result = true;
    result = result && (getOnTxn()
        == other.getOnTxn());
    result = result && getRequestList()
        .equals(other.getRequestList());
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
    hash = (37 * hash) + ONTXN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOnTxn());
    if (getRequestCount() > 0) {
      hash = (37 * hash) + REQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getRequestList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static farm.nurture.farm.service.proto.MultiRequests parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static farm.nurture.farm.service.proto.MultiRequests parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static farm.nurture.farm.service.proto.MultiRequests parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static farm.nurture.farm.service.proto.MultiRequests parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static farm.nurture.farm.service.proto.MultiRequests parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static farm.nurture.farm.service.proto.MultiRequests parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static farm.nurture.farm.service.proto.MultiRequests parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static farm.nurture.farm.service.proto.MultiRequests parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static farm.nurture.farm.service.proto.MultiRequests parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static farm.nurture.farm.service.proto.MultiRequests parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static farm.nurture.farm.service.proto.MultiRequests parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static farm.nurture.farm.service.proto.MultiRequests parseFrom(
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
  public static Builder newBuilder(farm.nurture.farm.service.proto.MultiRequests prototype) {
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
   * <pre>
   * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ 
   *Multi Queries 					
   *^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ 
   * </pre>
   *
   * Protobuf type {@code farm.nurture.core.contracts.BloodBankSystemService.MultiRequests}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:farm.nurture.core.contracts.BloodBankSystemService.MultiRequests)
      farm.nurture.farm.service.proto.MultiRequestsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.internal_static_farm_nurture_core_contracts_BloodBankSystemService_MultiRequests_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.internal_static_farm_nurture_core_contracts_BloodBankSystemService_MultiRequests_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              farm.nurture.farm.service.proto.MultiRequests.class, farm.nurture.farm.service.proto.MultiRequests.Builder.class);
    }

    // Construct using farm.nurture.farm.service.proto.MultiRequests.newBuilder()
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
        getRequestFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      onTxn_ = false;

      if (requestBuilder_ == null) {
        request_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        requestBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.internal_static_farm_nurture_core_contracts_BloodBankSystemService_MultiRequests_descriptor;
    }

    @java.lang.Override
    public farm.nurture.farm.service.proto.MultiRequests getDefaultInstanceForType() {
      return farm.nurture.farm.service.proto.MultiRequests.getDefaultInstance();
    }

    @java.lang.Override
    public farm.nurture.farm.service.proto.MultiRequests build() {
      farm.nurture.farm.service.proto.MultiRequests result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public farm.nurture.farm.service.proto.MultiRequests buildPartial() {
      farm.nurture.farm.service.proto.MultiRequests result = new farm.nurture.farm.service.proto.MultiRequests(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.onTxn_ = onTxn_;
      if (requestBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          request_ = java.util.Collections.unmodifiableList(request_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.request_ = request_;
      } else {
        result.request_ = requestBuilder_.build();
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
      if (other instanceof farm.nurture.farm.service.proto.MultiRequests) {
        return mergeFrom((farm.nurture.farm.service.proto.MultiRequests)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(farm.nurture.farm.service.proto.MultiRequests other) {
      if (other == farm.nurture.farm.service.proto.MultiRequests.getDefaultInstance()) return this;
      if (other.getOnTxn() != false) {
        setOnTxn(other.getOnTxn());
      }
      if (requestBuilder_ == null) {
        if (!other.request_.isEmpty()) {
          if (request_.isEmpty()) {
            request_ = other.request_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRequestIsMutable();
            request_.addAll(other.request_);
          }
          onChanged();
        }
      } else {
        if (!other.request_.isEmpty()) {
          if (requestBuilder_.isEmpty()) {
            requestBuilder_.dispose();
            requestBuilder_ = null;
            request_ = other.request_;
            bitField0_ = (bitField0_ & ~0x00000002);
            requestBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRequestFieldBuilder() : null;
          } else {
            requestBuilder_.addAllMessages(other.request_);
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
      farm.nurture.farm.service.proto.MultiRequests parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (farm.nurture.farm.service.proto.MultiRequests) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean onTxn_ ;
    /**
     * <code>bool onTxn = 1;</code>
     */
    public boolean getOnTxn() {
      return onTxn_;
    }
    /**
     * <code>bool onTxn = 1;</code>
     */
    public Builder setOnTxn(boolean value) {
      
      onTxn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool onTxn = 1;</code>
     */
    public Builder clearOnTxn() {
      
      onTxn_ = false;
      onChanged();
      return this;
    }

    private java.util.List<farm.nurture.farm.service.proto.Request> request_ =
      java.util.Collections.emptyList();
    private void ensureRequestIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        request_ = new java.util.ArrayList<farm.nurture.farm.service.proto.Request>(request_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        farm.nurture.farm.service.proto.Request, farm.nurture.farm.service.proto.Request.Builder, farm.nurture.farm.service.proto.RequestOrBuilder> requestBuilder_;

    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public java.util.List<farm.nurture.farm.service.proto.Request> getRequestList() {
      if (requestBuilder_ == null) {
        return java.util.Collections.unmodifiableList(request_);
      } else {
        return requestBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public int getRequestCount() {
      if (requestBuilder_ == null) {
        return request_.size();
      } else {
        return requestBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public farm.nurture.farm.service.proto.Request getRequest(int index) {
      if (requestBuilder_ == null) {
        return request_.get(index);
      } else {
        return requestBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public Builder setRequest(
        int index, farm.nurture.farm.service.proto.Request value) {
      if (requestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestIsMutable();
        request_.set(index, value);
        onChanged();
      } else {
        requestBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public Builder setRequest(
        int index, farm.nurture.farm.service.proto.Request.Builder builderForValue) {
      if (requestBuilder_ == null) {
        ensureRequestIsMutable();
        request_.set(index, builderForValue.build());
        onChanged();
      } else {
        requestBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public Builder addRequest(farm.nurture.farm.service.proto.Request value) {
      if (requestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestIsMutable();
        request_.add(value);
        onChanged();
      } else {
        requestBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public Builder addRequest(
        int index, farm.nurture.farm.service.proto.Request value) {
      if (requestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestIsMutable();
        request_.add(index, value);
        onChanged();
      } else {
        requestBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public Builder addRequest(
        farm.nurture.farm.service.proto.Request.Builder builderForValue) {
      if (requestBuilder_ == null) {
        ensureRequestIsMutable();
        request_.add(builderForValue.build());
        onChanged();
      } else {
        requestBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public Builder addRequest(
        int index, farm.nurture.farm.service.proto.Request.Builder builderForValue) {
      if (requestBuilder_ == null) {
        ensureRequestIsMutable();
        request_.add(index, builderForValue.build());
        onChanged();
      } else {
        requestBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public Builder addAllRequest(
        java.lang.Iterable<? extends farm.nurture.farm.service.proto.Request> values) {
      if (requestBuilder_ == null) {
        ensureRequestIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, request_);
        onChanged();
      } else {
        requestBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public Builder clearRequest() {
      if (requestBuilder_ == null) {
        request_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        requestBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public Builder removeRequest(int index) {
      if (requestBuilder_ == null) {
        ensureRequestIsMutable();
        request_.remove(index);
        onChanged();
      } else {
        requestBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public farm.nurture.farm.service.proto.Request.Builder getRequestBuilder(
        int index) {
      return getRequestFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public farm.nurture.farm.service.proto.RequestOrBuilder getRequestOrBuilder(
        int index) {
      if (requestBuilder_ == null) {
        return request_.get(index);  } else {
        return requestBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public java.util.List<? extends farm.nurture.farm.service.proto.RequestOrBuilder> 
         getRequestOrBuilderList() {
      if (requestBuilder_ != null) {
        return requestBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(request_);
      }
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public farm.nurture.farm.service.proto.Request.Builder addRequestBuilder() {
      return getRequestFieldBuilder().addBuilder(
          farm.nurture.farm.service.proto.Request.getDefaultInstance());
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public farm.nurture.farm.service.proto.Request.Builder addRequestBuilder(
        int index) {
      return getRequestFieldBuilder().addBuilder(
          index, farm.nurture.farm.service.proto.Request.getDefaultInstance());
    }
    /**
     * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Request request = 2;</code>
     */
    public java.util.List<farm.nurture.farm.service.proto.Request.Builder> 
         getRequestBuilderList() {
      return getRequestFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        farm.nurture.farm.service.proto.Request, farm.nurture.farm.service.proto.Request.Builder, farm.nurture.farm.service.proto.RequestOrBuilder> 
        getRequestFieldBuilder() {
      if (requestBuilder_ == null) {
        requestBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            farm.nurture.farm.service.proto.Request, farm.nurture.farm.service.proto.Request.Builder, farm.nurture.farm.service.proto.RequestOrBuilder>(
                request_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        request_ = null;
      }
      return requestBuilder_;
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


    // @@protoc_insertion_point(builder_scope:farm.nurture.core.contracts.BloodBankSystemService.MultiRequests)
  }

  // @@protoc_insertion_point(class_scope:farm.nurture.core.contracts.BloodBankSystemService.MultiRequests)
  private static final farm.nurture.farm.service.proto.MultiRequests DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new farm.nurture.farm.service.proto.MultiRequests();
  }

  public static farm.nurture.farm.service.proto.MultiRequests getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiRequests>
      PARSER = new com.google.protobuf.AbstractParser<MultiRequests>() {
    @java.lang.Override
    public MultiRequests parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiRequests(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiRequests> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiRequests> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public farm.nurture.farm.service.proto.MultiRequests getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
