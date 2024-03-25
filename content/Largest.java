public class Largest {

    //using if-else condition
    static int biggestOfThree(int x,int y,int z){

        if( x>=y && x>=z){

            return x;
        }
        else if(y>=x && y>=z){

            return y;
        }else{

            return z;
        }
    }

    //using ternary operator
    static int biggestOfThree2(int x,int y,int z){

        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }

    public static void main(String[] args) {
        
        int largest;

        largest=biggestOfThree(5,9,4);

        System.out.println(largest +" " +
                            "is the largest number");

    }
}
