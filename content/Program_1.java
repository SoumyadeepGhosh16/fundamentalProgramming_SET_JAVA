import java.util.*;
//java program to swap two numbers

public class Program_1 {

    public static void swapNumber(int a,int b){
        
        int temp=a;
        a=b;
        b=temp;

        System.out.println("the swapped value of a and b are:" );

        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
    public static void main(String[] args) {
        swapNumber(5,15);
    }
}
