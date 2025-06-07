import java.util.*;

class Item {
    int value, weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class Main {
    public static double fractionalKnapsack(Item[] items, int capacity) {
        Arrays.sort(items, new Comparator<Item>() {
            public int compare(Item a, Item b) {
                double r1 = (double) a.value / a.weight;
                double r2 = (double) b.value / b.weight;
                return Double.compare(r2, r1); // descending
            }
        });

        double totalValue = 0.0;

        for (Item item : items) {
            if (item.weight <= capacity) {
                totalValue += item.value;
                capacity -= item.weight;
            } else {
                totalValue += ((double) item.value / item.weight) * capacity;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            int weight = sc.nextInt();
            items[i] = new Item(value, weight);
        }

        int capacity = sc.nextInt(); /

        double result = fractionalKnapsack(items, capacity);
        System.out.printf("%.2f\n", result); 
    }
}
tc:O(n+nlogn)
sc:O(1)