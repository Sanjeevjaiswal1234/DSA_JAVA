class QuickSort{
         public static void main (String [] args){
         int [] a ={ 12, 30,60, 18, 20, 40, 25,60, 15, 50};
          
          System.out.println("Before sorting ");
         for(int x:a){
           System.out.print(x+" ");
         }
          System.out.println();
          quickSort(a,0,a.length-1);
          System.out.println(" After sorting");
          for(int x:a){
           System.out.print(x+" ");
         }
      }
         public static void quickSort(int []a , int low , int high){
             if(low<high){
                     int partionIndex = partion(a,low,high);
                     quickSort(a,low,partionIndex-1);
                     quickSort(a,partionIndex+1,high);
            }
         }
           public static int partion(int [] a,int low ,int high){
                 int mid = low +(high-low)/2;
                 int pivot =a[mid];
                 
                 swap(a,mid,high);
                 int i =low;
                 for(int j=low;j<high;j++){
                 if(a[j]<pivot)
                  swap(a,i++,j);
                }
                  swap(a,i,high);

                return i;   
            }
          public static void swap(int [] a, int i, int j){
               int temp=a[i];
               a[i] =a[j];
               a[j]=temp;
         }
}
