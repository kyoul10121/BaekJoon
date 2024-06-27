import java.util.Scanner;

public class BaekJoon_2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

            for(int i = 1; i <= N; i++) {
                for(int a = 1; a <= i; a++){
                    if(a != 1) System.out.print(" ");
                }
                for(int b = 1; b <= 2*N-(2*i-1); b++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int j = 2; j <=N; j++) {
                for(int n = 1; n <= N-j; n++){
                    System.out.print(" ");
                }
                for(int m =1; m <= 2*j-1; m++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
/*
 *********
 0*******
 00*****
 000***
 0000*
 000***
 00*****
 0*******
 *********
 */