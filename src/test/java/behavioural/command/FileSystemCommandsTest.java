package behavioural.command;

import behavioural.command.file.FileInvoker;
import behavioural.command.system.FileSystemReceiver;
import behavioural.command.system.MacFileSystemReceiver;
import behavioural.command.system.WindowsFileSystemReceiver;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
public class FileSystemCommandsTest {
    
    private FileSystemReceiver windowsReceiver = new WindowsFileSystemReceiver();
    private FileSystemReceiver macReceiver = new MacFileSystemReceiver();
    
    @Test
    public void windowsOpenFile() {
        assertEquals("WINDOWS, OPEN", new FileInvoker(windowsReceiver::open).execute());
    }

    @Test
    public void windowsWriteFile() {
        assertEquals("WINDOWS, WRITE", new FileInvoker(windowsReceiver::write).execute());
    }

    @Test
    public void windowsCloseFile() {
        assertEquals("WINDOWS, CLOSE", new FileInvoker(windowsReceiver::close).execute());
    }

    @Test
    public void macOpenFile() {
        assertEquals("MAC, OPEN", new FileInvoker(macReceiver::open).execute());
    }

    @Test
    public void macWriteFile() {
        assertEquals("MAC, WRITE", new FileInvoker(macReceiver::write).execute());
    }

    @Test
    public void macCloseFile() {
        assertEquals("MAC, CLOSE", new FileInvoker(macReceiver::close).execute());
    }
}
