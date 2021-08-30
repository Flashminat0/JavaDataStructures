package com.sliit;

/* Class containing left and right child of current
   node and key value*/
class TreeNode
{
    int key;
    TreeNode left, right;

    public TreeNode(int item)
    {
        key = item;
        left = right = null;
    }
}
