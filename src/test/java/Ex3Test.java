import com.will.Ex3;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class Ex3Test {

    @Test
    public void TroubleIsCorrect() throws Exception {
        boolean expectedOutput = false;
        assertEquals(expectedOutput, Ex3.parrotTrouble(true, 10));
    }

}
