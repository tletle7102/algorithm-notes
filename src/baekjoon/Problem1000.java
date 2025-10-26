package baekjoon;

import java.util.Scanner;

/**
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 출력
 * 첫째 줄에 A+B를 출력한다.
 *
 * 예제 입력 1
 * 1 2
 *
 * 예제 출력 1
 * 3
 */
public class Problem1000 {
    public static void run() {
        // 스캐너 선언 후 초기화
        Scanner sc = new Scanner(System.in);
        // 정수 a, b 선언 후 nextInt()로 입력 받음
        int a = sc.nextInt();
        int b = sc.nextInt();
        // 두 정수 합 계산 후 출력
        System.out.println(a + b);
    }
}
