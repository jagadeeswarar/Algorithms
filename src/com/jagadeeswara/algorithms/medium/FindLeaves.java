package com.jagadeeswara.algorithms.medium;

import com.jagadeeswara.algorithms.com.jagadeeswara.algorithms.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindLeaves {

    public static void main(String[] args) {
        TreeNode tree  = new TreeNode(1);
        tree.left =  new TreeNode(2);
        tree.right =  new TreeNode(3);
        tree.left.left =  new TreeNode(4);
        tree.left.right =  new TreeNode(5);

        System.out.println(findLeaves(tree));
    }

    public static List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        int idx = helper(root, result);
        return result;
    }

    private static int helper(TreeNode root, List<List<Integer>> result)
    {
        if ((root.left == null) && (root.right == null))
        {
            if (result.size() == 0)
            {
                result.add(new ArrayList<Integer>());
            }
            result.get(0).add(root.val);
            return 0;
        }
        int idx = 0;
        if (root.left != null)
        {
            idx = Math.max(idx, helper(root.left, result));
        }

        if (root.right != null)
        {
            idx = Math.max(idx, helper(root.right, result));
        }
        idx++;
        if (result.size() == idx)
        {
            result.add(new ArrayList<Integer>());
        }
        result.get(idx).add(root.val);
        return idx;
    }
}
