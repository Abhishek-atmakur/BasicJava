class Demo1{
  int a , b;
  Demo1(){
    System.out.println("Zero param constructor of Demo1");
  }
  Demo1(int a, int b){
    this.a = a;
    this.b = b;
    System.out.println("Param constructor of Demo1");
    System.out.println("a "+a+"b "+b);

  }
  
}

class Demo2 extends Demo1{
  int x, y;

  Demo2(){
    // ikkada by default super() method call untadi, manam kavalante explicit ga this method call aina super method call aina ivvochu and that too with parameters or without parameters
    //super(2,10)  ila icchi unte demo1 class lo default cons kaakunda param cons call ayyi a tarvata flow malli ikkadki vacchi a tarvara demo2 param construc call ayyedi
    super(2,10);
    System.out.println("Zero param constructor of Demo2");
  }

  Demo2(int x, int y){
    this();
    this.x = x;
    this.y = y;
    System.out.println("Param constructor of Demo2");
    System.out.println("x :"+x+" y :"+y);
  }

}




public class Cons1 {
  public static void main(String[] args) {
    Demo2 demo2 = new Demo2(2,5);
    
    
  }
}
