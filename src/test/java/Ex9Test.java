import com.will.Ex9;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class Ex9Test {

    @Test
    public void NotStringIsCorrect() throws Exception {
        String expectedOutput = "not very happy";
        assertEquals(expectedOutput, Ex9.notString("very happy"));
    }
}
