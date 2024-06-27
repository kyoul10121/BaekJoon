import java.util.Scanner;

public class BaekJoon_2444 {//별찍기 7
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){ //상
                for(int a = 1; a <= N-i; a++){
                    System.out.print(" ");
                }
                for(int b = 1; b <= 2*i-1; b++){
                    System.out.print("*");
                }
            System.out.println();

            }
        for(int j = 2; j <= N; j++){ //하
                for(int n = 2; n <= j; n++){
                    System.out.print(" ");
                }
                for(int m = 1; m <= 2*N-(2*j-1); m++){
                        System.out.print("*");

                }
            System.out.println();

        }
        }
    }

/*
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
 */
