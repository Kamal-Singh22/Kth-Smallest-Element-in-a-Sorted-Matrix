import java.util.PriorityQueue;

public class KthSmallestInMatrix {
    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        int n = matrix.length;
        for (int i = 0; i < Math.min(n, k); i++) {
            minHeap.offer(new int[]{matrix[i][0], i, 0}); // {value, row, col}
        }

        int number = 0;
        for (int i = 0; i < k; i++) {
            int[] current = minHeap.poll();
            number = current[0];
            int row = current[1], col = current[2];

            if (col + 1 < n) {
                minHeap.offer(new int[]{matrix[row][col + 1], row, col + 1});
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;
        System.out.println("Kth smallest element: " + kthSmallest(matrix, k)); // Output: 13
    }
}
