package level2;

import java.util.Scanner;

/*
 * 문제를 이해하기가 어려웠다.
 * 이런 문제의 경우 항상 작은 수에 큰수를 더하도록 조건을 설정해 줘야 한다.
* */

public class problem_21425 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int count = 0;

        for(int test_case = 1; test_case<=T; test_case++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int N = sc.nextInt();

            while(A<=N && B<=N){
                if(A<B){
                    A += B;
                    count++;
                }
                else{
                    B += A;
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}
