public class FactorialFunctionRecursive {

    public int returnFactorial(int searched){

        if(searched == 0)
            return 1;
        else
            return searched*returnFactorial(searched -1 );

    }

}
