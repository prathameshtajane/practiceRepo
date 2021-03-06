import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class simpleCalculationsTest {

    simpleCalculations simpleOperations;

    @Before
    public void setUp() throws Exception {
        simpleOperations=new Calculations();
    }

    @Test
    public void additionOperationTest(){
        assertEquals(4,simpleOperations.additionOperation(2,2));
    }

    @Test
    public void subtractionOperationLargeSmallTest(){
        assertEquals(3,simpleOperations.subtractionOperation(5,2));
    }

    @Test(expected = IllegalStateException.class)
    public void subtractionOperationExceptionTest(){
        assertEquals(3,simpleOperations.subtractionOperation(2,5));
    }

    @Test
    public void subtractionOperationSmallLargeTest(){
        assertEquals(3,simpleOperations.subtractionOperation(2,5));
    }

    @Test
    public void multiplicationOperationTest() throws Exception {
        assertEquals(10,simpleOperations.multiplicationOperation(5,2));
    }
}
