///reverce of array using swap

public class ReverceArray{
    
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static int[] swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
        return arr;
        
    }
    public static void reverce(int arr[],int n){
        int first=0;
        int last=n-1;
        while(first<last){
            swap(arr, first, last);
            first++;
            last--;

        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,9,5,2};
        int n =arr.length;
        reverce(arr, n);
        printArray(arr);
    }
}