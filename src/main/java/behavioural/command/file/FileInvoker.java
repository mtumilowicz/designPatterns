package behavioural.command.file;

import behavioural.command.Command;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class FileInvoker {

    private final Command command;

    public FileInvoker(Command c) {
        this.command = c;
    }

    public String execute() {
        return command.execute();
    }
}
