import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_3040 {//백설공주와 일곱난쟁이
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = 9;
        int[] arr = new int[N];
        int sum = 0;

        for(int i = 0; i < 9; i++){
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }
        for(int k = 0; k < 8; k++){
            for(int l = k+1; l < 9; l++){
                if(sum - (arr[k]+arr[l]) == 100){
                    arr[k] = 0;
                    arr[l] = 0;
                    for(int n = 0; n < 9; n++){
                        if(n != k && n != l ){
                            System.out.println(arr[n]);
                        }
                    }
                }
            }
        }
        //System.out.println(Arrays.toString(arr));


        //크기가 9인 배열 arr을 선언하고 입력받는 난쟁이의 숫자들을 이 배열에 저장해준다. 그리고 아홉 난재이의 숫자 합을 int형 변수 sum에 저장한다.
        //이제 진짜 난쟁이가 아닌 두 난쟁이의 숫자를 찾으면 된다. 즉, sum에서 이 가짜 난쟁이의 숫자들을 빼주면 100이 된다. 그러므로 이중 for 문을 이용해서 가짜 난쟁이의 숫자를 찾는다.
        // 이건 (sum - 가짜 난쟁이의 숫자 합 == 0)로 구할 수 있다. 가짜 난쟁이의 숫자를 찾으면 배열에서 가짜 난쟁이의 수를 0으로 갱신해준다.
        //그다음에 배열을 순회하면서 0이 아닌 값들을 출력해주면 된다.











    }
}
