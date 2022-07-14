package week1;

public class Marksheet {
    public static void main(String[] args) {

        System.out.println("Marksheet");

        // Declare variable and its datatype
        String nm = "khushbu Parekh";
        int rnm = 1;
        int g = 80;
        int m = 99;
        int s = 89;
        int e = 90;
        int c = 95;
        int t = g + m + s + e + c;
        float p = (t * 100)/500;//500 is all subject total
        //print outputs
        System.out.println("Full Name: " + nm);
        System.out.println("Roll Number: " + rnm);
        System.out.println("Subject            Marks out of 100");
        System.out.println("GUJARATI            " + g);
        System.out.println("MATHS               " + m);
        System.out.println("SCIENCE             " + s);
        System.out.println("ENGLISH             " + e);
        System.out.println("COMPUTER            " + c);
        System.out.println();
        System.out.println("Total               " + t);// total output
        System.out.println();
        System.out.println("Percentage          " + p);// prcentage output

    }
}