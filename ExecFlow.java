class Demo{
  static int a,b;
  static{
    a =10;
    b= 20;
    System.out.println("Static Block");
  }
  
  {
    System.out.println("Java init Block/non static");
  }
  Demo(){
    System.out.println("Constructor");
  }
  static void display(){
    System.out.println("Static display method");
  }
  void show(){
    System.out.println("non static method");
  }
  static void justMethod(){
    System.out.println("Just a static method");
  }

}





public class ExecFlow {
  static{
    System.out.println("Main method static block");
  }
  public static void main(String[] args) {
    System.out.println("Main method");
    Demo demo = new Demo();
    demo.show();
    Demo.display();
    Demo.justMethod();
    System.out.println(Demo.a);
    System.out.println(Demo.b);

  }
}
