import java.util.Scanner;

public class BaekJoon_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i = 0; i < N; i++){ //줄
            for(int j = 0; j < N-i; j++) { //별
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 *****
 ****
 ***
 **
 *
 */