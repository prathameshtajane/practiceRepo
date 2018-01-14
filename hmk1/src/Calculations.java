/**
 * Calulcation class impements simple calculcations interface
 * and provides functionality to add,subtract and multiply two values.
 * @author prathamesh
 * @version
 */

public class Calculations implements simpleCalculations{


    /**
     * Adds two integer variables and returns addition value
     * @param x first integer variable
     * @param y second integer variable
     * @return  integer value denoting addition of first and second variables
     */
    @Override
    public int additionOperation(int x, int y) {
        return x+y;
    }

    /**
     * Subtracts smaller integer from the large integer
     * @param x first integer variable
     * @param y second integer variable
     * @return  integer value denoting subtraction of smaller integer valie from the larger integer value
     */
    @Override
    public int subtractionOperation(int x, int y) {
        if(x >= y) {
            return x - y;
        }else{
            return y - x;
        }
    }

    /**
     * Multiplies two integer variables and returns multiplication value
     * @param x first integer variable
     * @param y second integer variable
     * @return  integer value denoting multiplication of first and second variables
     */
    @Override
    public int multiplicationOperation(int x, int y) {
        return x*y;
    }
}
