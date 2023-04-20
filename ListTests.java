import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;




public class ListTests{

    StringChecker a=new CheckA();
    @Test
    public void testfilter(){
        ArrayList<String> input1 =new ArrayList<>();
        assertEquals(new ArrayList<>(),ListExamples.filter(input1,a));
    }

    @Test
    public void testfilter1(){
        ArrayList<String> input1 =new ArrayList<>();
        input1.add("a");
        assertEquals(Arrays.asList("a"),ListExamples.filter(input1, "a"));
    }

}
