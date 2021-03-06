// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blood_bank_system_service.proto

package farm.nurture.farm.service.proto;

public interface FindBloodResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:farm.nurture.core.contracts.BloodBankSystemService.FindBloodResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.farm.nurture.core.contracts.BloodBankSystemService.Status status = 1;</code>
   */
  boolean hasStatus();
  /**
   * <code>.farm.nurture.core.contracts.BloodBankSystemService.Status status = 1;</code>
   */
  farm.nurture.farm.service.proto.Status getStatus();
  /**
   * <code>.farm.nurture.core.contracts.BloodBankSystemService.Status status = 1;</code>
   */
  farm.nurture.farm.service.proto.StatusOrBuilder getStatusOrBuilder();

  /**
   * <code>int32 count = 2;</code>
   */
  int getCount();

  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Attribs attribs = 3;</code>
   */
  java.util.List<farm.nurture.farm.service.proto.Attribs> 
      getAttribsList();
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Attribs attribs = 3;</code>
   */
  farm.nurture.farm.service.proto.Attribs getAttribs(int index);
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Attribs attribs = 3;</code>
   */
  int getAttribsCount();
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Attribs attribs = 3;</code>
   */
  java.util.List<? extends farm.nurture.farm.service.proto.AttribsOrBuilder> 
      getAttribsOrBuilderList();
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.Attribs attribs = 3;</code>
   */
  farm.nurture.farm.service.proto.AttribsOrBuilder getAttribsOrBuilder(
      int index);

  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.FindBloodResponseRecord records = 4;</code>
   */
  java.util.List<farm.nurture.farm.service.proto.FindBloodResponseRecord> 
      getRecordsList();
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.FindBloodResponseRecord records = 4;</code>
   */
  farm.nurture.farm.service.proto.FindBloodResponseRecord getRecords(int index);
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.FindBloodResponseRecord records = 4;</code>
   */
  int getRecordsCount();
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.FindBloodResponseRecord records = 4;</code>
   */
  java.util.List<? extends farm.nurture.farm.service.proto.FindBloodResponseRecordOrBuilder> 
      getRecordsOrBuilderList();
  /**
   * <code>repeated .farm.nurture.core.contracts.BloodBankSystemService.FindBloodResponseRecord records = 4;</code>
   */
  farm.nurture.farm.service.proto.FindBloodResponseRecordOrBuilder getRecordsOrBuilder(
      int index);
}
