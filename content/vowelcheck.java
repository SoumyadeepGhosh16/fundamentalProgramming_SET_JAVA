public class vowelcheck {

    static void checker(char y){

        if(y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u' || y == 'A' || y == 'E' || y == 'I' || y == 'O' || y == 'U'){

            System.out.println("it is a vowel.");
        }else{
            System.out.println("it is a consonant");
        }
    }
    public static void main(String[] args) {
        
        checker('W');
        checker('A');
    }
}
