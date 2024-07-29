import java.util.*;
public class BinaryTreeB {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;

        }
    }
    static class Tree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;

            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
        // preorder root left right
        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        // inorder left root right
        public static void inOrder(Node root){//O(n)
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
        //postorder left right root 
        public static void postOrder(Node root){//o(n)
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
        public static int height(Node root){
            if (root==null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh)+1;
        }
        public static int countN(Node root){
            if (root ==null) {
                return 0;
            }
            int rt = countN(root.right);
            int lt  = countN(root.left);
            return rt+lt+1;
        }
        public static int sumNodes(Node root){//o(n)
            if (root==null) {
                return 0;
            }
            int lt=sumNodes(root.left);
            int rt=sumNodes(root.right);
            return lt+rt+root.data;
        }
        // DIAMETER 
        /*
         * approach one
         * we calculate the dia 
         * if passing through the root as the ht of lt and rt sub tree plus one
         * if not then we calcu late the dia of the left and rt subtre 
         * then check for the max one
         *  as we check height of the tree as well for n nodes 
         * n times 
         * there by the time complexity becomes O(n^2)  
         * 
         */
        public static int diameter1(Node root){// O(n^2)
            if (root==null) {
                return 0;
            }
            int ltdia=diameter1(root.left);
            int rtdia=diameter1(root.right);
            int ltht=height(root.left);
            int rtht=height(root.right);
            int self= rtht+ltht+1;
            return Math.max(self,Math.max(ltdia,rtdia));
        }
        // a class for the diameter fxn
        // static class Info{
        //     int  dia;
        //     int ht;
        //     public Info(int dia,int ht){
        //         this.dia= dia;
        //         this.ht=ht;
        //     }
        // }
        // public static Info diameter(Node root){
        //     Info leftInfo= diameter(root.left);
        //     Info rightInfo= diameter(root.right);

        //     int dia= Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo);
        // }
        public static boolean isIdentical(Node root,Node subroot){
            if (root==null&&subroot==null) {
                return true;
            }else if(root==null||subroot==null||root.data!=subroot.data){
                return false;
            }
            if(!isIdentical(root.left, subroot.left)){
                return false;
            }
            if(!isIdentical(root.right, subroot.right)){
                return false;
            }
            return true;
        }
        public static boolean subTree(Node root,Node subroot){// return true when the subtree exists in the tree
            if(root == null){
                return false;
            }
            if(root.data==subroot.data){
                if (isIdentical(root,subroot)) {
                    return true;
                }
            }
            return subTree(root.left, subroot)||subTree(root.right, subroot);
        }
        static class Info{
            Node node;
            int hd;
            public Info(Node node,int hd){
                this.node=node;
                this.hd=hd;

            }
        }
        public static void topView(Node root){
            Queue<Info> q= new LinkedList<>();
            HashMap<Integer,Node> map=new HashMap<>();
            int min=0,max=0;
            q.add(new Info(root,0));
            q.add(null);
            while (!q.isEmpty()) {
                Info curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    if(!map.containsKey(curr.hd)){// first tiem my hd is occuring
                        map.put(curr.hd,curr.node);
                    }
                    if (curr.node.left!=null) {
                        q.add(new Info(curr.node.left,curr.hd-1));
                        min = Math.min(min,curr.hd-1);
                    }
                    if (curr.node.right!=null) {
                        q.add(new Info(curr.node.right,curr.hd+1));
                        max = Math.max(max,curr.hd+1);
                    }
                }
                
                
            }
            for (int i = min; i <=max; i++) {
                System.out.print(map.get(i).data+" ");
            }
            System.out.println();
        }
        public static void Klevel(Node root, int level,int k){
            if (root==null) {
                return ;
            }
            if (level==k) {
                System.out.print(root.data+" ");
            }
            Klevel(root.left, level+1, k);
            Klevel(root.right, level+1, k);
        }
        public static Node lca2(Node root,int n1,int n2){
            if (root==null||root.data==n1||root.data==n2) {
                return root;
            }
            Node leftLCA=lca2(root.left, n1, n2);
            Node rightLCA=lca2(root.right, n1, n2);
            //leftLCA=val rightLCA=null
            if (rightLCA==null) {
                return leftLCA;
            }
            if (leftLCA==null) {
                return rightLCA;
            }
            return root;
        }
        public static int lcaDist(Node root,int n){
            if (root==null) {
                return -1;
            }
            if (root.data==n) {
                return 0;
            }
            int leftdist=lcaDist(root.left, n);
            int rightdist=lcaDist(root.right, n);
            if (leftdist==-1&&rightdist==-1) {
                return -1;
            }else if(leftdist==-1){
                return rightdist+1;
            }else{
                return leftdist+1;
            }
        }
        public static int minDistance(Node root,int n1,int n2){
            Node lca=lca2(root, n1, n2);
            int dist1=lcaDist(lca, n1);            
            int dist2=lcaDist(lca, n2);     
            return dist1+dist2;       
        }
        public static void levelOrder(Node root){
            if(root== null){
                return ;
            }
            Queue<Node>q= new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
       
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};// pre order
        Tree tree = new Tree();
        Node root = tree.buildTree(nodes);
         /*
         *           1
         *         /   \
         *        2     3
         *      /  \     \
         *     4   5      6
         * 
         */
        // System.out.println("Main Root :\n"+root.data);
        // System.out.println("Pre-Order :");
        // tree.preOrder(root);
        // System.out.println("\nIn-Order :");
        // tree.inOrder(root);
        // System.out.println("\npost-Order :");
        // tree.postOrder(root);
        // System.out.println("\nlevel-Order :");
        // tree.levelOrder(root);
        // System.out.println("\nHeight of tree :");
        // System.out.println(tree.height(root));
        // System.out.println("\ncount of node :");
        // System.out.println(tree.countN(root));
        // System.out.println("\nSum of root :");
        // System.out.println(tree.sumNodes(root));
        // System.out.println("\ndiameter of tree:");
        // //System.out.println(tree.diameter1(root));
        // int nodes1[] = { 2, 4, -1, -1, 5, -1, -1};
        // Tree tree1 = new Tree();
        // Node root1 = tree1.buildTree(nodes1);
        //  /*    sub  tree 
        //  *         2     
        //  *      /   \     
        //  *     4     5      
        //  * 
        //  */
        // System.out.println(tree.subTree(root, root1));
    //     System.out.println("\nTop view of tree:");
    //     tree.topView(root);
    // int k=3;
    // tree.Klevel(root,1,k);
    int n1= 2,n2=3;
    System.out.println(tree.minDistance(root, n1, n2));
    }
}