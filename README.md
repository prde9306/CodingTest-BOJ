# CodingTest - Java
## ✋ BOJ(백준)
1. BackTracking
2. BaseDataStructure
3. DFS/BFS
   * BOJ_3085 - DFS & 시계방향으로 푸는 문제 아니다.(비교하기) 
   * BOJ_2293 동전문제 - 경우의 수, 최소값 구분
   * BOJ_12851 숨바꼭질 - 인프런 송아지 문제랑 구분
4. DynamicProgramming
   *  
5. Search/Sort
   * BOJ_2750, 2751 Arrays.sort()로 못푼다. Arrays.sort는 dual-pivot Quicksort알고리즘 이용(평균 시간 복잡도 O(nlogn) 최악의 경우 O(n^2)) - Collections.sort()로 해결해야 한다.
   * Collections.sort() 은 Timsort이다. Timsort 의 경우 합병 및 삽입정렬 알고리즘을 사용한다. 이렇게 두 가지가 섞여있는 정렬 알고리즘을 hybrid sorting algorithm 이라고 하는데, 합병정렬(Merge Sort)의 경우 최선, 최악 모두 O(nlogn)  을 보장하고. 삽입정렬(Insertion sort)의 경우 최선의 경우는 O(n) , 최악의 경우는 O(n2) 이다. 그리고 두 정렬 모두 안정 정렬(stable sort)이기 때문에 Timsort를 hybrid stable sorting algorithm이라고도 한다.
     즉, 합병정렬의 최악의 경우와 삽입정렬의 최선의 경우를 짬뽕한 알고리즘이 Timsort 라는 것이다.

***