package level1;

import java.util.Scanner;

/* 소문자 -> 대문자
 * toUpperCase() 함수 사용권장
 * 참고로 대문자에서 소문자는 toLowerCase() 사용
* */

public class problem_2047 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sen = sc.next();
        System.out.println(sen.toUpperCase());
    }
}
