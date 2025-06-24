import java.util.*;

class Main {
    public static void recur(int i, int[] arr, int tar, Set<List<Integer>> ans, List<Integer> ls) {
        if (i == arr.length) {
            if (tar == 0) {
                List<Integer> temp = new ArrayList<>(ls);
                Collections.sort(temp);  // Optional: helps prevent duplicate permutations
                ans.add(temp);
            }
            return;
        }

        if (arr[i] <= tar) {
            ls.add(arr[i]);
            recur(i + 1, arr, tar - arr[i], ans, ls);
            ls.remove(ls.size() - 1);
        }

        recur(i + 1, arr, tar, ans, ls);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int tar = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Set<List<Integer>> ans = new HashSet<>();
        recur(0, arr, tar, ans, new ArrayList<>());
        List<List<Integer>> list = new ArrayList<>(ans);

        // Output
        for (List<Integer> l : list) {
            System.out.println(l);
        }
    }
}
//////////////////
import java.util.*;

class Main {
    public static void recur(int i, int[] arr, int tar, List<List<Integer>> ans, List<Integer> ls) {
        if (tar == 0) {
            ans.add(new ArrayList<>(ls));
            return;
        }
        
        for (int ind = i; ind < arr.length; ind++) {
            if (ind > i && arr[ind] == arr[ind - 1]) {
                continue;
            }
            if (arr[ind] > tar) {
                break;
            }
            
            ls.add(arr[ind]);
            recur(ind + 1, arr, tar - arr[ind], ans, ls);
            ls.remove(ls.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tar = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        recur(0, arr, tar, ans, new ArrayList<>());
        
        for (List<Integer> l : ans) {
            System.out.println(l);
        }
        
        sc.close();
    }
}
