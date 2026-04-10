
class ABi20 {

}

class ABd250 extends ABi20 {

}

class Harrier {

    int price;

    public void run(int price) {
        System.out.println("Harrier drives well");
        System.out.println("Price is " + price);
    }

    public void Drinks() {
        System.out.println("Harrier drinks diesel");
    }

    public ABi20 coVariantExample() {
        ABi20 aBi20 = new ABi20();
        return aBi20;
    }

}

class Creta extends Harrier {

    public void run() {
        System.out.println("Creta drives well");
        System.out.println("Price is " + price);
    }

    @Override
    public void Drinks() {
        System.out.println("Creta drinks both petrol and diesel");
    }

    @Override
    public ABd250 coVariantExample() {
        ABd250 aBd250 = new ABd250();
        return aBd250;
    }

}

public class RulesToOverride {

    public static void main(String[] args) {
        Creta creta = new Creta();

    }

}
