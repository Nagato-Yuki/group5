package th.ac.kmitl.science.comsci.example.mock;

import th.ac.kmitl.science.comsci.example.models.EmailAddress;
import th.ac.kmitl.science.comsci.example.models.UniversalCommunication;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UniversalCommunicationMock {

    public static List<UniversalCommunication> generateMockUniversalCommunicationList() {
        String emailId = UUID.randomUUID().toString();
        String emailCompleteNumber = "info@kmitl.ac.th";
        EmailAddress emailAddress = new EmailAddress(emailId, emailCompleteNumber);

        String emailId2 = UUID.randomUUID().toString();
        String emailCompleteNumber2 = "info2@kmitl.ac.th";
        EmailAddress emailAddress2 = new EmailAddress(emailId2, emailCompleteNumber2);

        List<UniversalCommunication> universalCommunications = new ArrayList<>();
        universalCommunications.add(emailAddress);
        universalCommunications.add(emailAddress2);

        return universalCommunications;
    }
}
