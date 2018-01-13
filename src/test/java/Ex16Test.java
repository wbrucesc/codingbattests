import com.will.Ex16;
import org.junit.Test;
import static junit.framework.TestCase.*;


public class Ex16Test {

    @Test
    public void StartHiWorks() throws Exception {
        boolean expectedOutput = true;
        assertEquals(expectedOutput, Ex16.startHi("hi there"));
    }

    @Test
    public void StartHiFalse() throws Exception {
        boolean expectedOutput = false;
        assertEquals(expectedOutput, Ex16.startHi("hello hi"));
    }

}
