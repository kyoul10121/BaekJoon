import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon_2562 {//최댓값

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int[] arr = new int[9];
        int i = 0;
        for(i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }System.out.println(max);

        for(int j = 0; j < 9; j++){
            if(arr[j] == max){
                System.out.println(j+1);
            }
        }
    }
}
