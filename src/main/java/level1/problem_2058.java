package level1;

/*
 * 자릿수 더하기
* */

import java.util.Scanner;

public class problem_2058 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int result = 0;
        while(T>0){
            int a = T%10;
            result += a;
            T = T/10;
        }
        System.out.println(result);
    }
}
