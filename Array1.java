import java.util.*;
public class Array1{
    Scanner sc = new Scanner(System.in);
    int a,b;
    void input(){
        System.out.println("enter the size of the element:");
        int n = sc.nextInt();
        int k = 0;
        System.out.println("Enter the target value:");
        int target = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[i] + arr[j] == target && i != j)
                {
                    a = i;
                    b = j;

                                   }             
                                     }

            }
            System.out.println(a+" "+b);
            
            
        }
    public static void main(String... args){
        Array1 a = new Array1();
        a.input();
    }
}