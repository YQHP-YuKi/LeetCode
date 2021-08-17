package Easy.Symmetric_Tree_101;

import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/08/17 17:17
 */
public class Solution2 {

  public boolean isSymmetric(TreeNode root) {
    //if root is null or only have the root
    if (root == null || (root.left == null && root.right == null)) {
      return true;
    }
    //make a LinkedList to store the notes
    LinkedList<TreeNode> Queue = new LinkedList<>();
    //add the left node and right node
    Queue.add(root.left);
    Queue.add(root.right);
    //iterate through the loop
    while (Queue.size() > 0) {
      //pop the first node
      TreeNode leftNode = Queue.removeFirst();
      //pop the second node
      TreeNode rightNode = Queue.removeFirst();
      //if left is null and right is null
      if (leftNode == null && rightNode == null) {
        continue;
      } else if (leftNode == null || rightNode == null) {
        //left is number and right is null or right is number and left is null
        return false;
      } else if (leftNode.val != rightNode.val) {
        //values are not equal
        return false;
      }
      //make a example A(1) B(1) B(2) A(2)
      //add A(1)
      Queue.add(leftNode.left);
      //add A(2)
      Queue.add(rightNode.right);
      //add B(1)
      Queue.add(leftNode.right);
      //add B(2)
      Queue.add(rightNode.left);
    }
    //if the Queue is empty,so it is true
    return true;
  }
}
