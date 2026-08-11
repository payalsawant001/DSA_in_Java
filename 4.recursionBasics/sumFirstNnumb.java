public class sumFirstNnumb {
    public static int sumFN(int n){
        if(n==0){
            return 0;
        }
        return n+sumFN(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumFN(n));
    }
}
