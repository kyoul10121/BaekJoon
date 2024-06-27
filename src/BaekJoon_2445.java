import java.util.Scanner;

public class BaekJoon_2445 {//별찍기 8
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){ //상
                for(int a = 1; a <= i; a++){
                    System.out.print("*");
                }
                for(int b = 1; b <= 2*N-(2*i); b++){
                    System.out.print(" ");
                }
                for(int c = 1; c <= i; c++){
                        System.out.print("*");
                }
            System.out.println();

            }
        for(int j = 1; j <= N - 1; j++){ //하
                for(int n = 1; n <= N-j; n++){
                    System.out.print("*");
                }
                for(int m = 1; m <= (2*j); m++){
                        System.out.print(" ");

                }
                for(int l = 1; l <= N-j; l++){
                    System.out.print("*");
                }
            System.out.println();

        }
        }
    }

/*
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 */
