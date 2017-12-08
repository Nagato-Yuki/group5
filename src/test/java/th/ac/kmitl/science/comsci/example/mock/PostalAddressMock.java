package th.ac.kmitl.science.comsci.example.mock;

import th.ac.kmitl.science.comsci.example.models.CodeMapping;
import th.ac.kmitl.science.comsci.example.models.PostalAddress;
import th.ac.kmitl.science.comsci.example.models.PostalAddressBuilder;

public class PostalAddressMock {

    public static String postcodeCode = "10310";
    public static String buildingName = "อาคารพระจอมเกล้า";
    public static String lineOne = "ชั้น B ห้อง B01 คณะวิทยาศาสตร์ สถาบันเทคโนโลยีพระจอมเกล้า เจ้าคุณทหารลาดกระบัง";
    public static String lineTwo = "เลขที่ 1";
    public static String lineThree = "";
    public static String lineFour = "";
    public static String lineFive = "";
    public static String streetName = "ฉลองกรุง";
    public static CodeMapping city = CodeMappingMock.citySubDivision();
    public static CodeMapping citySubDivision = CodeMappingMock.city();
    public static String countryID = "";
    public static CodeMapping countrySubDivision = CodeMappingMock.countrySubDivision();

    public static PostalAddress postalAddress() {
        PostalAddress postalAddress = new PostalAddressBuilder()
                .withPostcodeCode(postcodeCode)
                .withBuildingName(buildingName)
                .withLineOne(lineOne)
                .withLineTwo(lineTwo)
                .withLineThree(lineThree)
                .withLineFour(lineFour)
                .withLineFive(lineFive)
                .withStreetName(streetName)
                .withCity(city)
                .withCitySubDivision(citySubDivision)
                .withCountryID(countryID)
                .withCountrySubDivision(countrySubDivision)
                .createPostalAddress();
        return postalAddress;
    }

    public static PostalAddress postalAddressWithSomeAttribute() {
        PostalAddress postalAddress = new PostalAddressBuilder()
                .withPostcodeCode(postcodeCode)
                .withBuildingName(buildingName)
                .withLineOne(lineOne)
                .withLineTwo(lineTwo)
                .withStreetName(streetName)
                .withCity(city)
                .withCitySubDivision(citySubDivision)
                .createPostalAddress();
        return postalAddress;
    }
}