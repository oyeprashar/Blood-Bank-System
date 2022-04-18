// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blood_bank_system_service.proto

package farm.nurture.farm.service.proto;

/**
 * Protobuf enum {@code farm.nurture.core.contracts.BloodBankSystemService.StatusCode}
 */
public enum StatusCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SUCCESS = 0;</code>
   */
  SUCCESS(0),
  /**
   * <code>NOT_FOUND = 1;</code>
   */
  NOT_FOUND(1),
  /**
   * <code>ZERO_RESULTS = 2;</code>
   */
  ZERO_RESULTS(2),
  /**
   * <code>DUPLICATE = 3;</code>
   */
  DUPLICATE(3),
  /**
   * <code>LIMIT_EXCEEDED = 4;</code>
   */
  LIMIT_EXCEEDED(4),
  /**
   * <code>INVALID_REQUEST = 5;</code>
   */
  INVALID_REQUEST(5),
  /**
   * <code>TEMPORARILY_SUSPENDED = 6;</code>
   */
  TEMPORARILY_SUSPENDED(6),
  /**
   * <code>OVER_USAGE_LIMIT = 7;</code>
   */
  OVER_USAGE_LIMIT(7),
  /**
   * <code>REQUEST_DENIED = 8;</code>
   */
  REQUEST_DENIED(8),
  /**
   * <code>UNKNOWN_ERROR = 9;</code>
   */
  UNKNOWN_ERROR(9),
  /**
   * <code>DB_FAILURE = 10;</code>
   */
  DB_FAILURE(10),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SUCCESS = 0;</code>
   */
  public static final int SUCCESS_VALUE = 0;
  /**
   * <code>NOT_FOUND = 1;</code>
   */
  public static final int NOT_FOUND_VALUE = 1;
  /**
   * <code>ZERO_RESULTS = 2;</code>
   */
  public static final int ZERO_RESULTS_VALUE = 2;
  /**
   * <code>DUPLICATE = 3;</code>
   */
  public static final int DUPLICATE_VALUE = 3;
  /**
   * <code>LIMIT_EXCEEDED = 4;</code>
   */
  public static final int LIMIT_EXCEEDED_VALUE = 4;
  /**
   * <code>INVALID_REQUEST = 5;</code>
   */
  public static final int INVALID_REQUEST_VALUE = 5;
  /**
   * <code>TEMPORARILY_SUSPENDED = 6;</code>
   */
  public static final int TEMPORARILY_SUSPENDED_VALUE = 6;
  /**
   * <code>OVER_USAGE_LIMIT = 7;</code>
   */
  public static final int OVER_USAGE_LIMIT_VALUE = 7;
  /**
   * <code>REQUEST_DENIED = 8;</code>
   */
  public static final int REQUEST_DENIED_VALUE = 8;
  /**
   * <code>UNKNOWN_ERROR = 9;</code>
   */
  public static final int UNKNOWN_ERROR_VALUE = 9;
  /**
   * <code>DB_FAILURE = 10;</code>
   */
  public static final int DB_FAILURE_VALUE = 10;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static StatusCode valueOf(int value) {
    return forNumber(value);
  }

  public static StatusCode forNumber(int value) {
    switch (value) {
      case 0: return SUCCESS;
      case 1: return NOT_FOUND;
      case 2: return ZERO_RESULTS;
      case 3: return DUPLICATE;
      case 4: return LIMIT_EXCEEDED;
      case 5: return INVALID_REQUEST;
      case 6: return TEMPORARILY_SUSPENDED;
      case 7: return OVER_USAGE_LIMIT;
      case 8: return REQUEST_DENIED;
      case 9: return UNKNOWN_ERROR;
      case 10: return DB_FAILURE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StatusCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      StatusCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<StatusCode>() {
          public StatusCode findValueByNumber(int number) {
            return StatusCode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return farm.nurture.farm.service.proto.BloodBankSystemServiceOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final StatusCode[] VALUES = values();

  public static StatusCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private StatusCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:farm.nurture.core.contracts.BloodBankSystemService.StatusCode)
}

