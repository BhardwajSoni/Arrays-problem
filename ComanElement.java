public class ComanElement {
    public static void  commarElement(int A[],int B[]){
        int count=0;
         for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                if(A[i]==B[j]){
                    count++;
                   // System.out.println("true");
                     
                } 
                 
            }
         }
         if(count>0){
            System.out.println("true");
         }else{
            System.out.println("false");
         }
    }
    public static void main(String[] args) {
        int A[]={5,7,9,10,12};
        int B[]={2,6,4,78};
        commarElement(A, B);
    }
    
}
