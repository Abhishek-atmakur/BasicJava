
class A {

    static int a = 10;
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
