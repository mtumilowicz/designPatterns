package behavioural.command.file;

import behavioural.command.system.FileSystemReceiver;
import behavioural.command.system.MacFileSystemReceiver;
import behavioural.command.system.WindowsFileSystemReceiver;
import com.google.common.base.Preconditions;
import com.sun.javafx.PlatformUtil;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class FileSystemReceiverFactory {
    
    public static FileSystemReceiver get() {
        FileSystemReceiver receiver = null;
        
        if(PlatformUtil.isMac()){
            receiver = new MacFileSystemReceiver();
        }
        if (PlatformUtil.isWindows()) {
            receiver = new WindowsFileSystemReceiver();
        }

        Preconditions.checkState(receiver != null, "Platform not supported!");
        
        return receiver;
    }
    
}
