package level1;

import java.util.Scanner;

public class problem_2050 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String T = sc.next();

        for(int test_case = 1; test_case<=T.length(); test_case++){
            char alp = T.charAt(test_case-1);
            System.out.printf("%d ",alp - 'A' + 1);
        }
    }
}
