import java.util.Scanner;

public class BaekJoon_10808 {//알파벳 개수

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = new String();
        s = scanner.next();  //단어
        int[] arr = new int[26];//알파벳

        //알파벳
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                arr[c - 97]++;
            }
            for(int i = 0; i < 26; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
// s= aaa
// a b c d e f g
// 0 1 2 3 4 5 6
//arr[0]+=1;
