import com.will.Ex5;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class Ex5Test {

    @Test
    public void DoubleSumIsCorrect() throws Exception {
        int expectedOutput = 20;
        assertEquals(expectedOutput, Ex5.sumDouble(5, 5));
    }
}
