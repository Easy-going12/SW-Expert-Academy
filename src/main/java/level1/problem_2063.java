package level1;

/*
 * 중간값 찾기
 * 주의 사항: 숫자들을 Arrays.sort()을 이용해서 정렬한다.
 *          숫자는 0부터 시작하기 때문에 보통 가운데 숫자는 기존의 가운데 숫자보다 하나 낮다.
* */

import java.util.Arrays;
import java.util.Scanner;

public class problem_2063 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int result = 0;
        int[] arr = new int[T];

        for(int test_case = 1; test_case <= T; test_case++){
            int a = sc.nextInt();
            arr[test_case-1] = a;
        }
        Arrays.sort(arr);
        result = arr[T/2];
        System.out.println(result);
    }
}
