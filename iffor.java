public class iffor {
    public static void main(String[] args) {
        for (int i = 3; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "is an even number");
            } else {
                System.err.println(i + "is an odd number");
            }
        }
    }

}
