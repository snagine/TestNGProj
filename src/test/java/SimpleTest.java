import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTest {
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @Test(priority = 1, enabled = false)
    public void testOnStrAssert(){
        Assert.assertEquals("shy", "shy");
    }

    @Test(priority = 2)
    public void testOnIntAssert(){
        Assert.assertEquals(1, 1);
    }

    @Test(priority = 3)
    public void testOnBoolAssert(){
        Assert.assertEquals(true, true);
    }

    @Test(priority = 4)
    public void testOnBoolAssert2(){
        Assert.assertTrue(true);
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }
}
