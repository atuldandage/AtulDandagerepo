package array;

public class arrayMinnumber {
	
	public static void main(String[] args) {
		
	int[]a= {30,20,40,10};
	
	int min=a[0];	
	for( int i=0 ;i<a.length  ;i++  ) {
		if(a[i]<min) {
			min=a[i];
		}
		
	}	
	System.out.println(min);
	}
	

}
/*
public static void main(String[] args) {
//0 1 2 3
int[] a = { 30, 20, 40, 10 };
int min = a[0];
for (int i = 0; i < a.length; i++) {
if (a[i] < min) {
min = a[i];
}
}
System.out.println("smallest element from an array is " + min);
}// main ends
}

*/