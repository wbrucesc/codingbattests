import com.will.Ex13;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class Ex13Test {

    @Test
    public void BackAroundWorking() throws Exception {
        String expectedOutput = "tcatt";
        assertEquals(expectedOutput, Ex13.backAround("cat"));
        System.out.println(Ex13.backAround("cat"));
    }

    @Test
    public void BackAroundCorrectWhenLengthIsOne() throws Exception {
        String expectedOutput = "aaa";
        assertEquals(expectedOutput, Ex13.backAround("a"));
        System.out.println(Ex13.backAround("a"));
    }
}
