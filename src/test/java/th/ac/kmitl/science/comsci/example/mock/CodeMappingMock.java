package th.ac.kmitl.science.comsci.example.mock;

import th.ac.kmitl.science.comsci.example.models.CodeMapping;

public class CodeMappingMock {

    public static int citySubDivisionId = 1;
    public static String citySubDivisionName = "ลาดกระบัง";

    public static int cityId = 1;
    public static String cityName = "ลาดกระบัง";

    public static int countrySubDivisionId = 10;
    public static String countrySubDivisionName = "กรุงเทพมหานคร";

    public static CodeMapping citySubDivision() {
        return new CodeMapping(citySubDivisionId, citySubDivisionName);
    }

    public static CodeMapping city() {
        return new CodeMapping(cityId, cityName);
    }

    public static CodeMapping countrySubDivision() {
        return new CodeMapping(countrySubDivisionId, countrySubDivisionName);
    }
}
