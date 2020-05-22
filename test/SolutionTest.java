import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void contructWeirdSolutionTest(){

        String expected = "Weird";
        String actual = "*insert main function call*";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void contructNotWeirdSolutionTest(){
        String expected = "Not Weird";
        String actual = "*insert main function call*";

        Assert.assertEquals(expected, actual);

    }
}
