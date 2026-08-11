public class printNameNTimes {
    public static void printName(int n){
        if(n==0){
            return;
        }
        System.out.println("Payal");
        printName(n-1);
    }
    public static void main(String args[]){
        int n=5;  
        printName(n);
    }
}
