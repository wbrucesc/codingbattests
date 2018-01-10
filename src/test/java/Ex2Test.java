import com.will.Ex2;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;



public class Ex2Test {

    @Test
    public void DiffIsCorrect() throws Exception {
        double difference = 8;
        assertEquals(difference, Ex2.diff21(25));
    }
}
