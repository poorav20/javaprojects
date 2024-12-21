class factorial {
    static int factoria(int n) {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    // Main method
    public static void Main(String[] args) {
        int i = 5;
        System.out.println("The factorial of number 5" + factorial(5));
    }
}