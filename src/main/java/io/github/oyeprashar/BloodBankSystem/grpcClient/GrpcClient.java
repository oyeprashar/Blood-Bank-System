package io.github.oyeprashar.BloodBankSystem.grpcClient;

import farm.nurture.farm.service.proto.AddBloodRequest;
import farm.nurture.farm.service.proto.AddUserRequest;
import farm.nurture.farm.service.proto.BloodBankSystemServiceGrpc;
import farm.nurture.farm.service.proto.BloodBankSystemServiceGrpc.BloodBankSystemServiceBlockingStub;
import farm.nurture.farm.service.proto.FindBloodRequest;
import farm.nurture.farm.service.proto.FindBloodResponseRecord;
import farm.nurture.farm.service.proto.FindPasswordRequest;
import farm.nurture.farm.service.proto.FindPasswordResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.List;
import java.util.Locale;

public class GrpcClient {

    private GrpcClient(){}

    private static ManagedChannel channel = channel = ManagedChannelBuilder.forAddress("localhost", 6000).usePlaintext().build();
    private static final BloodBankSystemServiceBlockingStub bloodbankStub = BloodBankSystemServiceGrpc.newBlockingStub(channel);

    // returns true if the password matches
    public static Boolean verifyPassword(String inputId, String inputPass){

        inputId = inputId.toLowerCase();
        inputPass = inputPass.toLowerCase();

        FindPasswordRequest findPasswordReq = FindPasswordRequest.newBuilder().setId(inputId).build();
        FindPasswordResponse res = bloodbankStub.executeFindPassword(findPasswordReq); //getRecords(0).getPassword();
        if (res.getRecordsList().isEmpty()){
            return false;
        }
        String foundPass = bloodbankStub.executeFindPassword(findPasswordReq).getRecords(0)
            .getPassword();

        return foundPass.equals(inputPass);
    }

    public static void insertBloodRecord(String name, String location, String bloodType, String gender, String phoneNumber){

        AddBloodRequest addBloodReq = AddBloodRequest.newBuilder().setName(name).setLocation(location).setBloodType(bloodType).setGender(gender).
            setPhoneNumber(phoneNumber).build();

        bloodbankStub.executeAddBlood(addBloodReq);
    }

    public static List<FindBloodResponseRecord> getBloodRecord(String location, String bloodType){
        location = location.toLowerCase();
        bloodType = bloodType.toLowerCase();
        FindBloodRequest findBloodRequest = FindBloodRequest.newBuilder().setLocation(location).setBloodType(bloodType).build();
        return bloodbankStub.executeFindBlood(findBloodRequest).getRecordsList();
    }

    public static void signup(String id, String pass){
        id = id.toLowerCase();
        AddUserRequest addUserRequest = AddUserRequest.newBuilder().setId(id).setPassword(pass).build();
        bloodbankStub.executeAddUser(addUserRequest);
    }



//    public static void main(String[] args) {
//        ManagedChannel channel = null;
//        channel = ManagedChannelBuilder.forAddress("localhost",6000).usePlaintext().build();
//
//
//        BloodBankSystemServiceBlockingStub bloodbankStub = BloodBankSystemServiceGrpc.newBlockingStub(channel);
//
//        FindPasswordRequest findPasswordReq = FindPasswordRequest.newBuilder().setId("8130047792").build();
//        FindPasswordResponse res = bloodbankStub.executeFindPassword(findPasswordReq);
//        System.out.println(res.getRecordsList().get(0).getPassword());
//    }
}




