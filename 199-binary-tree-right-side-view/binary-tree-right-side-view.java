/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        rightSideView(root, result, 0);
        return result;
    }

    private void rightSideView(TreeNode root, List<Integer> result, int idx) {
        if (root == null) { return; }
        if (idx == result.size() || (idx < result.size() && null == result.get(idx))) {
            result.add(root.val);
        } else {
            result.set(idx, root.val);
        }
        rightSideView(root.left, result, idx + 1);
        rightSideView(root.right, result, idx + 1);
    }

    /*public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        TreeNode currNode = root;
        while (null != currNode) {
            // System.out.println("Enter Loop1");
            //no right branch
            if (null == currNode.right) {
                result.add(currNode.val);
                currNode = currNode.left;
            } else {
                TreeNode nextNode = currNode.right;

                while (null != nextNode.left && nextNode.left != currNode) {
                    // System.out.println("Enter Loop2");
                    nextNode = nextNode.left;
                }

                //no left branch
                if (null == nextNode.left) {
                    result.add(currNode.val);
                    nextNode.left = currNode;
                    currNode = currNode.right;
                } else {
                    nextNode.left = null;
                    currNode = currNode.left;
                }
            }
        }
    }*/
}