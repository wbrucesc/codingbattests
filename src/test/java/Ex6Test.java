import com.will.Ex6;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class Ex6Test {

    @Test
    public void SumMakesTen() throws Exception {
        boolean expectedOutput = true;
        assertEquals(expectedOutput, Ex6.makes10(4,6));
    }
}
