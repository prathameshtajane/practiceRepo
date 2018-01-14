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
    public void subtractionOperationTest(){
        assertEquals(3,simpleOperations.subtractionOperation(5,2));
    }

    @Test
    public void multiplicationOperationTest() throws Exception {
        assertEquals(10,simpleOperations.multiplicationOperation(5,2));
    }
}
