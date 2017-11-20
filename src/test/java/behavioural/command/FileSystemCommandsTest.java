package behavioural.command;

import behavioural.command.file.*;
import behavioural.command.system.FileSystemReceiver;
import com.sun.javafx.PlatformUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by mtumilowicz on 2017-11-20.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(PlatformUtil.class)
public class FileSystemCommandsTest {
    
    private FileSystemReceiver windowsReceiver;
    private FileSystemReceiver macReceiver;

    @Before
    public void setUp() {
        PowerMockito.mockStatic(PlatformUtil.class);
        PowerMockito.when(PlatformUtil.isMac()).thenReturn(false);
        PowerMockito.when(PlatformUtil.isWindows()).thenReturn(true);
        windowsReceiver = FileSystemReceiverFactory.get();

        PowerMockito.when(PlatformUtil.isMac()).thenReturn(true);
        PowerMockito.when(PlatformUtil.isWindows()).thenReturn(false);
        macReceiver = FileSystemReceiverFactory.get();
    }
    
    @Test
    public void windowsOpenFile() {
        assertEquals("WINDOWS, OPEN", new FileInvoker(new OpenFileCommand(windowsReceiver)).execute());
    }

    @Test
    public void windowsWriteFile() {
        assertEquals("WINDOWS, WRITE", new FileInvoker(new WriteFileCommand(windowsReceiver)).execute());
    }

    @Test
    public void windowsCloseFile() {
        assertEquals("WINDOWS, CLOSE", new FileInvoker(new CloseFileCommand(windowsReceiver)).execute());
    }

    @Test
    public void macOpenFile() {
        assertEquals("MAC, OPEN", new FileInvoker(new OpenFileCommand(macReceiver)).execute());
    }

    @Test
    public void macWriteFile() {
        assertEquals("MAC, WRITE", new FileInvoker(new WriteFileCommand(macReceiver)).execute());
    }

    @Test
    public void macCloseFile() {
        assertEquals("MAC, CLOSE", new FileInvoker(new CloseFileCommand(macReceiver)).execute());
    }
}
