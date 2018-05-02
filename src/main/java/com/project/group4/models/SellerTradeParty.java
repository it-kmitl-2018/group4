package com.project.group4.models;

public class SellerTradeParty {

    private String id;
    private String globalId;
    private String Name;
    private String TaxRegistration;
    private TradeContact TradeContact;
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
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTaxRegistration() {
        return TaxRegistration;
    }

    public void setTaxRegistration(String taxRegistration) {
        TaxRegistration = taxRegistration;
    }

    public TradeContact getTradeContact() {
        return TradeContact;
    }

    public void setTradeContact(TradeContact tradeContact) {
        TradeContact = tradeContact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
