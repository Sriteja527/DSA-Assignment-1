import java.util.*;
public class Array3 {
	Scanner sc = new Scanner(System.in);
void input() {
	System.out.println("enter the size:");
	int n = sc.nextInt();
	System.out.println("Enter the value:");
	int value = sc.nextInt();
	System.out.println("enter the array elements:");
	int arr[] = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt(); //1,3,5,6
	}
	for(int i=0;i<n;i++) {
		if(arr[i] == value) {
			System.out.println(i);
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array3 a = new Array3();
		a.input();

	}

}