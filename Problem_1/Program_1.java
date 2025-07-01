package Problem_1;

import java.util.Scanner;

public class Program_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter value a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String op = sc.next();
        sc.close();
        double result = 0;
        switch(op.toLowerCase()) {
            case "add": result = calc.add(a, b); break;
            case "sub": result = calc.subtract(a, b); break;
            case "mul": result = calc.multiply(a, b); break;
            case "div": result = calc.divide(a, b); break;
            default: System.out.println("Invalid operation"); 
            return;
        }
        System.out.println("Result: " + result);
        
    }
     

}
