package 二叉树与递归;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Description: 练习二分搜索树
 * @author: Arnold
 * @since: 2019/4/11 20:07
 * @version: v1.0.0
 */
public class BSTTest<Key extends Comparable<Key>, Value> {
    private class Node {
        private Key key;
        private Value value;
        private Node left, right;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
            left = right = null;
        }
    }

    private Node root;
    private int count;

    public BSTTest() {
        root = null;
        count = 0;
    }

    public void insert(Key key, Value value) {
        root = insert(root, key, value);
    }

    public void preOrder() {
        preOrder(root);
    }

    public void inOrder() {
        inOrder(root);
    }

    public void postOrder() {
        postOrder(root);
    }

    public void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            System.out.print(node.key + " ");
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
    }

    public void removeMin() {
        root = removeMin(root);
    }

    public void removeMax() {
        root = removeMax(root);
    }

    public void remove(Key key) {
        root = remove(root, key);
    }

    public Key minimum() {
        assert count != 0;
        return minimum(root).key;
    }

    /*
     * @Description: 非递归前序遍历
     * @param
     * @throws
     * @retrun
     * @author Arnold
     * @version v1.0.0
     * @since: 2019/4/12 9:13
     */
    public void preOrder1() {
        Stack<Node> stack = new Stack<>();
        Node node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                System.out.print(node.key + " ");
                stack.add(node);
                node = node.left;
            }
            if (!stack.isEmpty()) {
                node = stack.pop().right;
            }
        }
    }

    /**
     * 非递归后续遍历
     * <p>
     * 后序遍历的非递归实现是三种遍历方式中最难的一种。因为在后序遍历中，
     * 要保证左孩子和右孩子都已被访问并且左孩子在右孩子前访问才能访问根结点，
     * 这就为流程的控制带来了难题。下面介绍思路:
     * 要保证根结点在左孩子和右孩子访问之后才能访问，因此对于任一结点P，先将其入栈。
     * 如果P不存在左孩子和右孩子，则可以直接访问它；或者P存在左孩子或者右孩子，
     * 但是其左孩子和右孩子都已被访问过了，则同样可以直接访问该结点。若非上述两种情况，
     * 则将P的右孩子和左孩子依次入栈，这样就保证了每次取栈顶元素的时候，左孩子在右孩子前面被访问，
     * 左孩子和右孩子都在根结点前面被访问
     * </p>
     */
    public void postOrder1() {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node cur=null;
        Node pre=null;
        while (!stack.isEmpty()) {
            cur=stack.peek();
            if ((cur.left == null && cur.right == null) || (pre!= null && (cur.right == pre || cur.left == pre))) {
                pre=stack.pop();
                System.out.print(pre.key+" ");
            }
            else{
                if(cur.right!=null)
                    stack.push(cur.right);
                if(cur.left!=null)
                    stack.push(cur.left);
            }
        }
    }

    private Node minimum(Node node) {
        if (node.left == null)
            return node;
        return minimum(node.left);
    }

    private Node remove(Node node, Key key) {
        if (node == null)
            return null;
        if (key.compareTo(node.key) < 0) {
            node.left = remove(node.left, key);
            return node;
        } else if (key.compareTo(node.key) > 0) {
            node.right = remove(node.right, key);
            return node;
        } else {
            if (node.left == null) {
                Node rightNode = node.right;
                node.right = null;
                count--;
                return rightNode;
            }

            if (node.right == null) {
                Node leftNode = node.left;
                node.left = null;
                count--;
                return leftNode;
            }
            //左右子树都不为空
            Node newNode = minimum(node);
            count++;
            newNode.right = removeMin(node.right);
            newNode.left = node.left;
            node.right = node.left = null;
            count--;
            return newNode;

        }
    }

    private Node removeMin(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            count--;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }

    private Node removeMax(Node node) {
        if (node.right == null) {
            Node leftNode = node.left;
            node.left = null;
            count--;
            return leftNode;
        }
        node.right = removeMax(node.right);
        return node;
    }

    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.key + " ");
        }
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);

        }
    }


    private void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }


    private Node insert(Node node, Key key, Value value) {
        if (node == null) {
            count++;
            return new Node(key, value);
        }
        if (key.compareTo(node.key) == 0) {
            node.value = value;
            return node;
        } else if (key.compareTo(node.key) < 0) {
            node.left = insert(node.left, key, value);
        } else
            node.right = insert(node.right, key, value);
        return node;
    }


    public static void main(String[] args) {
        BSTTest<Integer, Integer> bst = new BSTTest<>();
        for (int i = 0; i < 20; i++) {
            bst.insert((int) (Math.random() * 100), i + 100);
        }
        bst.insert(100, 10);
        System.out.println("递归中序遍历.................");
        bst.preOrder();
        System.out.println();
        System.out.println("非递归中序遍历");
        bst.preOrder1();

        System.out.println();
        bst.inOrder();

        System.out.println();
        System.out.println("递归后续遍历...........");
        bst.postOrder();
        System.out.println();
        System.out.println("非递归后续遍历");
        bst.postOrder1();

        System.out.println();
        bst.levelOrder();
        System.out.println();
        System.out.println("删除最小值");
        bst.removeMin();
        bst.levelOrder();
        System.out.println();
        bst.remove(100);
        bst.levelOrder();
    }
}


