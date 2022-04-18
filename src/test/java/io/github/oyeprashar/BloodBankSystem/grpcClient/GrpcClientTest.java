package io.github.oyeprashar.BloodBankSystem.grpcClient;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GrpcClientTest {

    @Test
    void verifyPassword() {
        Boolean res = GrpcClient.verifyPassword("shubham", "shubham");
        System.out.println(res);
    }
}