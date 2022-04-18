package io.github.oyeprashar.BloodBankSystem.grpcClient;

import farm.nurture.farm.service.proto.BloodBankSystemServiceGrpc;
import farm.nurture.farm.service.proto.BloodBankSystemServiceGrpc.BloodBankSystemServiceBlockingStub;
import farm.nurture.farm.service.proto.FindPasswordRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

    private GrpcClient(){}

    private static ManagedChannel channel = channel = ManagedChannelBuilder.forAddress("localhost", 6000).usePlaintext().build();
    private static BloodBankSystemServiceBlockingStub bloodbankStub = BloodBankSystemServiceGrpc.newBlockingStub(channel);

    // returns true if the password matches
    public static Boolean verifyPassword(String inputId, String inputPass){

        FindPasswordRequest findPasswordReq = FindPasswordRequest.newBuilder().setId(inputId).build();
        String res = bloodbankStub.executeFindPassword(findPasswordReq).getRecords(0).getPassword();

        return res.equals(inputPass);

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




