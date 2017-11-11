package structural.adapter;

import org.junit.Test;
import structural.adapter.english.IPerson;
import structural.adapter.french.Frenchman;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public class FrenchPersonAdapterTest {
    
    private static final String EXPECTED_NAME = "Jacques";
    private static final String EXPECTED_LAST_NAME = "Chirac";

    @Test
    public void nullFrenchman() {
        IPerson person = new FrenchPersonAdapter(null);
        assertNull(person.name());
        assertNull(person.lastName());
    }

    @Test
    public void onlyNameFrenchman() {
        IPerson person =
                new FrenchPersonAdapter(new Frenchman(EXPECTED_NAME, null));
        assertEquals(EXPECTED_NAME, person.name());
        assertNull(person.lastName());
    }

    @Test
    public void onlyLastNameFrenchman() {
        IPerson person =
                new FrenchPersonAdapter(new Frenchman(null, EXPECTED_LAST_NAME));
        assertNull(person.name());
        assertEquals(EXPECTED_LAST_NAME, person.lastName());
    }
    
    @Test
    public void fullFrenchman() {
        IPerson person = 
                new FrenchPersonAdapter(new Frenchman(EXPECTED_NAME, EXPECTED_LAST_NAME));
        assertEquals(EXPECTED_NAME, person.name());
        assertEquals(EXPECTED_LAST_NAME, person.lastName());
    }
}
