package level1;

/* JAVA 제곱 구하기
 * 특정 숫자의 거듭제곱을 구할때는 Math.pow(a,b)를 사용해라. a가 거듭제곱 당하는 숫자,
 * b가 거듭제곱되는 횟수. 단 이렇게 할 경우 출력을 실수 float 타입이나 double 타입이므로
 * 만약 정수로 출력하고 싶으면 (int)Math.pow(a,b)를 사용해서 정수형으로 바꿔줘라.
* */

import java.util.Scanner;

public class problem_2019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 0; test_case<=T; test_case++){
            System.out.printf("%d ", (int)Math.pow(2,test_case));
        }
    }
}
