public class reverseArr {
    public static void Reverse(int arr[], int start, int end){
       if(start>=end){
        return;
       }
       int temp=arr[start];
       arr[start]=arr[end];
       arr[end]=temp;
       Reverse(arr, start+1, end-1);
    }
    public static void main(String[] args) {
        int arr[]={2, 4, 6, 8, 10};
        Reverse(arr, 0, 4);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}