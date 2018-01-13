import com.will.Ex17;
import org.junit.Test;
import static junit.framework.TestCase.*;

public class Ex17Test {

    @Test
    public void IcyHotWorksProperly() throws Exception {
        boolean expectedOutput = true;
        assertEquals(expectedOutput, Ex17.icyHot(-1, 150));
    }

    @Test
    public void IcyHotWillReturnFalse() throws Exception {
        boolean expectedOutput = false;
        assertEquals(expectedOutput, Ex17.icyHot(5, 75));
    }

}
