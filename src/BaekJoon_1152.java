import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_1152 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.trim().split(" ");   //split : str문자열에서 " "을 기준으로 나눠서 strArr에 담음.
        String s = "";
        if(str.trim().equals(s)) {
            System.out.println("0");
        }else{
                //System.out.println(Arrays.toString(strArr));     //trim : 양 끝단의 공백제거
                // 공백을 기준으로 단어 수 세기
                System.out.println(strArr.length);
        }
    }
}
