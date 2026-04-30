
interface A {

    void display();
}

class B implements A {

    @Override
    public void display() {
        System.out.println("This is a lambda expression example using inheritance"); // This is a lambda expression example using inheritance
    }
}

public class innerclass {

    public static void main(String[] args) {
        B b = new B();
        b.display();

        A a = new A() {
            @Override
            public void display() {
                System.out.println("This is an anonymous inner class example");
            }
        }; // Anonymous inner class implementing the display method of interface A

        a.display();
    }

}
