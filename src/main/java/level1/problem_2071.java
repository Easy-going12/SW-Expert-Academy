package level1;

import java.util.Scanner;

public class problem_2071 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case<=T; test_case++) {
            int sum = 0;
            long result = 0;
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                sum += num;
                double avg = (double)sum / 10;
                result = Math.round(avg);
            }
            System.out.printf("#%d %d\n",test_case,result);
        }
    }
}
