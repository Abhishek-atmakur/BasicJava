
class A {

    int b = 20;
    static int a = 10;

    // static void disp() {
    //     //System.out.println(b); // This will cause an error because static methods cannot access non-static variables    
    // }
}

class B {

    public void display() {
        System.out.println(A.a);
    }
}

public class staticEx {

    public static void main(String[] args) {
        System.out.println(A.a);
    }

}
