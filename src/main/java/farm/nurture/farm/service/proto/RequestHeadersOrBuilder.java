// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blood_bank_system_service.proto

package farm.nurture.farm.service.proto;

public interface RequestHeadersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string prefferedUserName = 1;</code>
   */
  java.lang.String getPrefferedUserName();
  /**
   * <code>string prefferedUserName = 1;</code>
   */
  com.google.protobuf.ByteString
      getPrefferedUserNameBytes();

  /**
   * <code>string clientId = 2;</code>
   */
  java.lang.String getClientId();
  /**
   * <code>string clientId = 2;</code>
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>string tracingId = 3;</code>
   */
  java.lang.String getTracingId();
  /**
   * <code>string tracingId = 3;</code>
   */
  com.google.protobuf.ByteString
      getTracingIdBytes();

  /**
   * <code>bool traceDetails = 4;</code>
   */
  boolean getTraceDetails();

  /**
   * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders.LANGUAGE language = 5;</code>
   */
  int getLanguageValue();
  /**
   * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders.LANGUAGE language = 5;</code>
   */
  farm.nurture.farm.service.proto.RequestHeaders.LANGUAGE getLanguage();

  /**
   * <code>float latitude = 6;</code>
   */
  float getLatitude();

  /**
   * <code>float longitude = 7;</code>
   */
  float getLongitude();

  /**
   * <code>float accuracy = 8;</code>
   */
  float getAccuracy();

  /**
   * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders.COUNTRY country = 9;</code>
   */
  int getCountryValue();
  /**
   * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders.COUNTRY country = 9;</code>
   */
  farm.nurture.farm.service.proto.RequestHeaders.COUNTRY getCountry();

  /**
   * <code>string experimentId = 10;</code>
   */
  java.lang.String getExperimentId();
  /**
   * <code>string experimentId = 10;</code>
   */
  com.google.protobuf.ByteString
      getExperimentIdBytes();

  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Attribs attribs = 11;</code>
   */
  java.util.List<farm.nurture.farm.service.proto.Attribs> 
      getAttribsList();
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Attribs attribs = 11;</code>
   */
  farm.nurture.farm.service.proto.Attribs getAttribs(int index);
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Attribs attribs = 11;</code>
   */
  int getAttribsCount();
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Attribs attribs = 11;</code>
   */
  java.util.List<? extends farm.nurture.farm.service.proto.AttribsOrBuilder> 
      getAttribsOrBuilderList();
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Attribs attribs = 11;</code>
   */
  farm.nurture.farm.service.proto.AttribsOrBuilder getAttribsOrBuilder(
      int index);

  /**
   * <code>string authToken = 12;</code>
   */
  java.lang.String getAuthToken();
  /**
   * <code>string authToken = 12;</code>
   */
  com.google.protobuf.ByteString
      getAuthTokenBytes();

  /**
   * <code>string appToken = 13;</code>
   */
  java.lang.String getAppToken();
  /**
   * <code>string appToken = 13;</code>
   */
  com.google.protobuf.ByteString
      getAppTokenBytes();
}
