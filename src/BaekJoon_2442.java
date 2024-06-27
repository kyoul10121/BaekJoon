import java.util.Scanner;

public class BaekJoon_2442 {//별찍기 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 0; i < N; i++){ //줄
            for(int k = 1; k < N-i; k++){
                    System.out.print(" ");
            }
            for(int j = 1; j <= 2*i+1; j++ ) { //별
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
 */
