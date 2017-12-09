package th.ac.kmitl.science.comsci.example.models;

import java.util.ArrayList;
import java.util.List;

public class Trader {

    private String id;
    private String globalId;
    private String name;
    private String taxId;
    private List<UniversalCommunication> definedCiTradeContacts;
    private PostalAddress postalCiTradeAddress;

    public Trader(
            String id,
            String globalId,
            String name,
            String taxId) {
        this();
        this.setId(id);
        this.globalId = globalId;
        this.name = name;
        this.taxId = taxId;
    }

    public Trader() {
        setDefinedCiTradeContacts(new ArrayList<UniversalCommunication>());
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        if(id == null || id.isEmpty())
            throw new UnsupportedOperationException("This field cannot be null or empty");
        this.id = id;
    }

    public String getGlobalId() {
        return globalId;
    }

    protected void setGlobalId(String globalId) {
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

    protected void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public List<UniversalCommunication> getDefinedCiTradeContacts() {
        return definedCiTradeContacts;
    }

    private void setDefinedCiTradeContacts(List<UniversalCommunication> definedCiTradeContacts) {
        this.definedCiTradeContacts = definedCiTradeContacts;
    }

    public PostalAddress getPostalCiTradeAddress() {
        return postalCiTradeAddress;
    }

    public void setPostalCiTradeAddress(PostalAddress postalCiTradeAddress) {
        this.postalCiTradeAddress = postalCiTradeAddress;
    }

    public Trader withDefinedCiTradeContacts(UniversalCommunication... tradeContacts) {
        for (UniversalCommunication tradeContact : tradeContacts) {
            getDefinedCiTradeContacts().add(tradeContact);
        }
        return this;
    }

    public Trader withPostalCiTradeAddress(PostalAddress postalTradeAddress) {
        setPostalCiTradeAddress(postalTradeAddress);
        return this;
    }
}