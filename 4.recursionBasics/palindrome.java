public class palindrome {
    public static boolean p(String str, int start, int end){
       if(start>=end){
        return true;
       }
       if(str.charAt(start)!=str.charAt(end)){
        return false;
       }
       return p(str, start+1, end-1);
    }
    public static void main(String[] args) {
       String str1 = "MADAM";
       String str2 = "Payal";
       System.out.println(p(str1, 0, str1.length()-1));
       System.out.println(p(str2, 0, str2.length()-1));
    } 
}