
interface class1 {

    void method1();

    void method2(); // these methods are by default public and abstract

    default void method7() {
        System.out.println("This is a default method of interface");
    }

    private void method8() {
        System.out.println("This is a private method of interface");
    }

    static void method9() {
        System.out.println("This is a static method of interface");
    }
}

interface class2 {

    void method3();

    void method4();
}

interface class4 extends class1, class2 {

    void method5();

    void method6();
}

class class3 implements class4 {

    @Override
    public void method1() {
        System.out.println("Method 1 of class1 is implemented");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 of class1 is implemented");
    }

    @Override
    public void method3() {
        System.out.println("Method 3 of class2 is implemented");
    }

    @Override
    public void method4() {
        System.out.println("Method 4 of class2 is implemented");
    }

    @Override
    public void method5() {
        System.out.println("Method 5 of class4 is implemented");
    }

    @Override
    public void method6() {
        System.out.println("Method 6 of class4 is implemented");
    }
}

public class interfaceExample {

    public static void main(String[] args) {
        class3 c = new class3();
        c.method1();
        c.method3();
        c.method5();
        c.method7();
        class1.method9();

    }
}
