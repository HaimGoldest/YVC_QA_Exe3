package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeakMethod_Ex1A {
    @Test(expected = java.lang.ArithmeticException.class)
    public void WeakMethod1_FindError_NotFullStatementsCoverage(){
        int result = WeakClass.WeakMethod1(1, 0);
        assertEquals(1, result,0.001);
    }
}
