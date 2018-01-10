import com.will.Ex7;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class Ex7Test {

    @Test
    public void NearTenIsCorrect() throws Exception {
        boolean expectedOutput = true;
        assertEquals(expectedOutput, Ex7.nearHundred(90));
    }
}
