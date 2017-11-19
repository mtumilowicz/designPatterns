package behavioural.memento;

import com.google.common.collect.Iterables;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mtumilowicz on 2017-11-19.
 */
public class TextEditor {
    private StringBuilder sb = new StringBuilder();
    private final List<Memento> mementos = new ArrayList<>();
    
    public void addWord(String word) {
        addMemento();
        sb.append(StringUtils.defaultIfEmpty(word, StringUtils.EMPTY));
    }
    
    public String getText() {
        return sb.toString();
    }
    
    private void addMemento() {
        mementos.add(new Memento(sb.toString()));
    }
    
    public void undo() {
        Memento last = Iterables.getLast(mementos, null);
        if (last != null) {
            sb = new StringBuilder(last.getMemo());
            mementos.remove(last);
        }
    }
}
