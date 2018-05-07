package com.project.group4.models.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TradeContactJsonTest {

    private String personName;
    private String departmentName;
    private String uriId;
    private String telephoneNumber;

    @Test
    public void buildTest() {
        TradeContactJson tradeContactJson = TradeContactJson.builder()
                .personName(this.personName)
                .departmentName(this.departmentName)
                .uriId(this.uriId)
                .telephoneNumber(this.telephoneNumber)
                .build();

        assertEquals(this.personName, tradeContactJson.personName);
        assertEquals(this.departmentName, tradeContactJson.departmentName);
        assertEquals(this.uriId, tradeContactJson.uriId);
        assertEquals(this.telephoneNumber, tradeContactJson.telephoneNumber);
    }
}
