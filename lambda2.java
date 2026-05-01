
interface i20 {

    String display(String name);
}

public class lambda2 {

    public static void main(String[] args) {
        // i20 i = (String name) -> {
        //     return "Hello, " + name + "! This is a lambda expression example.";
        // };
        // System.out.println(i.display("Abhishek")); //
        // i20 i = name -> "Hello, " + name + "! This is a lambda expression example."; // Lambda expression with implicit return
        // System.out.println(i.display("Abhishek"));
        i20 i = name -> "The name of the car is " + name;
        //info(i);
        info(name -> "The name of the car is " + name);
    }

    public static void info(i20 i) {
        System.out.println("This is a lambda expression example using a method reference " + i.display("Abhishek"));//
    }

}
