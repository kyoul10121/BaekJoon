//import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //동전 화폐의 종류
        int K = sc.nextInt();   //돈

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        //System.out.println(Arrays.toString(A));

        int count = 0;

        for(int j = N-1; j >= 0; j--){
            count += K / A[j];
            K = K % A[j];
        }
        System.out.println(count);
    }
}
