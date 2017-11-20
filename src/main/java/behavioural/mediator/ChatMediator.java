package behavioural.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class ChatMediator {
    
    private final List<User> users = new ArrayList<>();
    
    public void addUser(User user){
        this.users.add(user);
    }
    
    public void sendMessage(String msg, User fromUser) {
        users.stream().filter(u -> !Objects.equals(u, fromUser)).forEach(u -> u.receive(msg));
    }
}
