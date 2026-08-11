public class printNTo1 {

   public static void print1N(int n) {
      if (n==0) {
         return;
      }
      System.out.println(n);
      print1N(n-1);
   }

   public static void main(String[] var0) {
    int n=5;
    print1N(n);
   }
}
