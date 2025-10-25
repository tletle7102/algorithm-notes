# algorithm-notes

알고리즘 문제 풀이 기록용 저장소

## 주요 내용
- 백준(BOJ), 프로그래머스(Programmers) 문제 풀이를 패키지별 자바 소스코드로 정리
- 풀이 과정 및 공부한 개념을 함께 기록
- 백준과 프로그래머스의 실행 및 제출 방식이 다르므로, 각 플랫폼별 워크플로우를 명확히 설명

## 프로젝트 구조
- `src/baekjoon/`: 백준 문제 풀이 소스코드 (패키지 포함)
    - 각 문제는 `ProblemXXXX.java` 형식 (예: `Problem1000.java`)
    - `public static void run()` 메서드로 테스트 실행
- `src/programmers/`: 프로그래머스 문제 풀이 소스코드 (패키지 포함)
    - 각 문제는 `ProblemXXXX.java` 또는 `ProblemSampleXXXX.java` 형식 (예: `Problem120822.java`)
    - `solution` 메서드 (프로그래머스 제출용)와 `public static void run()` 메서드 (테스트용) 포함
- `src/main/`: 문제별 독립 실행용 메인 클래스 관리
    - `MainBaekjoon.java`: 백준 문제 실행용 메인 클래스
    - `MainProgrammers.java`: 프로그래머스 문제 실행용 메인 클래스
- `docs/study-notes.md`: 자바 입출력, 알고리즘 개념 등을 정리한 자료

## 프로젝트 초기 세팅 (IntelliJ 기준)

### 1. `.gitignore`에 제외 리스트 추가
프로젝트 루트의 `.gitignore`에 다음 내용 추가:
```gitignore
# IntelliJ IDEA
.idea/
*.iml
misc.xml
modules.xml
vcs.xml
```

### 2. git stage(인덱스)에서 해당 파일 제거
이미 git에 추적되고 있다면 `.gitignore`만 수정해도 적용되지 않으므로, 캐시를 강제 제거하고 다시 등록:
```shell
git rm -r --cached .idea
git rm --cached *.iml
git rm --cached misc.xml modules.xml vcs.xml
git add .
```

### 3. GitHub에 repository 공유
로컬 변경사항을 커밋하고 GitHub에 원격 리포지토리를 생성하여 공유 (IntelliJ에 GitHub 로그인 가정):
1. IntelliJ 상단 메뉴에서 `VCS` 클릭
2. `Share Project on GitHub` 선택
3. Repository name 및 Description 입력 (예: 🚀 자바로 푸는 알고리즘 문제 풀이 & 학습 기록 저장소 📚)
4. Visibility 설정 (Public 또는 Private)
5. `Share` 버튼 클릭 (리포지토리 생성 및 코드 푸시)

## 실행
- `src/main/MainBaekjoon.java` 또는 `src/main/MainProgrammers.java`를 통해 문제별 독립 실행
- 각 클래스는 하나의 문제만 실행하여 입출력 충돌 방지

### 백준 실행
- `MainBaekjoon.java`에서 테스트하고 싶은 문제의 `run()` 메서드 호출:
```java
package main;

import baekjoon.Problem1000;

public class MainBaekjoon {
    public static void main(String[] args) {
        Problem1000.run();
    }
}
```

- 문제 변경: `Problem1000.run()`을 다른 문제 번호로 변경 (예: `Problem1330.run()`).

### 프로그래머스 실행
- `MainProgrammers.java`에서 테스트하고 싶은 문제의 `run()` 메서드 호출:
```java
package main;

import programmers.Problem120822;

public class MainProgrammers {
    public static void main(String[] args) {
        Problem120822.run();
    }
}
```
- 문제 변경: `Problem120822.run()`을 다른 문제로 변경 (예: `ProblemSampleStringString.run()`).

## 온라인 저지 플랫폼 제출 방법

### 백준 제출 워크플로우
- 백준 문제는 `Main` 클래스의 `main` 메서드에서 입력을 처리하므로, 제출 시 다음 사항 준수:
    - `package` 선언 제거
    - 클래스명은 `Main`으로 변경
    - `main` 메서드 작성 (예: `public static void main(String[] args)`)

