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
     * Subtracts second integer variable from the first integer variable.
     * This method does not throw exception when first integer varable is
     * smaller that second integer variable
     * @param x first integer variable
     * @param y second integer variable
     * @return  integer value denoting subtraction of first and second variables
     */
    @Override
    public int subtractionOperation(int x, int y) {
        if(x<y){
            throw new IllegalStateException();
        }else{
            return x-y;
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
