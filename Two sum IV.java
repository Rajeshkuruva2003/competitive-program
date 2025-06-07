class BSTIterator {
    private Stack<TreeNode> st = new Stack<>();
    private boolean reverse;

    public BSTIterator(TreeNode root, boolean isReverse) {
        this.reverse = isReverse;
        pushAll(root);
    }

    public boolean hasNext() {
        return !st.isEmpty();
    }

    public int next() {
        TreeNode temp = st.pop();
        if (reverse == false) {
            pushAll(temp.right);
        } else {
            pushAll(temp.left);
        }
        return temp.val;
    }

    private void pushAll(TreeNode node) {
        while (node != null) {
            st.push(node);
            node = (reverse == false) ? node.left : node.right;
        }
    }
}

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;

        BSTIterator l = new BSTIterator(root, false); // ascending
        BSTIterator r = new BSTIterator(root, true);  // descending

        int i = l.next();
        int j = r.next();

        while (i < j) {
            int sum = i + j;
            if (sum == k) return true;
            else if (sum > k) j = r.next();
            else i = l.next();
        }
        return false;
    }
}
tc:O(n)
sc:O(h)*2