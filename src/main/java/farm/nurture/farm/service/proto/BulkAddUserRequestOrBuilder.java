// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blood_bank_system_service.proto

package farm.nurture.farm.service.proto;

public interface BulkAddUserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:farm.nurture.core.contracts.BloodBankSystemService.BulkAddUserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders requestHeaders = 1;</code>
   */
  boolean hasRequestHeaders();
  /**
   * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders requestHeaders = 1;</code>
   */
  farm.nurture.farm.service.proto.RequestHeaders getRequestHeaders();
  /**
   * <code>.farm.nurture.core.contracts.BloodBankSystemService.RequestHeaders requestHeaders = 1;</code>
   */
  farm.nurture.farm.service.proto.RequestHeadersOrBuilder getRequestHeadersOrBuilder();

  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserRequest requests = 2;</code>
   */
  java.util.List<farm.nurture.farm.service.proto.AddUserRequest> 
      getRequestsList();
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserRequest requests = 2;</code>
   */
  farm.nurture.farm.service.proto.AddUserRequest getRequests(int index);
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserRequest requests = 2;</code>
   */
  int getRequestsCount();
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserRequest requests = 2;</code>
   */
  java.util.List<? extends farm.nurture.farm.service.proto.AddUserRequestOrBuilder> 
      getRequestsOrBuilderList();
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.AddUserRequest requests = 2;</code>
   */
  farm.nurture.farm.service.proto.AddUserRequestOrBuilder getRequestsOrBuilder(
      int index);
}
