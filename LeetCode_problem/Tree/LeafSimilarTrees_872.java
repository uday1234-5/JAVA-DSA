package Leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees_872 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> leaf1 = new ArrayList<>();
            List<Integer> leaf2 = new ArrayList<>();
            CollectLeaf(root1, leaf1);
            CollectLeaf(root2, leaf2);
            if (leaf1.size() != leaf2.size()) {
                return false;
            }

            /*
            != compares memory reference for objects.
            .equals() compares actual content for wrapper classes like Integer.

            for (int i = 0; i < leaf1.size(); i++) {
                if (leaf1.get(i) != leaf2.get(i)) {
                    return false;
                }
            }
            */
            for (int i = 0; i < leaf1.size(); i++) {
                if (!leaf1.get(i).equals(leaf2.get(i))) {
                    return false;
                }
            }
            return true;
        }

        private void CollectLeaf(TreeNode root, List<Integer> leaf) {
            if (root == null) {
                return ;
            }
            if(root.left == null && root.right == null){
                leaf.add(root.val);
            }
            CollectLeaf(root.left, leaf); 
            CollectLeaf(root.right, leaf); 
        }

    }
}
