public class findSquareRoot {

    public double returnSquareRoot(double number){

        double min = 0;
        double max = number;
        double root = 0;

        while(max - min > 0.0000000000001){

            root = (min + max)/2;
            double result = root*root;

            if(result > number)
                max = root;
            else if(result < number)
                min = root;
        }

        return root;

    }
}
