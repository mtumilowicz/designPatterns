package behavioural.memento;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class TextEditorTest {
    
    private static final String TEST = "test";
    private static final String TEST2 = "test2";
    
    @Test
    public void singleUndo() {
        TextEditor textEditor = new TextEditor();
        textEditor.addWord(TEST);
        
        assertEquals(TEST, textEditor.getText());
        
        textEditor.undo();
        
        assertEquals(StringUtils.EMPTY, textEditor.getText());
    }

    @Test
    public void doubleUndo() {
        TextEditor textEditor = new TextEditor();
        textEditor.addWord(TEST);

        assertEquals(TEST, textEditor.getText());
        
        textEditor.addWord(TEST2);
        
        assertEquals(TEST + TEST2, textEditor.getText());

        textEditor.undo();
        textEditor.undo();

        assertEquals(StringUtils.EMPTY, textEditor.getText());
    }
}
