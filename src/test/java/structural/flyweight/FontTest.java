package structural.flyweight;

import org.junit.Test;
import structural.flyweight.Font.FlyweightFactory;

import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class FontTest {
    private static final Color EXPECTED_FONT_COLOR = Color.BLACK;
    private static final FontName EXPECTED_FONT_NAME = FontName.HELVETICA;
    private static final int EXPECTED_FONT_SIZE = 15;
    
    @Test
    public void fontWithNoNullFields() {
        Font font = FlyweightFactory.getFont(EXPECTED_FONT_NAME, EXPECTED_FONT_SIZE, EXPECTED_FONT_COLOR);
        
        assertEquals(EXPECTED_FONT_COLOR, font.getColor());
        assertEquals((Integer) EXPECTED_FONT_SIZE, font.getSize());
        assertEquals(EXPECTED_FONT_NAME, font.getName());
    }

    @Test
    public void onlyColor() {
        Font font = FlyweightFactory.getFont(null, null, EXPECTED_FONT_COLOR);

        assertEquals(EXPECTED_FONT_COLOR, font.getColor());
        assertNull(font.getSize());
        assertNull(font.getName());
    }

    @Test
    public void onlySize() {
        Font font = FlyweightFactory.getFont(null, EXPECTED_FONT_SIZE, null);

        assertNull(font.getColor());
        assertEquals((Integer) EXPECTED_FONT_SIZE, font.getSize());
        assertNull(font.getName());
    }

    @Test
    public void onlyName() {
        Font font = FlyweightFactory.getFont(EXPECTED_FONT_NAME, null, null);

        assertNull(font.getColor());
        assertNull(font.getSize());
        assertEquals(EXPECTED_FONT_NAME, font.getName());
    }
    
    @Test
    public void checkCache() {
        assertSame(FlyweightFactory.getFont(EXPECTED_FONT_NAME,
                EXPECTED_FONT_SIZE,
                EXPECTED_FONT_COLOR), FlyweightFactory.getFont(EXPECTED_FONT_NAME,
                EXPECTED_FONT_SIZE,
                EXPECTED_FONT_COLOR));
    }
}
