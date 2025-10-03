class BubbleSort{
	public static void main(String[] args){
		int[] a={12, 8, 15, 18, 10, 16, 11};
		System.out.println("====Before Sorting====");
		for(int x:a)
			System.out.print(x+" ");
		bubbleSort(a);	
		System.out.println("\n====After Sorting====");
		for(int x:a)
			System.out.print(x+" ");	
	}
	public static void bubbleSort(int[] a){
		int n=a.length-1;
		for(int i=0;i<n;i++){
			boolean flag=true;
			for(int j=0;j<n-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
          a[j+1]=temp;
				flag=false;
				}
			}
			if(flag)
				return;
		}
	}
}
