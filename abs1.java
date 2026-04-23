
abstract class ab2 {

    public abstract void disp();
}

public class abs1 extends ab2 {

    public static void main(String[] args) {

        // ab2 ref = new ab2();
        // ref.disp();
    }

    @Override
    public void disp() {
        throw new UnsupportedOperationException("Not supported yet.");

    }

}
