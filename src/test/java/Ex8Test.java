import com.will.Ex8;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class Ex8Test {

    @Test
    public void PosNegIsCorrect() throws Exception {
        boolean expectedOutput = true;
        assertEquals(expectedOutput, Ex8.posNeg(-1, 3, false));
    }
}
