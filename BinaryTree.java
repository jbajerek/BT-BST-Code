

public class BinaryTree<E> {

    int size;
    Node<E> root;
    
    public BinaryTree () {
     size =0;
     root=null;
    }
    
    
    public BinaryTree(E val) {
        root = new Node(val);
        // root node only
        size=1;
        
    }
    public boolean isEmpty() {
        return size==0;
    }
    
    
    public Node<E> addLeft(Node<E> node, E val) {
        Node<E> n = new Node(val);
        node.addLeft(n);
        size++;
        return n;
    }
    
    public Node<E> addRight(Node<E> node, E val) {
        
       Node<E> n = new Node(val);
        node.addRight(n);
        size++;
        return n ;
    } 
    
    public void preOrder(Node<E> n) {
        
        if (n==null) return;
        System.out.println(n.getInfo());
        preOrder(n.getLeft());
        preOrder(n.getRight());
        
    }
    
    public void inOrder(Node<E> n) {
        
        if (n==null) return;
        inOrder(n.getLeft());
        System.out.println(n.getInfo());
        inOrder(n.getRight());
        
    }
    
    public void postOrder(Node<E> n) {
        
        if (n==null) return;
        
        postOrder(n.getLeft());
        postOrder(n.getRight());
        System.out.println(n.getInfo());
        
    }
	
	public int height(){
		
	}
	
	public boolean isLeaf(Node<E> n){
		
	}
	
	public int nodeLevel (Node<E> v) {
		
	}
	
	public void breadthFirstTraversal(){
		
	}
	
	public int nodeHeight(Node<E> v){
		
	}
	
	public double averageLevel(){
		
	}
    
    
        
    public static void main(String[] args){
        
       // BinaryTree<String> bt = new BinaryTree<>("cat");
      // bt.addLeft(bt.root,"dog");
       // bt.addRight(bt.root,"mouse");
       BinaryTree<String> bt = new BinaryTree<>("-");
       Node<String> n1 =bt.addLeft(bt.root,"*");
       Node<String> n2 = bt.addRight(bt.root,"/");
       bt.addLeft(n1,"x");
       bt.addRight(n1,"y");
       bt.addLeft(n2,"y");
       bt.addRight(n2,"z");
       bt.postOrder(bt.root);
    }
    
}
