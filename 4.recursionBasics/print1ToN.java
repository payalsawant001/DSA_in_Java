public class print1ToN {

    public static void print1N(int curr, int n) {

        // Base case
        if (curr > n) {
            return;
        }

        // Work
        System.out.println(curr);

        // Recursive call
        print1N(curr + 1, n);
    }

    public static void main(String[] args) {
        int n = 5;
        print1N(1, n);
    }
}