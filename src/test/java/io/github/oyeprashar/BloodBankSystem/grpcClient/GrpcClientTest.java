package io.github.oyeprashar.BloodBankSystem.grpcClient;

import static org.junit.jupiter.api.Assertions.*;

import farm.nurture.farm.service.proto.FindBloodResponseRecord;
import java.util.List;
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

    @Test
    void getBloodRecord(){
        List<FindBloodResponseRecord> res = GrpcClient.getBloodRecord("delhi", "b+");
        for (FindBloodResponseRecord rec : res){
            System.out.println(rec.getName());
        }

        for (FindBloodResponseRecord rec : res){
            System.out.println(rec.getName());
        }

//        System.out.println(res.size());
//        System.out.println(res.get(0));
//        assertEquals(3,res.size());

    }
}