package behavioural.command.system;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public abstract class FileSystemReceiver {
    private final SystemType type;

    FileSystemReceiver(SystemType type) {
        this.type = type;
    }

    public String openFile() {
        return type + ", " + FileOperationType.OPEN;
    }

    public String writeFile() {
        return type + ", " + FileOperationType.WRITE;
    }

    public String closeFile() {
        return type + ", " + FileOperationType.CLOSE;
    }
}
