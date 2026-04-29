package level1;

/*
 * 연월일 달력
 * YYYYMMDD의 경우 먼저 문자열로 받은 받은 substring을 이용해 분리 후 int 형으로 변경하자.
 * 월일 비교의 경우 배열의 월에 해당하는 일로 넣어 조건문으로 비교하여 만족하면 true로 변경 아님 false로 하여 출력해라
* */

import java.util.Scanner;

public class problem_2056 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int test_case = 1; test_case<=t; test_case++){
            String T = sc.next();
            int year = Integer.parseInt(T.substring(0,4));
            int month = Integer.parseInt(T.substring(4,6));
            int day = Integer.parseInt(T.substring(6,8));

            boolean is = false;

            int[] maxDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};

            if(month>=1 && month<=12){
                if(day>=1 && day<=maxDays[month]) is = true;
            }
            if(is) System.out.printf("#%d %04d/%02d/%02d\n",test_case,year,month,day);
            else System.out.println("#" + test_case + " -1");
        }
    }
}
