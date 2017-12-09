package th.ac.kmitl.science.comsci.example.models;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import th.ac.kmitl.science.comsci.example.mock.UniversalCommunicationMock;
import th.ac.kmitl.science.comsci.example.mock.TraderMock;

import java.util.List;

import static org.junit.Assert.*;
import static th.ac.kmitl.science.comsci.example.mock.PostalAddressMock.postalAddressWithSomeAttribute;
import static th.ac.kmitl.science.comsci.example.mock.TraderMock.*;

public class TraderTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void canCreateTrader() {
        Trader trader = TraderMock.trader();

        assertEquals(id, trader.getId());
        assertEquals(globalId, trader.getGlobalId());
        assertEquals(name, trader.getName());
        assertEquals(taxId, trader.getTaxId());
    }

    @Test
    public void canCreateTraderWithContacts() {
        List<UniversalCommunication> universalCommunications = UniversalCommunicationMock.generateMockUniversalCommunicationList();

        Trader trader = TraderMock.trader()
                .withDefinedCiTradeContacts(
                        universalCommunications.get(0),
                        universalCommunications.get(1)
                );

        assertEquals(id, trader.getId());
        assertEquals(globalId, trader.getGlobalId());
        assertEquals(name, trader.getName());
        assertEquals(taxId, trader.getTaxId());
        assertEquals(true, trader.getDefinedCiTradeContacts().containsAll(universalCommunications));
    }

    @Test
    public void canCreateTraderWithPostalAddress() {

        PostalAddress postalAddress = postalAddressWithSomeAttribute();

        Trader trader = TraderMock.trader()
                .withPostalCiTradeAddress(postalAddress);

        assertEquals(id, trader.getId());
        assertEquals(globalId, trader.getGlobalId());
        assertEquals(name, trader.getName());
        assertEquals(taxId, trader.getTaxId());
        assertEquals(postalAddress, trader.getPostalCiTradeAddress());
    }

    @Test
    public void cannotCreateWithNullId() {
        exception.expect(UnsupportedOperationException.class);
        Trader trader = new Trader(null, globalId, name, taxId);
    }

    @Test
    public void cannotCreateWithEmptyId() {
        exception.expect(UnsupportedOperationException.class);
        Trader trader = new Trader("", globalId, name, taxId);
    }

    @Test
    public void cannotSetIdWithNull() {
        Trader trader = trader();

        exception.expect(UnsupportedOperationException.class);
        trader.setId(null);
    }

    @Test
    public void cannotSetIdWithNullOrEmpty() {
        Trader trader = trader();

        exception.expect(UnsupportedOperationException.class);
        trader.setId("");
    }
}