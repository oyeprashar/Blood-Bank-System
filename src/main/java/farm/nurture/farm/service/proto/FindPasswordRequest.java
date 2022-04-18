// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blood_bank_system_service.proto

package farm.nurture.farm.service.proto;

/**
 * <pre>
 * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ 
 *FindPassword					
 *^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ 
 * </pre>
 *
 * Protobuf type {@code farm.nurture.core.contracts.BloodBankSystemService.FindPasswordRequest}
 */
public  final class FindPasswordRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:farm.nurture.core.contracts.BloodBankSystemService.FindPasswordRequest)
    FindPasswordRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FindPasswordRequest.newBuilder() to construct.
  private FindPasswordRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FindPasswordRequest() {
    isStaleAllowed_ = false;
    id_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FindPasswordRequest(
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
            farm.nurture.farm.service.proto.RequestHeaders.Builder subBuilder = null;
            if (requestHeaders_ != null) {
              subBuilder = requestHeaders_.toBuilder();
            }
            requestHeaders_ = input.readMessage(farm.nurture.farm.service.proto.RequestHeaders.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(requestHeaders_);
              requestHeaders_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            isStaleAllowed_ = input.readBool();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.internal_static_farm_nurture_core_contracts_BloodBankSystemService_FindPasswordRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.internal_static_farm_nurture_core_contracts_BloodBankSystemService_FindPasswordRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            farm.nurture.farm.service.proto.FindPasswordRequest.class, farm.nurture.farm.service.proto.FindPasswordRequest.Builder.class);
  }

  public static final int REQUESTHEADERS_FIELD_NUMBER = 1;
  private farm.nurture.farm.service.proto.RequestHeaders requestHeaders_;
  /**
   * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders requestHeaders = 1;</code>
   */
  public boolean hasRequestHeaders() {
    return requestHeaders_ != null;
  }
  /**
   * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders requestHeaders = 1;</code>
   */
  public farm.nurture.farm.service.proto.RequestHeaders getRequestHeaders() {
    return requestHeaders_ == null ? farm.nurture.farm.service.proto.RequestHeaders.getDefaultInstance() : requestHeaders_;
  }
  /**
   * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders requestHeaders = 1;</code>
   */
  public farm.nurture.farm.service.proto.RequestHeadersOrBuilder getRequestHeadersOrBuilder() {
    return getRequestHeaders();
  }

  public static final int ISSTALEALLOWED_FIELD_NUMBER = 2;
  private boolean isStaleAllowed_;
  /**
   * <code>bool isStaleAllowed = 2;</code>
   */
  public boolean getIsStaleAllowed() {
    return isStaleAllowed_;
  }

  public static final int ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 3;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (requestHeaders_ != null) {
      output.writeMessage(1, getRequestHeaders());
    }
    if (isStaleAllowed_ != false) {
      output.writeBool(2, isStaleAllowed_);
    }
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, id_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestHeaders_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRequestHeaders());
    }
    if (isStaleAllowed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isStaleAllowed_);
    }
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, id_);
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
    if (!(obj instanceof farm.nurture.farm.service.proto.FindPasswordRequest)) {
      return super.equals(obj);
    }
    farm.nurture.farm.service.proto.FindPasswordRequest other = (farm.nurture.farm.service.proto.FindPasswordRequest) obj;

    boolean result = true;
    result = result && (hasRequestHeaders() == other.hasRequestHeaders());
    if (hasRequestHeaders()) {
      result = result && getRequestHeaders()
          .equals(other.getRequestHeaders());
    }
    result = result && (getIsStaleAllowed()
        == other.getIsStaleAllowed());
    result = result && getId()
        .equals(other.getId());
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
    if (hasRequestHeaders()) {
      hash = (37 * hash) + REQUESTHEADERS_FIELD_NUMBER;
      hash = (53 * hash) + getRequestHeaders().hashCode();
    }
    hash = (37 * hash) + ISSTALEALLOWED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsStaleAllowed());
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static farm.nurture.farm.service.proto.FindPasswordRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static farm.nurture.farm.service.proto.FindPasswordRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static farm.nurture.farm.service.proto.FindPasswordRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static farm.nurture.farm.service.proto.FindPasswordRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static farm.nurture.farm.service.proto.FindPasswordRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static farm.nurture.farm.service.proto.FindPasswordRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static farm.nurture.farm.service.proto.FindPasswordRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static farm.nurture.farm.service.proto.FindPasswordRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static farm.nurture.farm.service.proto.FindPasswordRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static farm.nurture.farm.service.proto.FindPasswordRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static farm.nurture.farm.service.proto.FindPasswordRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static farm.nurture.farm.service.proto.FindPasswordRequest parseFrom(
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
  public static Builder newBuilder(farm.nurture.farm.service.proto.FindPasswordRequest prototype) {
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
   *FindPassword					
   *^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ 
   * </pre>
   *
   * Protobuf type {@code farm.nurture.core.contracts.BloodBankSystemService.FindPasswordRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:farm.nurture.core.contracts.BloodBankSystemService.FindPasswordRequest)
      farm.nurture.farm.service.proto.FindPasswordRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.internal_static_farm_nurture_core_contracts_BloodBankSystemService_FindPasswordRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.internal_static_farm_nurture_core_contracts_BloodBankSystemService_FindPasswordRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              farm.nurture.farm.service.proto.FindPasswordRequest.class, farm.nurture.farm.service.proto.FindPasswordRequest.Builder.class);
    }

    // Construct using farm.nurture.farm.service.proto.FindPasswordRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (requestHeadersBuilder_ == null) {
        requestHeaders_ = null;
      } else {
        requestHeaders_ = null;
        requestHeadersBuilder_ = null;
      }
      isStaleAllowed_ = false;

      id_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.internal_static_farm_nurture_core_contracts_BloodBankSystemService_FindPasswordRequest_descriptor;
    }

    @java.lang.Override
    public farm.nurture.farm.service.proto.FindPasswordRequest getDefaultInstanceForType() {
      return farm.nurture.farm.service.proto.FindPasswordRequest.getDefaultInstance();
    }

    @java.lang.Override
    public farm.nurture.farm.service.proto.FindPasswordRequest build() {
      farm.nurture.farm.service.proto.FindPasswordRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public farm.nurture.farm.service.proto.FindPasswordRequest buildPartial() {
      farm.nurture.farm.service.proto.FindPasswordRequest result = new farm.nurture.farm.service.proto.FindPasswordRequest(this);
      if (requestHeadersBuilder_ == null) {
        result.requestHeaders_ = requestHeaders_;
      } else {
        result.requestHeaders_ = requestHeadersBuilder_.build();
      }
      result.isStaleAllowed_ = isStaleAllowed_;
      result.id_ = id_;
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
      if (other instanceof farm.nurture.farm.service.proto.FindPasswordRequest) {
        return mergeFrom((farm.nurture.farm.service.proto.FindPasswordRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(farm.nurture.farm.service.proto.FindPasswordRequest other) {
      if (other == farm.nurture.farm.service.proto.FindPasswordRequest.getDefaultInstance()) return this;
      if (other.hasRequestHeaders()) {
        mergeRequestHeaders(other.getRequestHeaders());
      }
      if (other.getIsStaleAllowed() != false) {
        setIsStaleAllowed(other.getIsStaleAllowed());
      }
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
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
      farm.nurture.farm.service.proto.FindPasswordRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (farm.nurture.farm.service.proto.FindPasswordRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private farm.nurture.farm.service.proto.RequestHeaders requestHeaders_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        farm.nurture.farm.service.proto.RequestHeaders, farm.nurture.farm.service.proto.RequestHeaders.Builder, farm.nurture.farm.service.proto.RequestHeadersOrBuilder> requestHeadersBuilder_;
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders requestHeaders = 1;</code>
     */
    public boolean hasRequestHeaders() {
      return requestHeadersBuilder_ != null || requestHeaders_ != null;
    }
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders requestHeaders = 1;</code>
     */
    public farm.nurture.farm.service.proto.RequestHeaders getRequestHeaders() {
      if (requestHeadersBuilder_ == null) {
        return requestHeaders_ == null ? farm.nurture.farm.service.proto.RequestHeaders.getDefaultInstance() : requestHeaders_;
      } else {
        return requestHeadersBuilder_.getMessage();
      }
    }
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders requestHeaders = 1;</code>
     */
    public Builder setRequestHeaders(farm.nurture.farm.service.proto.RequestHeaders value) {
      if (requestHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        requestHeaders_ = value;
        onChanged();
      } else {
        requestHeadersBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders requestHeaders = 1;</code>
     */
    public Builder setRequestHeaders(
        farm.nurture.farm.service.proto.RequestHeaders.Builder builderForValue) {
      if (requestHeadersBuilder_ == null) {
        requestHeaders_ = builderForValue.build();
        onChanged();
      } else {
        requestHeadersBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders requestHeaders = 1;</code>
     */
    public Builder mergeRequestHeaders(farm.nurture.farm.service.proto.RequestHeaders value) {
      if (requestHeadersBuilder_ == null) {
        if (requestHeaders_ != null) {
          requestHeaders_ =
            farm.nurture.farm.service.proto.RequestHeaders.newBuilder(requestHeaders_).mergeFrom(value).buildPartial();
        } else {
          requestHeaders_ = value;
        }
        onChanged();
      } else {
        requestHeadersBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders requestHeaders = 1;</code>
     */
    public Builder clearRequestHeaders() {
      if (requestHeadersBuilder_ == null) {
        requestHeaders_ = null;
        onChanged();
      } else {
        requestHeaders_ = null;
        requestHeadersBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders requestHeaders = 1;</code>
     */
    public farm.nurture.farm.service.proto.RequestHeaders.Builder getRequestHeadersBuilder() {
      
      onChanged();
      return getRequestHeadersFieldBuilder().getBuilder();
    }
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders requestHeaders = 1;</code>
     */
    public farm.nurture.farm.service.proto.RequestHeadersOrBuilder getRequestHeadersOrBuilder() {
      if (requestHeadersBuilder_ != null) {
        return requestHeadersBuilder_.getMessageOrBuilder();
      } else {
        return requestHeaders_ == null ?
            farm.nurture.farm.service.proto.RequestHeaders.getDefaultInstance() : requestHeaders_;
      }
    }
    /**
     * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders requestHeaders = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        farm.nurture.farm.service.proto.RequestHeaders, farm.nurture.farm.service.proto.RequestHeaders.Builder, farm.nurture.farm.service.proto.RequestHeadersOrBuilder> 
        getRequestHeadersFieldBuilder() {
      if (requestHeadersBuilder_ == null) {
        requestHeadersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            farm.nurture.farm.service.proto.RequestHeaders, farm.nurture.farm.service.proto.RequestHeaders.Builder, farm.nurture.farm.service.proto.RequestHeadersOrBuilder>(
                getRequestHeaders(),
                getParentForChildren(),
                isClean());
        requestHeaders_ = null;
      }
      return requestHeadersBuilder_;
    }

    private boolean isStaleAllowed_ ;
    /**
     * <code>bool isStaleAllowed = 2;</code>
     */
    public boolean getIsStaleAllowed() {
      return isStaleAllowed_;
    }
    /**
     * <code>bool isStaleAllowed = 2;</code>
     */
    public Builder setIsStaleAllowed(boolean value) {
      
      isStaleAllowed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isStaleAllowed = 2;</code>
     */
    public Builder clearIsStaleAllowed() {
      
      isStaleAllowed_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 3;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 3;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 3;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 3;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:farm.nurture.core.contracts.BloodBankSystemService.FindPasswordRequest)
  }

  // @@protoc_insertion_point(class_scope:farm.nurture.core.contracts.BloodBankSystemService.FindPasswordRequest)
  private static final farm.nurture.farm.service.proto.FindPasswordRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new farm.nurture.farm.service.proto.FindPasswordRequest();
  }

  public static farm.nurture.farm.service.proto.FindPasswordRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindPasswordRequest>
      PARSER = new com.google.protobuf.AbstractParser<FindPasswordRequest>() {
    @java.lang.Override
    public FindPasswordRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FindPasswordRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FindPasswordRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindPasswordRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public farm.nurture.farm.service.proto.FindPasswordRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