예시 (Problem1000.java):
```java
// 제출 전
package baekjoon;

import java.util.Scanner;

public class Problem1000 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```
```java
// 제출 시
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

### 프로그래머스 제출 워크플로우
- 프로그래머스 문제는 `solution` 메서드를 포함한 `Solution` 클래스를 요구하므로, 제출 시 다음 사항 준수:
    - `package` 선언 제거
    - 클래스명은 `Solution`으로 변경
    - `solution` 메서드만 복사 (`run()` 메서드는 제외)
    - `main` 메서드 불필요 (프로그래머스는 `solution` 메서드를 직접 호출)

예시 (Problem120822.java):
```java
// IntelliJ에서
package programmers;

public class Problem120822 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }

    public static void run() {
        Problem120822 problem = new Problem120822();
        String[] inputs = {"jaron", "bread"};
        String[] expecteds = {"noraj", "daerb"};
        for (int i = 0; i < inputs.length; i++) {
            String input = inputs[i];
            String output = problem.solution(input);
            System.out.println("Test " + (i + 1));
            System.out.println("Input: " + input);
            System.out.println("Output: " + output);
            System.out.println("Expected: " + expecteds[i]);
            System.out.println("Result: " + (output.equals(expecteds[i]) ? "Pass" : "Fail"));
            System.out.println();
        }
    }
}
```

```java
// 프로그래머스 제출 시
public class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }
}
```

제출 워크플로우:
1. IntelliJ에서 `ProblemXXXX.java`의 `solution` 메서드 작성 및 테스트:
    - `run()` 메서드 실행 (`MainProgrammers.java`에서 `ProblemXXXX.run()` 호출)
    - 테스트 케이스 결과 확인
2. 제출:
    - `ProblemXXXX.java`에서 `solution` 메서드 복사 (`Ctrl+C`)
    - 프로그래머스 에디터에 붙여넣기, 클래스명 `Solution`으로 변경
    - `package` 선언 제거, 제출

### 프로그래머스 문제 다양한 시그니처 샘플 
- 새로운 매개변수 타입(예: `double`, `List<Integer>`, 커스텀 객체)이 필요 시:
    1. `src/programmers/ProblemXXXX.java`에 `solution` 메서드 작성
    2. `run()` 메서드에 테스트 케이스 추가 (프로그래머스 입출력 예시 기반)
    3. 적절한 비교 로직 추가 (예: `List.equals`, 커스텀 비교)
- ProblemSampleStringString: 문자 제거 (String, String)
- ProblemSampleIntInt: 두 수 합 (int, int)
- ProblemSampleIntLong: 제곱근 배열 (int, long)
- ProblemSampleIntIntArray: 금액 조합 (int, int[])
- ProblemSampleStringArrayStringArray: 제재 ID (String[], String[])
- ProblemSampleSingleInt: 숫자 2배 (int)
- ProblemSampleIntArray: 배열 자르기 (int[], int, int)
- ProblemSampleStringArray: 대문자 변환 (String[])
- ProblemSampleInt2DArray: 2차 배열 2배 (int[][])

## 기타
- 공통 개념: `docs/study-notes.md`에 자바 입출력, 알고리즘 개념 정리
- 주석: 코드에 의도와 로직을 주석으로 기록
- 문제 관리:
    - 각 `ProblemXXXX.java` 상단에 주석으로 문제 정보 기록:
    - `README.md` 또는 별도 파일에 문제 목록 정리:
        

## IntelliJ 활용 팁
- 코드 복사: `solution` 메서드 블록 선택 후 `Ctrl+C`로 복사
- 테스트 실행: `MainProgrammers.java`의 실행 버튼 클릭 (또는 `Ctrl+Shift+F10`)
- 자동 완성: `ProblemXXXX` 클래스명 입력 시 IntelliJ 자동 완성 사용 (`Ctrl+Space`)
- 주석 추가: 문제 정보와 로직을 주석으로 기록하여 가독성 향상

---