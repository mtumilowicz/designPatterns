package behavioural.mediator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        
        assertTrue(user1.getMessagesSent().size() == 1);
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

        assertTrue(user1.getMessagesSent().size() == 1);
        assertEquals(msg, user1.getMessagesSent().get(0));
        assertTrue(user1.getMessagesReceived().size() == 0);

        assertTrue(user2.getMessagesReceived().size() == 1);
        assertEquals(msg, user2.getMessagesReceived().get(0));

        assertTrue(user3.getMessagesReceived().size() == 1);
        assertEquals(msg, user3.getMessagesReceived().get(0));
    }
}
