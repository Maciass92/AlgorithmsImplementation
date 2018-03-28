public class FactorialFunction {

    public int returnFactorial(int searched){

        int result = 1;

        for(int i = 0; i < searched; i++){

            result *= i+1;
        }

        return result;
    }



}
