package model;

public class BuyerTradeParty {

    private String id;
    private String globalId;
    private String name;
    private SpecifiedTaxRegistration SpecifiedTaxRegistration;
    private DefindTradeContact defindTradeContact;
    private EmailUriUniversalCommunication emailUriUniversalCommunication;
    private TelephoneUniversalCommunication telephoneUniversalCommunication;
    private PostalTradeAddress postalTradeAddress;

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

    public model.SpecifiedTaxRegistration getSpecifiedTaxRegistration() {
        return SpecifiedTaxRegistration;
    }

    public void setSpecifiedTaxRegistration(model.SpecifiedTaxRegistration specifiedTaxRegistration) {
        SpecifiedTaxRegistration = specifiedTaxRegistration;
    }

    public DefindTradeContact getDefindTradeContact() {
        return defindTradeContact;
    }

    public void setDefindTradeContact(DefindTradeContact defindTradeContact) {
        this.defindTradeContact = defindTradeContact;
    }

    public EmailUriUniversalCommunication getEmailUriUniversalCommunication() {
        return emailUriUniversalCommunication;
    }

    public void setEmailUriUniversalCommunication(EmailUriUniversalCommunication emailUriUniversalCommunication) {
        this.emailUriUniversalCommunication = emailUriUniversalCommunication;
    }

    public TelephoneUniversalCommunication getTelephoneUniversalCommunication() {
        return telephoneUniversalCommunication;
    }

    public void setTelephoneUniversalCommunication(TelephoneUniversalCommunication telephoneUniversalCommunication) {
        this.telephoneUniversalCommunication = telephoneUniversalCommunication;
    }

    public PostalTradeAddress getPostalTradeAddress() {
        return postalTradeAddress;
    }

    public void setPostalTradeAddress(PostalTradeAddress postalTradeAddress) {
        this.postalTradeAddress = postalTradeAddress;
    }
}
