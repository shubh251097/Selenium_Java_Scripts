package arrays;

import java.util.Arrays;

public class array1 {

	public static void main(String[] args) {
		int a[]= {5,10,15,20,25};
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		//System.out.println(a[7]);
		try {
		System.out.println(a[7]);
		}
		catch(Exception e) {
			System.out.println("ArrayIndexOutofBoundException");
		}
		
		
		
System.out.println(a[2]);
for(int k:a) {
	System.out.print(k+ " ");
}
System.out.println();

for (int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
a[2]=6;
a[4]=28;
System.out.println(a[4]);
for(int k:a) {
	System.out.print(k+ " ");
}

	}

}
