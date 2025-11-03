package baekjoon;

import java.util.Scanner;

/**
 * 문제
 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 *
 * 출력
 * 시험 성적을 출력한다.
 */
public class Problem9498 {
    public static void run() {
        // 스캐너 선언 후 초기화
        Scanner sc = new Scanner(System.in);
        // 정수 a 선언 후 nextInt()로 입력 받음
        int a = sc.nextInt();
        if (a >= 90 && a <= 100) { //입력값이 90 ~ 100은 A출력
            System.out.println("A");
        } else if (a >= 80 && a < 90) { //입력값이 80 ~ 89은 B출력
            System.out.println("B");
        } else if (a >= 70 && a < 80) { //입력값이 70 ~ 79은 C출력
            System.out.println("C");
        } else if (a >= 60 && a < 70) { //입력값이 60 ~ 69은 D출력
            System.out.println("D");
        } else {
            System.out.println("F"); //나머지 값은 D출력
        }
    }
}
