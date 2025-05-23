

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = new ArrayList<>();

        for (int asteroid : asteroids) {
            while (
                !list.isEmpty() &&
                asteroid < 0 &&
                list.get(list.size() - 1) > 0
            ) {
                int top = list.get(list.size() - 1);
                if (top < -asteroid) {
                    list.remove(list.size() - 1); // top destroyed, keep checking
                    continue;
                } else if (top == -asteroid) {
                    list.remove(list.size() - 1); // both destroyed
                }
                asteroid = 0; // current asteroid destroyed
                break;
            }

            if (asteroid != 0) {
                list.add(asteroid);
            }
        }

        // Convert List<Integer> to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
tc:O(n)
sc:O(n)