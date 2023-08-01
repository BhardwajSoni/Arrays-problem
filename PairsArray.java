public class PairsArray {
    //nested loop used
    public static void pairsArray(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+arr[i]+" "+arr[j]+") ");
            }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,7,6,4,8};
        int n=arr.length;
        pairsArray(arr, n);
        
    }
    
}
