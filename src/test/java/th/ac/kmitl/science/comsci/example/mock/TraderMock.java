package th.ac.kmitl.science.comsci.example.mock;

import th.ac.kmitl.science.comsci.example.models.Trader;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class TraderMock {

    public static String id = UUID.randomUUID().toString();
    public static String globalId = UUID.randomUUID().toString();
    public static String name = "KMITL";
    public static String taxId = UUID.randomUUID().toString();

    public static Trader trader() {
        Trader trader = new Trader(
                id,
                globalId,
                name,
                taxId
        );
        return trader;
    }
}