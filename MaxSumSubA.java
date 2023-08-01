public class MaxSumSubA {
    public static void maxSubOfSubArray(int arr[],int n){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                }
                System.out.print("="+sum+" ,");
                if(largest<sum){
                    largest=sum;
                }
            }
        }
        System.out.println("largest sub array is :"+largest);
    }
    public static void main(String[] args) {
        int arr[]={-6,1,2,3};
        int n=arr.length;
        maxSubOfSubArray(arr, n);
    }
    
}
