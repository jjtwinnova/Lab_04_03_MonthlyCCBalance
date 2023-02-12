public class Lab_04_03_MonthlyCCBalance {
    public static void main(String[] args) {

        //Declare Variables
        double balance = 5000;
        int count = 1;

        while (count <= 2)
        {
            balance = balance * 1.17;
            System.out.println("Your balance after " + count + " month is " + balance + ".");
            count++;
        }

    }
}