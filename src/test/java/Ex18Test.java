import com.will.Ex18;
import org.junit.Test;
import static junit.framework.TestCase.*;

public class Ex18Test {

    @Test
    public void InTenTwentyWorksProperly() throws Exception {
        boolean expectedOutput = true;
        assertEquals(expectedOutput, Ex18.in1020(11, 19));
    }
}
