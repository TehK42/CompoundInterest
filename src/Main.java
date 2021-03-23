import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Principal
        System.out.println("Principal Amount = ");
        float principal = input.nextFloat();

        //Rate
        System.out.println("Rate in decimal = ");
        float rate = input.nextFloat();

        //Time
        System.out.println("Time in years = ");
        float time = input.nextFloat();

        //Number of times interest is compounded
        System.out.println("Number of times interest is compounded = ");
        float compound = input.nextFloat();

        //Compound Interest Formula
        double compoundInterest = principal * Math.pow(1 + (rate / compound), compound * time);
        System.out.println("Compound Interest after " + time + " years is " + compoundInterest);



    }
}
