class InsertionSort{

         public static void main(String [] args){
        
         int [] a ={ 12,13,10, 21,32, 17,19,15};
         
            System.out.println(" Before sorting ");
            for(int x :a){
            System.out.print(x+"  ");
             
             }
            System.out.println();
            insertionSort(a);
            System.out.println("After sorting");
            for(int x:a){
            System.out.print(x+"  "); 
          }
    }
            public static void insertionSort(int []a){
              
                for(int i=1;i<a.length;i++){
                       int key=a[i];
                       int j =i-1;
                       while(j>=0 && a[j]>key){
                         a[j+1] =a[j];
                         j--;
                    }
                         a[j+1] =key;
                 }
            }
          
}
