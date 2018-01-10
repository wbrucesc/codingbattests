import com.will.Ex4;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class Ex4Test {

    @Test
    public void TroubleIsCorrect() throws Exception {
        boolean expectedOutput = false;
        assertEquals(expectedOutput, Ex4.monkeyTrouble(false, true));
    }
}
