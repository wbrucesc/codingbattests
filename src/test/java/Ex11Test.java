import com.will.Ex11;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class Ex11Test {
    @Test
    public void FrontBackWorkingProperly() throws Exception {
        String expectedOutput = "yapph";
        assertEquals(expectedOutput, Ex11.frontBack("happy"));
    }

    @Test
    public void FrontBackWorkingWithLengthOfOne() throws Exception {
        String expectedOutput = "a";
        assertEquals(expectedOutput, Ex11.frontBack("a"));
    }


}
