package graphandtree;

import java.util.Stack;
import org.omg.CORBA.Current;

public class Tree {

    private Node root;

    public Tree() {
        root = null;
    }

    public Node find(int key) {
        Node current = root;
        while (current.id != key) {
            if (key < current.id) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int id, String data) {
        Node newNode = new Node();
        newNode.id = id;
        newNode.data = data;
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (id < current.id) {
                    current = current.leftChild;
                }
                if (current == null) {
                    parent.leftChild = newNode;
                    return;
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }

    }

    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.id != key) {
            parent = current;
            if (key < current.id) {
                isLeftChild = true;
                current = current.rightChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) {
                return false;
            }
        }
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        } else {
            Node succesor = getSuccessor(current);
            if (current == root) {
                root = succesor;
            } else if (isLeftChild) {
                parent.leftChild = succesor;
            } else {
                parent.rightChild = succesor;
            }
            succesor.leftChild = current.leftChild;
        }
        return true;

    }

    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    public void traverse(int traverseType) {
        switch (traverseType) {
            case 1:
                System.out.println("Preorder travesal: ");
                preOrder(root);
                break;
            case 2:
                System.out.println("Inorder travesal: ");
                inOrder(root);
                break;
            case 3:
                System.out.println("Postorder taravesal: ");
                postOrder(root);
                break;
        }
        System.out.println();
    }

    private void preOrder(Node localRoot) {
        if (localRoot != null) {
            System.out.println(localRoot.id + "");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.println(localRoot.id + "");
            inOrder(localRoot.rightChild);
        }
    }

    private void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.err.println(localRoot.id + "");
        }
    }

    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println(".....................................");
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;      
            for (int j = 0; j < nBlanks; j++) {
                System.out.print(' ');
            }
        while (globalStack.isEmpty()== false){
            Node temp = (Node) globalStack.pop();
            if (temp != null){
                System.out.print(temp.id);
                localStack.push(temp.leftChild);
                localStack.push(temp.rightChild);
                if (temp.leftChild != null || temp.rightChild != null){
                    isRowEmpty = false;
                }
            }else {
                    System.out.print("--");localStack.push(null); localStack.push(null);
                } for (int j = 0; j < nBlanks; j++) {
                    System.out.print(' ');
                }
            }
            System.out.println();
            nBlanks /=2;
            while (localStack.isEmpty()== false){
                globalStack.push(localStack.pop());
                
            }
        }
            System.out.println(".............................................");
        }

    }

