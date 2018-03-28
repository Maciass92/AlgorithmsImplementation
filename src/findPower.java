public class findPower {

    public double returnPower(double number, double power){

        if(power == 0)
            return 1;
        else {
            if (power < 0) {
                System.out.println("Number: " + number + ", Power: " + power);
                return ((1/number) * returnPower(number, power + 1));
            }
            else
                return number * returnPower(number, power - 1);
        }
    }
}
