package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeakMethod_Ex4B {
    @Test(expected = java.lang.ArithmeticException.class)
    public void WeakMethod4_FindError_NotFullBranchesCoverage(){
        int result = WeakClass.WeakMethod4(20, 0);
        assertEquals(0, result,0.001);
    }
}
