package builder.generic;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public class GenericBuilderTest {
    
    private static final String EXPECTED_STRING = "expected";
    private static final Integer EXPECTED_INTEGER = 1;
    private static final LocalDate EXPECTED_LOCAL_DATE = LocalDate.of(2000, 10, 10);
    
    @Test
    public void toBuildWithString() {
        ToBuild expected = new ToBuild();
        expected.setString(EXPECTED_STRING);

        ToBuild test = GenericBuilder.of(ToBuild::new)
                .with(ToBuild::setString, EXPECTED_STRING)
                .build();
        
        assertEquals(expected, test);
    }

    @Test
    public void toBuildWithInteger() {
        ToBuild expected = new ToBuild();
        expected.setInteger(EXPECTED_INTEGER);

        ToBuild test = GenericBuilder.of(ToBuild::new)
                .with(ToBuild::setInteger, EXPECTED_INTEGER)
                .build();

        assertEquals(expected, test);
    }

    @Test
    public void toBuildWithLocalDate() {
        ToBuild expected = new ToBuild();
        expected.setLocalDate(EXPECTED_LOCAL_DATE);

        ToBuild test = GenericBuilder.of(ToBuild::new)
                .with(ToBuild::setLocalDate, EXPECTED_LOCAL_DATE)
                .build();

        assertEquals(expected, test);
    }

    @Test
    public void toBuildAllFields() {
        ToBuild expected = new ToBuild();
        expected.setInteger(EXPECTED_INTEGER);
        expected.setLocalDate(EXPECTED_LOCAL_DATE);
        expected.setString(EXPECTED_STRING);

        ToBuild test = GenericBuilder.of(ToBuild::new)
                .with(ToBuild::setInteger, EXPECTED_INTEGER)
                .with(ToBuild::setLocalDate, EXPECTED_LOCAL_DATE)
                .with(ToBuild::setString, EXPECTED_STRING)
                .build();

        assertEquals(expected, test);
    }
}
