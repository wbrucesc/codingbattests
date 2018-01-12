import com.will.Ex15;
import org.junit.Test;
import static junit.framework.TestCase.*;

public class Ex15Test {

    @Test
    public void FrontTwoWorks() throws Exception {
        String expectedOutput = "kikittenki";
        assertEquals(expectedOutput, Ex15.front22("kitten"));
        System.out.println(Ex15.front22("kitten"));
    }

    @Test
    public void LessThanTwoChars() throws Exception {
        String expectedOutput = "aaa";
        assertEquals(expectedOutput, Ex15.front22("a"));
        System.out.println(Ex15.front22("a"));
    }
}
