package th.ac.kmitl.science.comsci.example.models;

public class EmailAddress
        extends UniversalCommunication {

    private String completeNumber;

    public EmailAddress(String uriId, String completeNumber) {
        super(uriId);
        this.completeNumber = completeNumber;
    }

    public String getCompleteNumber() {
        return completeNumber;
    }

    public void setCompleteNumber(String completeNumber) {
        this.completeNumber = completeNumber;
    }
}
