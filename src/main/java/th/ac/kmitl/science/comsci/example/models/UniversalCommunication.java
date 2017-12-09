package th.ac.kmitl.science.comsci.example.models;

public abstract class UniversalCommunication {

    private String uriId;

    public UniversalCommunication(String uriId) {
        this.setUriId(uriId);
    }

    public String getUriId() {
        return uriId;
    }

    public void setUriId(String uriId) {
        if(uriId == null || uriId.isEmpty())
            throw new UnsupportedOperationException("This field cannot be null or empty");
        this.uriId = uriId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UniversalCommunication)) return false;

        UniversalCommunication that = (UniversalCommunication) o;

        return uriId.equals(that.uriId);
    }

    @Override
    public int hashCode() {
        return uriId.hashCode();
    }
}
