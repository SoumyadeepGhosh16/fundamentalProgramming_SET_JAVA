class helpline{
    protected interface supportLine{
         void help();      
    }
}

     class Emergency implements helpline.supportLine {
        public void help(){
            System.out.println("help required");
        }
     }

     public class Interface3{
    
    public static void main(String[] args) {
        
        Emergency e = new Emergency();
        e.help();
    }
}
