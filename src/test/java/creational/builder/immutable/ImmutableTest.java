package creational.builder.immutable;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public class ImmutableTest {
    private static final String EXPECTED_STRING = "expected";
    private static final Integer EXPECTED_INTEGER = 1;
    private static final LocalDate EXPECTED_LOCAL_DATE = LocalDate.of(2000, 10, 10);

    @Test
    public void immutableWithString() {
        Immutable test = new Immutable.Builder().string(EXPECTED_STRING).build();

        assertEquals(EXPECTED_STRING, test.getString());
        assertEquals(null, test.getInteger());
        assertEquals(null, test.getLocalDate());
    }

    @Test
    public void immutableWithInteger() {
        Immutable test = new Immutable.Builder().integer(EXPECTED_INTEGER).build();

        assertEquals(null, test.getString());
        assertEquals(EXPECTED_INTEGER, test.getInteger());
        assertEquals(null, test.getLocalDate());
    }

    @Test
    public void immutableWithLocalDate() {
        Immutable test = new Immutable.Builder().localDate(EXPECTED_LOCAL_DATE).build();

        assertEquals(null, test.getString());
        assertEquals(null, test.getInteger());
        assertEquals(EXPECTED_LOCAL_DATE, test.getLocalDate());
    }

    @Test
    public void immutableAllFields() {
        Immutable test = new Immutable.Builder()
                .string(EXPECTED_STRING)
                .integer(EXPECTED_INTEGER)
                .localDate(EXPECTED_LOCAL_DATE)
                .build();

        assertEquals(EXPECTED_STRING, test.getString());
        assertEquals(EXPECTED_INTEGER, test.getInteger());
        assertEquals(EXPECTED_LOCAL_DATE, test.getLocalDate());
    }
}
