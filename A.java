class A {
    A() {
        System.out.println("no-arg constructer");
    }

    A(int x) {
        this();
        System.out.println("Parametrised Constructer");
    }

}

public class main {
    public static void main(String[] args) {
        A obj = new A(5);
    }
}
