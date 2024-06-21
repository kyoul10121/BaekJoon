import java.util.Scanner;

public class BaekJoon_10250 {
    public static void main(String[] args) {
        int T;
        int H;
        int W;
        int N;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            H = sc.nextInt();
            W = sc.nextInt();
            N = sc.nextInt();
                 if(N % H == 0){//나머지가 0일때 , (층수*100)+호수(호수는 몫)
                System.out.println((H*100)+(N/H));
                }else {//나머지가 0이 아닐때 , 나머지가 층수 몫+1이 호수
                System.out.println(((N%H)*100)+((N/H)+1));
                }

        }
    }
}
/*import java.util.Scanner; //실패 버전

public class BaekJoon_10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int k = 0; k < T; k++) {
            int H = sc.nextInt();   //각 호텔의 층 수
            int W = sc.nextInt();   //각 층의 방 수
            int N = sc.nextInt();   //몇 번째 손님

            //각 행에서 N번째 손님에게 배정할 방번호 출력하기
            //층 수 + W(각 층의 방 수 입력받은 후 한자리가 나오면 앞에 0입력, 두자리가 나오면 그대로 입력)
            int floor = (N%H);  //나머지가 층수가 되고 (몫+1)이 호수가 된다.
            int number = ((N/H)+1);
            if(N > H) {  //층 수가 손님순서보다 작은경우
                int length = (int)(Math.log10(number)+1);//int형 숫자의 자릿수 구하기
                if(N % H == 0){//H가 N의 배수일때
                    if (length == 2) {
                        String str2 = Integer.toString(number);
                        System.out.println("1" + str2);
                    }else {
                        String str2 = Integer.toString(number);
                        System.out.println("1"+"0"+str2);
                    }
//                    System.out.println("1"+number);
                }
                else {
                    if (length == 2) {
                        String str1 = Integer.toString(floor);
                        String str2 = Integer.toString(number);
                        System.out.println(str1 + str2);
                    } else {
                        System.out.println(floor + "0" + number); //자릿수가 1개라면 앞에 0붙여준다.
                    }
                }
            }else{    //층 수가 손님순서보다 클 경우.
                //층 수 = 손님순서
                System.out.println(N+"01");
            }
        }
        sc.close();
    }//main
}*/