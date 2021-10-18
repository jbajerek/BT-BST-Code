
public class Node <E>{
    
    Node<E> left;
    Node<E> right;
    Node<E> parent;
    E  info;
    
    public Node(Node<E> le, Node<E> ri, Node<E> pa){
        left=le;
        right=ri;
        parent=pa;
    }
    
    public Node(E val){
        left=null;
        right=null;
        parent=null;
        info=val;
    }
    
    public Node(){
        left=null;
        right=null;
        parent=null;
        info=null;
    }
    
    public void addLeft(Node<E> le) {
       left=le; 
       le.addParent(this);
    }
    
    public void addRight(Node<E> ri) {   
      right=ri;  
      ri.addParent(this);
    }
    
    public void addParent(Node<E> pa){
     parent=pa; 
    }
    
    public void setInfo(E val){
        info=val;
    }
    
    public E getInfo() {
       return info; 
    }
    
    public Node<E> getLeft(){
        return left;
    }
    public Node<E> getRight(){
        return right;
    }
    public Node<E> getParent(){
        return parent;
    }
}