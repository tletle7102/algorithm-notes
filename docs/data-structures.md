# Data Structures

## Overview
데이터를 효율적으로 저장, 관리하는 방법
데이터는 다양한 형태로 존재하며, 잘 다루기 위해 구조화 필요
데이터를 체계적으로 조직하여 효율적으로 접근, 수정, 삭제 가능

## What is a Data Structure?
자료구조란, 데이터를 저장하고 관리하는 방법과 규칙
마치 서랍장 안에 여러 칸으로 물건을 정리하는 것처럼, 데이터도 목적에 맞게 정리 필요

---  

## Common Data Structures

### 1. Array (배열)

#### 개념
데이터를 메모리 상에 연속적인 공간에 저장하는 구조

#### 특징
- 요소에 빠르게 접근 가능 (인덱스 번호로 직접 접근)
- 크기가 고정되어 미리 정해야 하며, 크기 변경이 어려움

#### 실생활 예시
학생들의 점수를 순서대로 적은 명부

#### 자바 예시 코드
배열 생성 및 접근 예시

```java
public class ArrayExample {
    public static void main(String[] args) {
        // 크기가 5인 정수형 배열 생성
        int[] scores = new int[5];
        
        // 인덱스를 이용한 접근 및 저장
        scores[0] = 90;
        scores[4] = 85;
        
        // 빠른 접근 (O(1) 시간 복잡도)
        int firstScore = scores[0]; 
        System.out.println("첫 번째 점수: " + firstScore); 
    }
}
```

### 2. Linked List (연결 리스트)

#### 개념
데이터 요소가 노드라는 단위로 저장되고, 각 노드는 다음 노드의 위치를 가리키는 포인터를 가짐

#### 특징
- 크기를 동적으로 늘리거나 줄일 수 있어 유연
- 삽입/삭제가 빠름 ($\text{O}(1)$ 시간 복잡도)
- 인덱스를 통한 직접 접근은 배열보다 느림 (순차 탐색 필요)

#### 실생활 예시
종이로 만든 열쇠고리처럼 한 칸씩 연결된 구조

#### 자바 예시 코드
단일 연결 리스트의 노드 구조

```java
class Node {
    int data;
    Node next; // 다음 노드를 가리키는 포인터
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        // 10 -> 20 연결
    }
}
```

### 3. Stack (스택)

#### 개념
마지막에 넣은 데이터가 가장 먼저 나오는 구조 (LIFO: Last In First Out)

#### 특징
- Push: 데이터 넣기
- Pop: 가장 위(최근) 데이터 빼기
- 함수 호출, 웹 브라우저 뒤로 가기, 실행 취소 (Undo) 기능 구현에 사용

#### 실생활 예시
책 쌓기, 접시 쌓기

#### 자바 예시 코드
스택 사용 (Java `Stack` 클래스 이용)

```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        stack.push("A"); // Push: A 삽입
        stack.push("B"); // Push: B 삽입
        
        System.out.println(stack.pop()); // Pop: B 출력 (가장 나중에 들어온 값)
        System.out.println(stack.pop()); // Pop: A 출력
    }
}
```

### 4. Queue (큐)

#### 개념
먼저 넣은 데이터가 먼저 나오는 구조 (FIFO: First In First Out)

#### 특징
- Enqueue: 데이터 넣기 (뒤쪽)
- Dequeue: 가장 앞쪽 데이터 빼기
- 은행 번호표, 프린터 대기열, BFS(너비 우선 탐색) 구현 등에 사용

#### 실생활 예시
줄 서기

#### 자바 예시 코드
큐 사용 (Java `Queue` 인터페이스와 `LinkedList` 구현체 이용)

```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        
        queue.offer("A"); // Enqueue: A 삽입
        queue.offer("B"); // Enqueue: B 삽입
        
        System.out.println(queue.poll()); // Dequeue: A 출력 (가장 먼저 들어온 값)
        System.out.println(queue.poll()); // Dequeue: B 출력
    }
}
```

---  

## Why Study Data Structures?
- 데이터 처리 속도 증가
- 메모리 사용을 최적화
- 알고리즘 구현의 기초. 문제 해결 능력 증대

## Summary Table

| 자료구조 | 특징 | 예시 응용 |
| :---: | :--- | :--- |
| 배열 (Array) | 고정 크기, 빠른 인덱스 접근 | 학생 성적, 이미지 픽셀 |
| 연결 리스트 (Linked List) | 동적 크기, 느린 인덱스 접근, 빠른 삽입/삭제 | 음악 재생 목록, 웹 브라우저 방문 기록 |
| 스택 (Stack) | LIFO (Last In First Out) 구조 | 함수 호출, 실행 취소 (Undo) |
| 큐 (Queue) | FIFO (First In First Out) 구조 | 프린터 작업 대기열, 은행 번호표 |
