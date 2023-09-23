public class BMICalculator {
    public static void main(String[] args){
        int Age = 21;;
        System.out.println( "Age\t" + Age);
        int WeightINKilos =90;
        float HeightInMeters =1.80f;
        double BMI = WeightINKilos / Math.pow(HeightInMeters,2);
        System.out.println("Your BMI is:" + BMI);
        if (BMI < 18.6){
            System.out.println("You are too Weak.");
        } else if (BMI < 24.9) {
            System.out.println("You have a Normal Weight.");
        } else if (BMI < 29.9) {
            System.out.println("You have a little risk Weight");
        } else if (BMI > 29.9) {
            System.out.println("You have a High Risk Weight");
        }
    }
}
