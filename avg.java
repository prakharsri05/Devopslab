import java.util.*;
class avg
{
    public static void main(String[] args) 
    {
      int A,B,C,avg,sum;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first Number:");
      A = sc.nextInt();
      System.out.println("Enter second Number:");
      B = sc.nextInt();
      System.out.println("Enter third Number:");
      C = sc.nextInt();
      sum = A+B+C;
      avg = sum/3;
      System.out.println(avg);    

    }
}