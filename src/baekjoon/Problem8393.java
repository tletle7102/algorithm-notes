package baekjoon;

import java.util.Scanner;

/**
 * 문제
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 *
 * 출력
 * 1부터 n까지 합을 출력한다.
 */
public class Problem8393 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // 1부터 n까지 합을 출력하는 문제(등차수열 합 n(n+1)/2)
        // n(n+1)/2 이대로하면 컴파일에러 발생(함수호출로 인식함)
        // n*(n+1)/2 반드시 곱셈 * 연산자 사용함
        System.out.println((a * (a + 1) /2)); // 1부터 a까지 합을 출력
    }
}
