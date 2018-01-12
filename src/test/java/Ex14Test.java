import com.will.Ex14;
import org.junit.Test;
import static junit.framework.TestCase.*;

public class Ex14Test {

    @Test
    public void ThreeWorks() throws Exception {
        boolean expectedOutput = true;
        assertEquals(expectedOutput, Ex14.or35(9));
        System.out.println(Ex14.or35(9));
    }

    @Test
    public void FiveWorks() throws Exception {
        boolean expectedOutput = true;
        assertEquals(expectedOutput, Ex14.or35(25));
        System.out.println(Ex14.or35(25));
    }

    @Test
    public void OrThreeFiveWorks() throws Exception {
        boolean expectedOutput = false;
        assertEquals(expectedOutput, Ex14.or35(11));
        System.out.println(Ex14.or35(11));
    }
}
