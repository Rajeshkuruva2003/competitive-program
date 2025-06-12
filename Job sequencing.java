import java.util.*;

class Job {
    int id;
    int deadline;
    int profit;

    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

class Main {
    public static void jobseq(int[] id, int[] deadline, int[] profit, int n) {
        Job arr[] = new Job[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Job(id[i], deadline[i], profit[i]);
        }

        Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (int i = 0; i < n; i++) {
            maxDeadline = Math.max(maxDeadline, arr[i].deadline);
        }

        int[] slots = new int[maxDeadline + 1];
        Arrays.fill(slots, -1);

        int count = 0;
        int totalProfit = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i].deadline; j > 0; j--) {
                if (slots[j] == -1) {
                    slots[j] = arr[i].id;
                    count++;
                    totalProfit += arr[i].profit;
                    break;
                }
            }
        }

        System.out.println("Total Jobs Done: " + count);
        System.out.println("Total Profit: " + totalProfit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] id = new int[n];
        int[] deadline = new int[n];
        int[] profit = new int[n];

        for (int i = 0; i < n; i++) {
            id[i] = sc.nextInt();
            deadline[i] = sc.nextInt();
            profit[i] = sc.nextInt();
        }

        jobseq(id, deadline, profit, n);
    }
}
tc:O(n log n + n * maxDeadline)
sc:O(n + maxDeadline)