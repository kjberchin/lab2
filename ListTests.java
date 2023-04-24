import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    @Test
    public void testFilter(){
        List<String> testList = new ArrayList<String>();
        testList.add("A");
        testList.add("B");
        testList.add("C");
        ListExamples.filter(testList, ListExamples.StringChecker sc)
    }
}
