import java.util.*;
public class moveallzero {
    public static void main(String[] args)
    {
        int[] A = { 8, 6, 0, 9, 6, 0, 0, 0, 8 };
        int n = A.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] != 0) {
                swap(A, j, i); 
                j++;
            }
        }
        for (int 
        i = 0; i < n; i++) {
            System.out.print(A[i] + " "); 
        }
    }


public static void swap(int[] A, int a, int b)
{
    int temp = A[a];
    A[a] = A[b];
    A[b] = temp;
}
}