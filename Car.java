
class Mult{
  int mult(int x,int y){
    int n1 = x;
    int n2 = y;
    return n1*n2;
  }

}



public class Car{
  public static void main(String[] args) {
    Mult mult = new Mult();
    int result = mult.mult(10, 5);
    System.out.println(result);
  }
}