package junit_test;

import org.junit.Test;
import junit.framework.Assert;

public class test_case {
    @Test
    public void testSum1() {
        int result = Sumutil.sum1(1, 2);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testSum2() {
        int result = Sumutil.sum2(1,2,3);
        Assert.assertEquals(result, 3);
    }
}
