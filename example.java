
class Hero {

    public void show() {
        System.out.println("Parent Class method");
    }
}

class Hero2 extends Hero {

    @Override
    public void show() {
        System.out.println("Parent Class method is now overridden");
    }

    public void disp() {
        System.out.println("Child class method");
    }

    public void childClassMethod() {
        System.out.println("This is a specialised method of child class");
    }
}

public class example {

    public static void main(String[] args) {
        Hero2 hero2 = new Hero2();
        hero2.show();
        hero2.childClassMethod();
        Hero hero = new Hero2();
        hero.show();
        ((Hero2) hero).childClassMethod();

    }
}
