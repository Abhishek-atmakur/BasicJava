
@FunctionalInterface
interface A {

    void display();
}

// class B extends A {
//     @Override
//     public void display() {
//         System.out.println("This is a lambda expression example using inheritance");
//     }
// }
public class lambdaexp {

    public static void main(String[] args) {
        A a = () -> System.out.println("This is a lambda expression example using functional interface"); // Lambda expression implementing the display method of interface A
        a.display();
    }
}
