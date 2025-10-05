class SelectionSort{
 
         public static void main(String [] args){
        
         int [] a ={ 12,21,10, 21,32, 10,5,15};
         
            System.out.println(" Before sorting ");
            for(int x :a){
            System.out.print(x+"  ");
             
         }
            System.out.println();
            selectionSort(a);
            System.out.println("After sorting");
            for(int x:a){
            System.out.print(x+"  "); 
        }
}
                      public static void selectionSort(int [] a){

                      for(int i =0;i<a.length-1;i++){
                      int min =a[i];
                      int index=i;
                        for(int j=i+1;j<a.length;j++){
                         if(a[j]<min){
                         min=a[j];
                         index=j;
                       }
                   }
                   a[index]=a[i];
                   a[i]=min;
                }
         }

}
