class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root != null){
            list.addAll(inorderTraversal(root.left));
            list.add(root.val);
            list.addAll(inorderTraversal(root.right));
        }
        return list;
    }
}