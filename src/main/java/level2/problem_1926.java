package level2;

import java.util.Scanner;

/*
 * 1. 각 숫자를 문자열로 바꾼 다음 각 문자마다 3,6,9,를 구분하는 것이 좋다.
 *    그래서 먼저 test_case 별로 문자로 바꾼 후 그 문자열마다 for문 반복 시켜 각 문자를
 *    비교 후 카운터를 세서 그 수 만큼 '-'를 늘린다
 * 2. 단 연속적으로 '-'를 한 후에 띄어쓰기를 해야해서 그 점 주의하자
* */

public class problem_1926 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case<=T; test_case++){
            String str = Integer.toString(test_case);
            int count = 0;

            for(int i = 0; i<str.length(); i++){
                char c = str.charAt(i);
                if(c=='3' || c == '6' || c =='9') count++;
            }

            if(count>0){
                for(int j = 0; j<count; j++){
                    System.out.print("-");
                }
                System.out.print(" ");
            } else{
                System.out.print(test_case + " ");
            }
        }
    }
}
