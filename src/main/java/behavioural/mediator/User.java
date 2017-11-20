package behavioural.mediator;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class User {
    
    private final ChatMediator mediator;
    private final String name;
    private final List<String> messagesReceived = new LinkedList<>();
    private final List<String> messagesSent = new LinkedList<>();

    public User(ChatMediator med, String name){
        this.mediator=med;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void send(String msg){
        messagesSent.add(msg);
        mediator.sendMessage(msg, this);
    }

    public void receive(String msg) {
        messagesReceived.add(msg);
    }

    public List<String> getMessagesReceived() {
        return new LinkedList<>(messagesReceived);
    }

    public List<String> getMessagesSent() {
        return new LinkedList<>(messagesSent);
    }
}
