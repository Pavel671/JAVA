import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Main1Test {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {true, new int[]{1, 1, 1, 1, 1}},
                {true, new int[]{4, 4, 4, 4, 4}},
                {true, new int[]{2, 3}},
                {true, new int[]{1, 1, 4, 4, 4, 4, 1, 1}},
        });
    }

    private Main1 test;
    private boolean bool;
    private int[] array;

    public Main1Test(boolean bool, int[] array) {
        this.bool = bool;
        this.array = array;
    }

    @Before
    public void init() {
        test = new Main1();
    }

    @Test
    public void testTask2() {
        Assert.assertEquals(bool, test.doIt(array));
    }
}
