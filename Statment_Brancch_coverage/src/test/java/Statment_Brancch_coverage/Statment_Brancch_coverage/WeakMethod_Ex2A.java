package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeakMethod_Ex2A {
    @Test(expected = java.lang.ArithmeticException.class)
    public void WeakMethod2_FindError_NotFullBranchesCoverage(){
        int result = WeakClass.WeakMethod2(1, 0);
        assertEquals(1, result,0.001);
    }
}
