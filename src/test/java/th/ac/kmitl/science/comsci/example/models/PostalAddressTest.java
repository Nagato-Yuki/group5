package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

import static org.junit.Assert.*;
import static th.ac.kmitl.science.comsci.example.mock.PostalAddressMock.*;

public class PostalAddressTest {

    @Test
    public void canCreatePostalAddressWithAllAttribute() {
        PostalAddress postalAddress = postalAddress();

        assertEquals(postcodeCode, postalAddress.getPostcodeCode());
        assertEquals(buildingName, postalAddress.getBuildingName());
        assertEquals(lineOne, postalAddress.getLineOne());
        assertEquals(lineTwo, postalAddress.getLineTwo());
        assertEquals(lineThree, postalAddress.getLineThree());
        assertEquals(lineFour, postalAddress.getLineFour());
        assertEquals(lineFive,postalAddress.getLineFive());
        assertEquals(streetName, postalAddress.getStreetName());
        assertEquals(city, postalAddress.getCity());
        assertEquals(citySubDivision, postalAddress.getCitySubDivision());
        assertEquals(countryID, postalAddress.getCountryID());
        assertEquals(countrySubDivision, postalAddress.getCountrySubDivision());
    }

    @Test
    public void canCreatePostalAddressWithSomeAttribute() {
        PostalAddress postalAddress = postalAddressWithSomeAttribute();

        assertEquals(postcodeCode, postalAddress.getPostcodeCode());
        assertEquals(buildingName, postalAddress.getBuildingName());
        assertEquals(lineOne, postalAddress.getLineOne());
        assertEquals(lineTwo, postalAddress.getLineTwo());
        assertEquals(null, postalAddress.getLineThree());
        assertEquals(null, postalAddress.getLineFour());
        assertEquals(null,postalAddress.getLineFive());
        assertEquals(streetName, postalAddress.getStreetName());
        assertEquals(city, postalAddress.getCity());
        assertEquals(citySubDivision, postalAddress.getCitySubDivision());
        assertEquals(null, postalAddress.getCountryID());
        assertEquals(null, postalAddress.getCountrySubDivision());
    }
}