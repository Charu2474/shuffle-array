import java.io.*;
import java.util.*;
public class HackerrankTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int n1=sc.nextInt();
        int a1[]=new int[2*n1];
        for(int i=0;i<n1;i++){
            a1[2*i]=a[i];
            a1[2*i+1]=a[i+n1];
        }
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]+" ");
        }
        System.out.println();
    }
}
