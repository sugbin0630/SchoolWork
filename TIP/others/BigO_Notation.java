package TIP.others;

public class BigO_Notation {

    /*
     * big-O notation:
     * 
     * 알고리즘의 최악의 실행시간을 표기하는 가장 많이쓰는 표기법
     * 
     * 1. ingore constant
     * if the algorithm has O(N + 5),
     * remove 5. O(N)
     * 2. ignore coefficiecnt
     * if the algorithm has O(3N),
     * remove 3. O(N)
     * 3. declear only leading term
     * if the algorithm has O(N^2 + N - 5),
     * remove N + 5. O(N^2)
     * 
     * O(1)
     * 
     * 입력값(N)이 증가해도 실행시간은 동일한 알고리즘, index로 접근하여 바로 처리할 수 있는 연산 과정의 시간 복잡도 → 기본 연산
     * 수라고 생각하면 편함
     * 
     * ex) stack의 push, pop
     * 
     * O(log N)
     * 
     * 연산이 한 번 실행될 때 마다 데이터의 크기가 절반 감소하는 알고리즘 (log의 지수는 항상 2)
     * 
     * ex) binary search 알고리즘, tree 형태 자료구조 탐색
     * 
     * O(N)
     * 
     * 입력값(N)이 증가함에 따라 실행시간도 선형적으로 증가하는 알고리즘
     * 
     * ex) 1중 for문
     * 
     * O(N log N)
     * 
     * O(N)의 알고리즘과 O(log N)의 알고리즘이 중첩된 형태
     * 
     * ex) 퀵 / 병합 / 힙 정렬
     * 
     * O(N^2)
     * 
     * O(N)의 알고리즘과 O(log N)의 알고리즘이 중첩된 형태
     * 
     * ex) 2중 For 문, 삽입/거품/선택 정렬
     * 
     * O(2^N)
     * 
     * 빅오 표기법 중 가장 느린 시간 복잡도로 주로 재귀적으로 수행하는 알고리즘이 이에 해당
     * 
     * ex) fibonacci 수열
     * 
     * 
     */
}