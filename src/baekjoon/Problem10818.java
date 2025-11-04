package baekjoon;

import java.util.Scanner;

/**
 * 문제
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 *
 * 출력
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */
public class Problem10818 {
    public static void run() {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        // n개의 입력값을 반복문으로 n만큼 입력받아야함
        int[] arr = new int[n]; // arr배열 생성 및 초기화
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); // 생성한 arr배열에 n만큼 입력받음
        }
        int min = arr[0]; // 최소값 초기화
        int max = arr[0]; // 최대값 초기화
        for(int i = 1; i < n; i++){
            if(arr[i] < min){ // arr배열에 최소값 비교 후 최소값 할당
                min = arr[i];
            } if(arr[i] > max){ // arr배열에 최대값 비교 후 최대값 할당
                max = arr[i];
            }
        }
        System.out.println(min + " " + max);
        // 최소값,최대값은 오름차순정렬로도 가능 Arrays.sort(arr);
        // System.out.println(arr[0] + " " + arr[n-1]);
    }
}
