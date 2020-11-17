package example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VowelsTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }
    @Test
    public void testCase2() {
        int a = 2;
        int b = 2;
        System.out.println(++a);
        System.out.println(b++);
        System.out.println(b);
    }

}

