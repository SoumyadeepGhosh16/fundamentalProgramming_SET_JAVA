//finding the greatest common divisor

public class GCDcalc {

    static int calc(int x,int y){

        if(x == 0){

            return 0;
        }

        if(y == 0){

            return 0;
        }

        if( x==y ){

            return x;
        }

        if (x>y) {
            return calc(x-y , y);

        }
        
        return calc(x, y-x);
        
    }
    public static void main(String[] args) {
        
        int x = 100, y = 88; 
        System.out.println("GCD of " + x + " and " + y 
                           + " is " + calc(x, y)); 
    }
}
