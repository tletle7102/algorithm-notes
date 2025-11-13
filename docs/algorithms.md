# Algorithms

## Overview
알고리즘은 문제를 단계별로 해결하는 절차와 방법
효율적인 설계는 프로그램 성능 개선과 문제 해결에 도움됨

## What is an Algorithm?
알고리즘은 문제 해결을 위한 명확하고 순차적인 단계와 규칙
입력 데이터를 받아 처리하여 원하는 결과를 산출하는 절차
종료 조건이 있고, 효율적이어야 함

---

## 1. 재귀 (Recursion)

### 개념
재귀는 함수가 자기 자신을 호출하는 프로그래밍 기법
복잡한 문제를 같은 유형의 작은 문제로 나누어 해결할 때 유용
분할 정복, DFS, 백트래킹 등 고급 알고리즘의 근본적인 사고방식

### 기본 구조
- 기본 사례: 재귀 종료 조건. 무한 호출 방지 목적
- 재귀 사례: 함수가 자기 자신을 다시 호출하여 문제를 해결하는 부분

### 예시 1: 팩토리얼 (n!)

```java
public class Factorial {
    public static int factorial(int n) {
        if (n == 0) return 1; // 기본 사례 (재귀 종료 조건)
        return n * factorial(n - 1); // 재귀 사례 (자기 자신 호출)
    }
}
```

### 예시 2: 피보나치 수열 (재귀 버전)

```java
public class Fibonacci {
    public static int fib(int n) {
        if (n < 2) return n;  // 기본 사례 (F(0)=0, F(1)=1)
        return fib(n - 1) + fib(n - 2); // 재귀 사례
    }
}
```

### 중요 개념: 스택 메모리 구조
재귀 함수 호출 시, 각 호출은 호출 스택 (Call Stack)에 쌓임
기본 사례에 도달하면 호출이 역순으로 종료되면서 스택에서 해제됨

---

