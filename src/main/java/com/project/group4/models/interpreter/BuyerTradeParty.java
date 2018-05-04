package com.project.group4.models.interpreter;

import com.project.group4.models.Address;
import com.project.group4.models.TradeContact;
import lombok.Builder;

@Builder
public class BuyerTradeParty {

    private String id;
    private String globalId;
    private String name;
    private String taxId; //TaxRegistration
    private TradeContact tradeContact;
    private Address address;

    public BuyerTradeParty(String id, String globalId, String name, String taxId, TradeContact tradeContact, Address address) {
        this.id = id;
        this.globalId = globalId;
        this.name = name;
        this.taxId = taxId;
        this.tradeContact = tradeContact;
        this.address = address;
    }

    public BuyerTradeParty() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public TradeContact getTradeContact() {
        return tradeContact;
    }

    public void setTradeContact(TradeContact tradeContact) {
        this.tradeContact = tradeContact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}