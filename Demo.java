public class Demo {
    int x = 10;

    explicit(int x){
        this.x=x;
    }

    void print() {
        System.out.println(x);
    }

    public class explicit {
        public static void main(String[] args) {
            Demo obj= new Demo(x:20);
        obj.print();
        }
    }
}
