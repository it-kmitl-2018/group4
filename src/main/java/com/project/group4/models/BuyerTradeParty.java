package com.project.group4.models;

public class BuyerTradeParty {
    private String id;
    private String globalId;
    private String name;
    private String taxId;
    private TradeContact tradeContact;
    private Address address;


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
