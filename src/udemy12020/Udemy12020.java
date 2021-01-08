package udemy12020;
import java.util.Scanner;
import java.util.Locale;




public class Udemy12020 {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Locale.setDefault(Locale.US);
        Triangle t1=new Triangle();
        Triangle t2=new Triangle();
        System.out.println("Enter the measures of triangle X: ");
        t1.A=sc.nextDouble();
        t1.B=sc.nextDouble();
        t1.C=sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        t2.A=sc.nextDouble();
        t2.B=sc.nextDouble();
        t2.C=sc.nextDouble();
        double x=t1.area();
        double y=t2.area();
        
        System.out.printf("Triangle X area: %.4f%n", x);
        System.out.printf("Triangle Y area: %.4f%n", y);
        
        
        
        
    
    
    
    }
    
}
