package home.practice.trie;

public class Trie<E> {


    // Default assumption is that this will
    // have the
    private int charsetSize = 26;

    private Node root;

    private Trie() throws IllegalArgumentException{
        throw new IllegalArgumentException("Use the constructor to setup the size");
    }

    public Trie(int charsetSize){
        this.charsetSize = charsetSize;
        root = new Node(charsetSize,null);
    }
    public void addData(E e){

    }
}

class Node<E>{

    private E data;

    private int charsetSize;

    private Node[] nodes=null;

    public Node(int charsetSize,E data){
        this.charsetSize = charsetSize;
        nodes = new Node[this.charsetSize];
        this.data = data;
    }

    public Node[] getNodes(){
        return nodes;
    }
}
