package behavioural.mediator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class ChatMediatorTest {
    
    @Test
    public void send() {
        ChatMediator chatMediator = new ChatMediator();
        User user1 = new User(chatMediator, "1");
        User user2 = new User(chatMediator, "2");
        User user3 = new User(chatMediator, "3");
        
        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        
        String msg = "test";
        user1.send("test");

        assertEquals(1, user1.getMessagesSent().size());
        assertEquals(msg, user1.getMessagesSent().get(0));
    }

    @Test
    public void receive() {
        ChatMediator chatMediator = new ChatMediator();
        User user1 = new User(chatMediator, "1");
        User user2 = new User(chatMediator, "2");
        User user3 = new User(chatMediator, "3");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        String msg = "test";
        user1.send("test");

        assertEquals(1, user1.getMessagesSent().size());
        assertEquals(msg, user1.getMessagesSent().get(0));
        assertEquals(0, user1.getMessagesReceived().size());

        assertEquals(1, user2.getMessagesReceived().size());
        assertEquals(msg, user2.getMessagesReceived().get(0));

        assertEquals(1, user3.getMessagesReceived().size());
        assertEquals(msg, user3.getMessagesReceived().get(0));
    }
}
