import java.util.Scanner;

public class BaekJoon_2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int alarm = (M - 45);

        if(H != 0){ //H가 0이 아닐 때
            if(M >= 45) {System.out.println(H+" "+alarm);}
            else if(M < 45) {System.out.println((H-1)+" "+(60+alarm));}

        }else { //H가 0일 때
            if(M == 0){System.out.println("23"+" "+(60+alarm));}
            else if(M >= 45){System.out.println(H+" "+alarm);}
            else if(M < 45){System.out.println("23"+" "+(60+alarm));}
        }
     /*   if (alarm < 0) {
            if (H == 0) {
                System.out.println((H == 23) + " " + (60 + alarm));
            } else System.out.println((H - 1) + " " + (60 + alarm));
        } else if (alarm == 0) {
            if (H == 0) {
                System.out.println(H + " " + alarm);
            } else System.out.println(H - 1 + " " + (60 - 45));
        }else if (alarm > 0) {
            if (H == 0) {
                System.out.println(H + " " + alarm);
            }System.out.println((H - 1) + " " + alarm);
        }*/


    }
}
