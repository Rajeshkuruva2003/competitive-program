class Solution {
    class Pair {
        TreeNode node;
        int num;

        Pair(TreeNode node, int num) {
            this.node = node;
            this.num = num;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> qu = new LinkedList<>();
        int ans = 0;
        qu.offer(new Pair(root, 0));

        while (!qu.isEmpty()) {
            int size = qu.size();
            int mmin = qu.peek().num; // Minimum index at current level
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair p = qu.poll();
                TreeNode node = p.node;
                int curIdx = p.num - mmin; // Normalize index to prevent overflow

                if (i == 0) first = curIdx;
                if (i == size - 1) last = curIdx;

                if (node.left != null)
                    qu.offer(new Pair(node.left, 2 * curIdx + 1));
                if (node.right != null)
                    qu.offer(new Pair(node.right, 2 * curIdx + 2));
            }

            ans = Math.max(ans, last - first + 1);
        }

        return ans;
    }
}
