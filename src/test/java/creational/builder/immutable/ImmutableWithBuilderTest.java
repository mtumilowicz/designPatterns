package creational.builder.immutable;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by mtumilowicz on 2017-11-11.
 */
public class ImmutableWithBuilderTest {
    private static final String EXPECTED_STRING = "expected";
    private static final Integer EXPECTED_INTEGER = 1;
    private static final LocalDate EXPECTED_LOCAL_DATE = LocalDate.of(2000, 10, 10);

    @Test
    public void immutableWithString() {
        ImmutableWithBuilder test = new ImmutableWithBuilder.Builder().string(EXPECTED_STRING).build();

        assertEquals(EXPECTED_STRING, test.getString());
        assertNull(test.getInteger());
        assertNull(test.getLocalDate());
    }

    @Test
    public void immutableWithInteger() {
        ImmutableWithBuilder test = new ImmutableWithBuilder.Builder().integer(EXPECTED_INTEGER).build();

        assertNull(test.getString());
        assertEquals(EXPECTED_INTEGER, test.getInteger());
        assertNull(test.getLocalDate());
    }

    @Test
    public void immutableWithLocalDate() {
        ImmutableWithBuilder test = new ImmutableWithBuilder.Builder().localDate(EXPECTED_LOCAL_DATE).build();

        assertNull(test.getString());
        assertNull(test.getInteger());
        assertEquals(EXPECTED_LOCAL_DATE, test.getLocalDate());
    }

    @Test
    public void immutableAllFields() {
        ImmutableWithBuilder test = new ImmutableWithBuilder.Builder()
                .string(EXPECTED_STRING)
                .integer(EXPECTED_INTEGER)
                .localDate(EXPECTED_LOCAL_DATE)
                .build();

        assertEquals(EXPECTED_STRING, test.getString());
        assertEquals(EXPECTED_INTEGER, test.getInteger());
        assertEquals(EXPECTED_LOCAL_DATE, test.getLocalDate());
    }
}
