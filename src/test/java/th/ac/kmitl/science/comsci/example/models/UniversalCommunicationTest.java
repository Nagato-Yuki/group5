package th.ac.kmitl.science.comsci.example.models;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.UUID;

import static org.junit.Assert.*;

public class UniversalCommunicationTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void isEqualsWithSameId() {
        String uriId = UUID.randomUUID().toString();

        UniversalCommunication emailAddress1 = new EmailAddress(uriId, "info1@kmitl.ac.th");
        UniversalCommunication emailAddress2 = new EmailAddress(uriId, "info2@kmitl.ac.th");

        assertEquals(emailAddress1, emailAddress2);
    }

    @Test
    public void cannotCreateWithNullId() {
        exception.expect(UnsupportedOperationException.class);
        UniversalCommunication emailAddress = new EmailAddress(null, "info3@kmitl.ac.th");
    }

    @Test
    public void cannotCreateWithEmptyId() {
        exception.expect(UnsupportedOperationException.class);
        UniversalCommunication emailAddress = new EmailAddress("", "info2@kmitl.ac.th");
    }

    @Test
    public void cannotSetIdWithNull() {
        UniversalCommunication emailAddress = new EmailAddress(UUID.randomUUID().toString(), "info2@kmitl.ac.th");

        exception.expect(UnsupportedOperationException.class);
        emailAddress.setUriId(null);
    }

    @Test
    public void cannotSetIdWithNullOrEmpty() {
        UniversalCommunication emailAddress = new EmailAddress(UUID.randomUUID().toString(), "info2@kmitl.ac.th");

        exception.expect(UnsupportedOperationException.class);
        emailAddress.setUriId("");
    }
}