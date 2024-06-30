interface camera{
    void takesnap();
    void recordvideo();  
    default void record4kvideo(){
        System.out.println("recording in 4k");//if we consider a method as default then it will not stop the implementation of other methods in interface
    }
}

interface wifi{
    String[] getnetworks();
    void connecttonetworks(String network);
}
class Cellphone{
    void callNumber(int phonenumber){
        System.out.println("calling" +phonenumber);
    }
    void pickNumber(){
        System.out.println("connecting...");
    }
   //this below method can ovveride the same method present in the interface 
    /*void record4kvideo(){
        System.out.println("recording video at 4k with smartphone");
    }*/
}

class smartphone extends Cellphone implements wifi,camera{
       public void takesnap(){
        System.out.println("taking a photo");
    } 
       public void recordvideo(){
        System.out.println("recording a video");
    }
       public String[] getnetworks(){
        System.out.println("getting list of networks");
        String[] networklist={"prasidh","umesh","soumen"};
        return networklist;
    }
        public void connecttonetworks(String network) {
           System.out.println("connecting to.." +network);
            
        }
}
public class Interface2 {
    public static void main(String[] args) {
       smartphone s=new smartphone() ;

       s.record4kvideo();
       String[] ar=s.getnetworks();

       for (String item : ar) {
        System.out.println(item);
       }

       s.connecttonetworks("receiver");
    }
}
