import java.util.*;

public class Main4 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> results = new ArrayList<>();
        String result = "";
        if (root == null) {
            return results;
        }
        result = String.valueOf(root.val);
        if (root.left == null && root.right == null) {
            results.add(result);
            return results;
        }
        if (root.left != null) {
            binaryTreePaths(root.left, results, result);
        }
        if (root.right != null) {
            binaryTreePaths(root.right, results, result);
        }
        return results;
    }

    public void binaryTreePaths(TreeNode root, List<String> results, String result) {
        result += "->" + String.valueOf(root.val);
        if (root.left == null && root.right == null) {
            results.add(result);
        }
        if (root.left != null) {
            binaryTreePaths(root.left, results, result);
        }
        if (root.right != null) {
            binaryTreePaths(root.right, results, result);
        }
    }

    public static void main(String[] args) {
        Main4 tree = new Main4();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = null;
        root.left.right = new TreeNode(5);
        System.out.println(tree.binaryTreePaths(root));
    }
}
