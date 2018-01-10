import com.will.Ex1;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class Ex1Test {
    @Test
    public void SleepInIsCorrect() throws Exception {
        boolean expectedOutput = true;
        assertEquals(expectedOutput, Ex1.sleepIn(true, true));
    }
}
