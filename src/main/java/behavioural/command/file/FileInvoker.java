package behavioural.command.file;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class FileInvoker {
    
    private final FileCommand command;

    public FileInvoker(FileCommand c){
        this.command=c;
    }

    public String execute(){
        return this.command.execute();
    }
}
