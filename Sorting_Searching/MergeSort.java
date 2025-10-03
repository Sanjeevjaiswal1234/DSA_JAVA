class MergeSort{

     public static void main(String [] args){
           int [] a = { 12, 21, 10,23, 14, 15,9,16};
           System.out.println("Before Sorting ");
           for(int x:a){
           System.out.print(x+" ");
          }
           System.out.println();
 
           divide( a,0,a.length-1);
           System.out.println("After Sorting ");


            for(int x:a){
            System.out.print(x+" ");
           }
           
     }
           public static int [] divide(int []a ,int low, int high){
             if(low<high){
             int mid=low + (high-low)/2;
             divide(a,low,mid);
             divide(a,mid+1,high);
             merge(a,low,mid,high);
          }
                 return a;
             }
           public static void merge(int []a,int low,int mid,int high){
              int [] merged= new int[high-low+1];
              int idx1=low,idx2=mid+1,x=0;
              while(idx1<=mid && idx2<=high){
                if(a[idx1]<a[idx2])
                merged[x++]=a[idx1++];
                else
                merged[x++] =a[idx2++];
             }
                      while(idx1<=mid)
                      merged[x++] = a[idx1++];
                      while(idx2<=high)
                      merged[x++]=a[idx2++];
                      for(int i=0,j=low;i<merged.length;i++,j++)
                      a[j] =merged[i];
           }
 }
