import com.will.Ex10;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class Ex10Test {

    @Test
    public void CharacterIsMissing() throws Exception {
        String expectedOutput = "ktten";
        assertEquals(expectedOutput, Ex10.missingChar("kitten", 1));
    }
}
