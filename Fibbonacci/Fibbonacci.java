import java.util.Scanner;

public class Fibbonacci {

    public static void main(String[] args) {
        System.out.print("Jumlah Deret Fibonacci:");
        Scanner input = new Scanner(System.in);
        
        int hitung = input.nextInt();
        
        for (int i=1; i <= hitung; i++)
        {
            System.out.print(methodFibonacci(i) + " ");
        }
    }
    
    public static int methodFibonacci(int fibonacciInput)
    {   
        int x;
        int n = fibonacciInput;
        if(n <=0 || n<=1)
        {
           return n; 
        }
       
        else
        {
            return methodFibonacci(n-2) + methodFibonacci(n-1) ;
        }
            
    }
    }