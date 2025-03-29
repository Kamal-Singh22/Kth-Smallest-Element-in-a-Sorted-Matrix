# Kth-Smallest-Element-in-a-Sorted-Matrix
Given an n x n matrix where each row and each column is sorted in ascending order, return the kth smallest element in the matrix.
Explanation:
Use a Min-Heap (Priority Queue) to always extract the smallest element.
Push the first element of each row into the heap initially.
Extract the smallest element k times, adding the next column value of the extracted element's row.
The kth extracted element is the answer....
