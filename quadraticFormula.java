import java.util.*;
public class quadraticFormula
    
{
  static Scanner console = new Scanner(System.in);
  public static void main(String[] args)
  {
    double a,b,c;
  
    try 
    {
      System.out.println("Please enter a number for value A");
    a = console.nextDouble();
    System.out.println("Please enter a number for value B");
    b = console.nextDouble();
    System.out.println("Please enter a number for value C");
    c = console.nextDouble();
    System.out.println(root(a,b,c));
    }
    catch (InputMismatchException d)
    {
      System.out.println(d.toString());
    }
    catch (ArithmeticException f)
    {
      System.out.println(f.toString());
    }
    catch (Exception g)
    {
      System.out.println(g.toString());
    }
    finally
    {
      System.out.println("The program is existing because an error was created.");
    }
  }
    
      
  
  
static double root(double A, double B, double C)
                                 throws IllegalArgumentException 
{
            // Returns the larger of the two roots of the quadratic equation A*x*x + B*x + C = 0.
            // (Throws an exception if A == 0 or B*B-4*A*C < 0.)

         if (A == 0) 
         {
           throw new IllegalArgumentException("A cannot be zero.");
         }
         else 
         {
            double disc = B*B - 4*A*C;
            System.out.println ("A = " + A + "  B = " + B + "  C = " + C);
            if (disc < 0)
               throw new IllegalArgumentException("Discriminant < zero.");
            return  (-B + Math.sqrt(disc)) / (2*A);
         }
     }
}