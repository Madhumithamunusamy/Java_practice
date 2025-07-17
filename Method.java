import java.util.Scanner;
class A{
    public static void main(String[] args) {
        A ob=new A();
        ob.Addition();
    }
    public void Addition(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a =sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c);
        subtraction();
        Multiplication();
        Division();
    }
    public void  subtraction(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a =sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int c=a-b;
        System.out.println(c);
    }
    public void  Multiplication(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a =sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int c=a*b;
        System.out.println(c);
    }
    public void  Division(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a =sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int c=a/b;
        System.out.println(c);
    }
        
}
