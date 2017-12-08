package th.ac.kmitl.science.comsci.example.models;

public class PostalAddressBuilder {

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

    public PostalAddressBuilder withPostcodeCode(String postcodeCode) {
        this.postcodeCode = postcodeCode;
        return this;
    }

    public PostalAddressBuilder withBuildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    public PostalAddressBuilder withLineOne(String lineOne) {
        this.lineOne = lineOne;
        return this;
    }

    public PostalAddressBuilder withLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
        return this;
    }

    public PostalAddressBuilder withLineThree(String lineThree) {
        this.lineThree = lineThree;
        return this;
    }

    public PostalAddressBuilder withLineFour(String lineFour) {
        this.lineFour = lineFour;
        return this;
    }

    public PostalAddressBuilder withLineFive(String lineFive) {
        this.lineFive = lineFive;
        return this;
    }

    public PostalAddressBuilder withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public PostalAddressBuilder withCity(CodeMapping city) {
        this.city = city;
        return this;
    }

    public PostalAddressBuilder withCitySubDivision(CodeMapping citySubDivision) {
        this.citySubDivision = citySubDivision;
        return this;
    }

    public PostalAddressBuilder withCountryID(String countryID) {
        this.countryID = countryID;
        return this;
    }

    public PostalAddressBuilder withCountrySubDivision(CodeMapping countrySubDivision) {
        this.countrySubDivision = countrySubDivision;
        return this;
    }

    public PostalAddress createPostalAddress() {
        return new PostalAddress(
                postcodeCode,
                buildingName,
                lineOne,
                lineTwo,
                lineThree,
                lineFour,
                lineFive,
                streetName,
                city,
                citySubDivision,
                countryID,
                countrySubDivision
        );
    }
}