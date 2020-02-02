 abstract class Test{
  public abstract void m1();
}

class Main {
  
  public static void main(String[] args) {
    Test t = new Test()
    {
      public void m1(){
        System.out.println("Anonymous Inner class implemting ABSTRACT class");
      }
    };
    t.m1();
    System.out.println("Hello world!");
  }
}