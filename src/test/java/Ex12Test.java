
import com.will.Ex12;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class Ex12Test {
    @Test
    public void FrontThreeWorksProperly() throws Exception {
        String expectedOutput = "JavJavJav";
        assertEquals(expectedOutput, Ex12.front3("Java"));
    }

    @Test
    public void FrontThreeWorksWhenLengthLessThanThree() throws Exception {
        String expectedOutput = "ababab";
        assertEquals(expectedOutput, Ex12.front3("ab"));
    }
}
