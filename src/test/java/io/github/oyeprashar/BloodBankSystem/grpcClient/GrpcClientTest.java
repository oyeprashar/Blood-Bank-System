package io.github.oyeprashar.BloodBankSystem.grpcClient;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GrpcClientTest {

    @Test
    void verifyPassword() {
        Boolean correctPassRes = GrpcClient.verifyPassword("8130047792","pass123");
        Boolean wrongPassRes = GrpcClient.verifyPassword("8130047792","pass125");
        Boolean wrongIdRes = GrpcClient.verifyPassword("8130047794","pass123");

        assertEquals(true,correctPassRes);
        assertEquals(false, wrongPassRes);
        assertEquals(false,wrongIdRes);
    }
}