import java.util.*;
class calculator{
static int add(int a,int b){
return a+b;
}
static int subtract(int a, int b){
return a-b;
}
static int multiply(int a,int b){
return a*b;
}
static int divide(int a,int b){
return a/b;
}

public static  void main (String args[]){

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();

System.out.println("Addition: "+add(a,b)+"\nSubtraction: "+subtract(a,b)+"\nMultiply: "+multiply(a,b)+"\nDivide"+ divide(a,b));

        if (b != 0) {
            System.out.println("Division: " + divide(a, b));
        } else {
            System.out.println("Cannot divide by zero!");
        }

}
}

