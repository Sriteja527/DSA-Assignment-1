import java.util.*;
public class Array8{
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("enter the array elements:");
        int arr[] = new int[n];
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); 
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    int count = arr[i+2] - 1;
                    System.out.println("Result is:"+arr[i]+" "+count);
                }
            }
        }
        

    }
    public static void main(String[] args){
        Array8 a = new Array8();
        a.input();
    }
}