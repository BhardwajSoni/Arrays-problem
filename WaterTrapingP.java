public class WaterTrapingP {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void trappingWater(int height[],int n){
        //auxiliary array
        int rightMax[]=new int[n];
        int leftMax[]=new int[n];
        
        leftMax[0]=height[0];
        rightMax[n-1]=height[n-1];
        //int waterlevel=0;
        int trapp=0;
       ///left maximum boundary
        for(int i=1; i<n;i++){
           leftMax[i]=Math.max(leftMax[i-1], height[i]);
        }
        printArray(leftMax);
        //right maximum boundary
        for(int j=n-2;j>=0;j--){
            rightMax[j]=Math.max(rightMax[j+1],height[j] );
        }
        printArray( rightMax);
        //calculate  ...
        for(int k=0;k<n;k++){
            //water level of every bar
          int  waterlevel=Math.min( rightMax[k], leftMax[k]);
          //tolat trapping water .. width==1 given by question.
            trapp+=(waterlevel-height[k])*1;
        }
       System.out.println(trapp);
    }
     public static void main(String[] args) {
       int height[]={4,2,0,6,1,2,5};
       int n=height.length;
       trappingWater(height, n);
     }
    
}
