class CountSort{
              
         public static void main(String [] args){
        
         int [] a ={ 12,13,10, 21,32, 17,19,15};
         
            System.out.println(" Before sorting ");
            for(int x :a){
            System.out.print(x+"  ");
             
             }
            System.out.println();
               countSort(a);
            System.out.println("After sorting");
            for(int x:a){
            System.out.print(x+"  "); 
          }
    }
             public static void countSort(int []a ){
                   int min=a[0];int max =a[0];
                   for(int p:a){
                   if(p>max)
                   max=p;
                   else if(p<min)
                   min=p;
                } 
                  int [] freq = new int[max-min+1];
                  for (int p : a) {
                  freq[p - min]++;   // count each element
                  }

                  int i =0;
                  for(int j =0;j<freq.length;j++){
                  while(freq[j]>0){
                   a[i++] = j+min;
                   freq[j]--;
                  }
                }
             }

}
