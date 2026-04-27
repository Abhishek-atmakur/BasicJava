
class Person {

    private String name;
    String defaultAccessSpecifierExample;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Man {

    protected String eyesColor;

    // {
    //     eyesColor = "Black";
    // }
}

class Woman extends Man {

    public int age = 25;

    Woman() {
        eyesColor = "Blue";
        System.out.println("Eyes color: " + eyesColor);
    }

}

public class AccessModifiers {

    public static void main(String[] args) {

        Person p = new Person();
        p.setName("Abhi");
        String result = p.getName();
        System.out.println(result);
        p.defaultAccessSpecifierExample = "Default Access Specifier";
        System.out.println(p.defaultAccessSpecifierExample);

        Woman w = new Woman();

    }
}
