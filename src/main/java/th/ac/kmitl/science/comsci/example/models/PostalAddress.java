package th.ac.kmitl.science.comsci.example.models;

public class PostalAddress {

    private String postcodeCode;
    private String buildingName;
    private String lineOne;
    private String lineTwo;
    private String lineThree;
    private String lineFour;
    private String lineFive;
    private String streetName;
    private CodeMapping city;
    private CodeMapping citySubDivision;
    private String countryID;
    private CodeMapping countrySubDivision;

    public PostalAddress(
            String postcodeCode,
            String buildingName,
            String lineOne,
            String lineTwo,
            String lineThree,
            String lineFour,
            String lineFive,
            String streetName,
            CodeMapping city,
            CodeMapping citySubDivision,
            String countryID,
            CodeMapping countrySubDivision) {
        this.postcodeCode = postcodeCode;
        this.buildingName = buildingName;
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
        this.lineThree = lineThree;
        this.lineFour = lineFour;
        this.lineFive = lineFive;
        this.streetName = streetName;
        this.city = city;
        this.citySubDivision = citySubDivision;
        this.countryID = countryID;
        this.countrySubDivision = countrySubDivision;
    }

    public String getPostcodeCode() {
        return postcodeCode;
    }

    public void setPostcodeCode(String postcodeCode) {
        this.postcodeCode = postcodeCode;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getLineOne() {
        return lineOne;
    }

    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public String getLineTwo() {
        return lineTwo;
    }

    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    public String getLineThree() {
        return lineThree;
    }

    public void setLineThree(String lineThree) {
        this.lineThree = lineThree;
    }

    public String getLineFour() {
        return lineFour;
    }

    public void setLineFour(String lineFour) {
        this.lineFour = lineFour;
    }

    public String getLineFive() {
        return lineFive;
    }

    public void setLineFive(String lineFive) {
        this.lineFive = lineFive;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public CodeMapping getCity() {
        return city;
    }

    public void setCity(CodeMapping city) {
        this.city = city;
    }

    public CodeMapping getCitySubDivision() {
        return citySubDivision;
    }

    public void setCitySubDivision(CodeMapping citySubDivision) {
        this.citySubDivision = citySubDivision;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public CodeMapping getCountrySubDivision() {
        return countrySubDivision;
    }

    public void setCountrySubDivision(CodeMapping countrySubDivision) {
        this.countrySubDivision = countrySubDivision;
    }
}
