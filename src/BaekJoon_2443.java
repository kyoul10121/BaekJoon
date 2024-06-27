import java.util.Scanner;

public class BaekJoon_2443 {//별찍기 6
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){ //줄
            for(int k = 1; k <= i; k++){
                if(k != 1) {
                    System.out.print(" ");
                }
            }
            for(int j = 1; j <= 2*N-(2*i-1); j++) { //별
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
 *********
  *******
   *****
    ***
     *
 */
