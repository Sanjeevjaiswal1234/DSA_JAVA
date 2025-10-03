class Heapsort{
      public static void main(String [] args){
              int [] a ={ 23, 12, 32, 9,7, 11, 12, 13,6};
              for(int x:a){
               System.out.print(x+" ");
               }
              heapSort(a);
              System.out.println();
              for(int x:a){
              System.out.print(x+" ");
              }
            }
               public static void heapSort(int [] a){
                 int n = a.length;
                 for(int i=n/2-1;i>=0;i--)
                     heapify(a,n,i);
                     for(int i=n-1;i>=0;i--){
                     swap(a,i,0);
                     heapify(a,i,0);
                }
                 
            }
               public static void heapify(int [] a,int n ,int i){
                   int largest=i;

                   int left=2*i+1;
                   int right=2*i+2;
                  
                   if(left<n && a[left]>a[largest])
                        largest=left;
                   if(right<n && a[right]>a[largest])
                         largest=right;
                    if(i!=largest){
                       swap(a,i,largest);
                       heapify(a,n,largest);
                    }
               }
                  public static void swap(int[] a, int i, int j) {
                      int temp = a[i];
                     a[i] = a[j];
                     a[j] = temp;
            }

   }
