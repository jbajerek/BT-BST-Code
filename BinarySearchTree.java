
import java.util.*;


public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> {
     static int k=0;
     static boolean found=false;
     public BinarySearchTree() {
        super();
    }
    public BinarySearchTree(E val) {
        super(val);
    }
    
    public void contains (E val, Node<E> n) {
        if (found) return;
        if (k>size ) {
            found = false;
        }
        if (n!=null) {
            k++;
            if (n.getInfo().equals(val)) { 
                found=true;
            }
            else {
                  contains(val, n.getLeft());
                  contains(val, n.getRight());
                }
            }//if n is null
            else 
                return;    
    }
         
    
    public boolean contains (E val) {
        k=0;
        found=false;
        if (!isEmpty()) {
            contains(val,root);
            return found;
        }
      return false;  
        
    }
    public void insert(E val) {
      if (isEmpty()) {
       root = new Node<E>(val);
       size++;
    }
    else {
           Node<E> temp=root;
           Node<E> current=null;
           int c=0;
           while (temp!=null) {
               current=temp;
               c= temp.getInfo().compareTo(val);
               if (c<0) temp=temp.getRight();
               else if (c>0) temp=temp.getLeft();
               else if (c==0) {
                   System.out.println("duplicate found ..");
                   break;
               }
            }
            if (c<0) addRight(current,val);
            else if (c>0) addLeft(current,val);
            
           }
    }
    
    public E findMin(){
      if (!isEmpty()) {
          Node<E> p = root;
          while (p.getLeft()!=null)
          p=p.getLeft();
        return p.getInfo();
      }
      else throw new NoSuchElementException();
    }
    
    public E findMax(){
      if (!isEmpty()) {
          Node<E> p = root;
          while (p.getRight()!=null)
          p=p.getRight();
        return p.getInfo();
      }
      else throw new NoSuchElementException();
    }  
    
    public MaxHeap<E> buildHeapFromBST(){
		
	}
    public static void main(String[] args) {
        BinarySearchTree<Integer> bt= new BinarySearchTree<>();
        bt.insert(5);
        bt.insert(10);
        bt.insert(3);
        bt.insert(20);
        bt.insert(8);
        bt.insert(4);
        bt.insert(17);
        bt.insert(2);
        bt.insert(8);
        System.out.println(bt.contains(2));
       // System.out.println(bt.findMin());
        //System.out.println(bt.findMax());
        
    }
    
             
}
   
