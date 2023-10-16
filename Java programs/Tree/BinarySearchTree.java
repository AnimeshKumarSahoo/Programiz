
class Node5 {
	    int key;
	    Node5 left, right;
	 
	    public Node5(int item) {
	        key = item;
	        left = right = null;
	    }
	}
	public class BinarySearchTree {
	    static Node5 root;

	    BinarySearchTree() {
	        root = null;
	    }
	    Node5 insert(Node5 node, int key) {

	        if (node == null) {
	            node = new Node5(key);
	            return node;
	        }
	        if (key < node.key)
	            node.left = insert(node.left, key);
	        else if (key > node.key)
	            node.right = insert(node.right, key);
	        return node;
	    }
	 public static boolean Find(int value){
	Node5 curr=root;
	if(curr==null)
		return true;
	else
		if(value<curr.key)
		{curr=curr.left;
		}
		else
		{curr=curr.right;
		}
	return false;
	 }
	 public static int FindMin()
	 {
	    Node5 curr=root;
	 if(curr==null)
		 {return Integer.MAX_VALUE;}
	 while(curr.left!=null)
		 {curr=curr.left;}
	 return curr.key;}
	public static int FindMax()
	{
	    Node5 curr=root;
	if(curr==null)
		return Integer.MIN_VALUE;
	while(curr.right !=null)
	{curr=curr.right;}
	return curr.key;
	}
	    Node5 search(Node5 root, int key) {
	      
	        if (root == null || root.key == key)
	            return root;
	        if (root.key < key)
	            return search(root.right, key);
	        return search(root.left, key);
	    }

	//	public boolean isBST(Node5 root){
	//		return isBST(root,Integer.MIN_VALUE , Integer.MAX_VALUE);
	//	}
	//	private boolean isBST(Node5 node , int min , int max){
	//		if(node == null)
	//			return true;
	//		if(node.key > max || node.key < min)
	//			return false;
	//		return (isBST(node, min, node.key-1) && isBST(node, node.key+1, max));
	//	}
	    public static void main(String[] args) {
	        BinarySearchTree tree = new BinarySearchTree();
	        tree.root = tree.insert(tree.root, 45);
	        tree.insert(tree.root, 15);
	        tree.insert(tree.root, 79);
	        tree.insert(tree.root, 90);
	        tree.insert(tree.root, 10);
	        tree.insert(tree.root, 55);
	        tree.insert(tree.root, 12);
	        tree.insert(tree.root,20);
	        tree.insert(tree.root,50);
	        int x=tree.FindMax();
	        int y=tree.FindMin();
	        
	 System.out.println("max"+x+" Min"+y);
	      
	        int key = 79;
	        if (tree.search(tree.root, key) == null)
	            System.out.println(key + " not found");
	        else
	            System.out.println(key + " found");
	        key = 60;
	        if (tree.search(tree.root, key) == null)
	            System.out.println(key + " not found");
	        else
	            System.out.println(key + " found");
			//System.out.println(tree.isBST(root));
	    }
	}
	