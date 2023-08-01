public class SubArray {
    public static void subArray(int arr[],int n){
        //nested loop
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            for(int j=i+1;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={2,5,3,4,1};
        int n=arr.length;
        subArray(arr, n);
    }
    
}
