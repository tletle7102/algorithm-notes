package baekjoon;

import java.util.Scanner;

/**
 * 문제
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 *
 * 출력
 * 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 *
 * A가 B보다 큰 경우에는 '>'를 출력한다.
 * A가 B보다 작은 경우에는 '<'를 출력한다.
 * A와 B가 같은 경우에는 '=='를 출력한다.
 */
public class Problem1330 {
    public static void  run() {
        // 스캐너 선언 후 초기화
        Scanner sc = new Scanner(System.in);
        // 정수 a, b 선언 후 nextInt()로 입력 받음
        int a = sc.nextInt();
        int b = sc.nextInt();
        //두 정수 크기 비교 후 비교값 출력
        if(a > b){
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
