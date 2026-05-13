package level1;

import java.util.Scanner;

public class problem_2043 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int K = sc.nextInt();
        int num = 1;

        for(int i = K; i<=999; i++){
            if(i == P) System.out.println(num);
            else num++;
        }
    }
}
