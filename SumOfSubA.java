public class SumOfSubA {
    public static void subOfSubArray(int arr[],int n){
        
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                }
                System.out.print("="+sum+" ,");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={-6,1,2,3};
        int n=arr.length;
        subOfSubArray(arr, n);
    }
    
}
