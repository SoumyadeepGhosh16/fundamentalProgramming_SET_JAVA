
    import java.io.*;
 
// A simple interface
interface In1 {
   
    // public, static and final
    final int a = 10;
 
    // public and abstract
    void display();
}
 
// A class that implements the interface.
class TestClass implements In1 {
   
    public void display(){ 
      System.out.println("practice makes perfect"); 
    }
 
    public static void main(String[] args)
    {
        TestClass t = new TestClass();
        t.display();
        System.out.println(a);
    }
}

