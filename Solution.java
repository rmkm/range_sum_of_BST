public class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int[] rangeSum = new int[1];
        return search(root, L, R, rangeSum);
    }

    int search(TreeNode node, int L, int R, int[] sum) {
        if (L <= node.val && node.val <= R) {
            sum[0] += node.val;
        }
        if (node.left != null) {
            search(node.left, L, R, sum);
        }
        if (node.right != null) {
            search(node.right, L, R, sum);
        }
        return sum[0];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        int answer = solution.rangeSumBST(root, 3, 6);
        System.out.println(answer);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
