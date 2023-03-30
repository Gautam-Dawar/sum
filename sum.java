import java.util.Scanner;  
class SumOfNumbers2  
{  
    public static void main(String args[])  
    {  
        int x, y, sum;  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x :");
        x = sc.nextInt();  
        System.out.println("Enter the value of y :");
        y = sc.nextInt(); 
        sum = sum(x, y);  
        System.out.println("The sum of numbers " + x + " and " + y + " is: " +sum );  
    }   
    public static int sum(int a, int b)  
    {  
        int sum = a + b;  
        return sum;  
    }
}