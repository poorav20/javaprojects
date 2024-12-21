public class ShiftOperatorExample {
    public static void main(String[] args) {
        int a = -10;
        //Left shift operator
        System.out.println("Left shift (a<<2):" + (a << 2));
        //Right shift operator
        System.out.println("Right shift (a >> 2):" + (a >> 2));
        //Unsigned Rigth shift operator
        int b = -2;
        System.out.println("Unsigned Rigth shift (b >>> 2):" + (b >>> 2));
    }
}
