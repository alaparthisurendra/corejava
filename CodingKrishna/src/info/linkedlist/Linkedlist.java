/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.linkedlist;

class Node
{
    int data;
    Node next;
}
class Linked{
    public Node insert(int i, Node node)
    {
       if(node==null)
       {
           return getNode(i);
       }
       else
       {
           node.next=insert(i,node.next);
       }
       return node;
    }
    
    
   public Node getNode(int i)
   {
       Node n=new Node();
       n.data=i;
       n.next=null;
       return n;
   }
    
   public void printLinkedlist(Node root)
   {
       if(root==null)
       {
           return;
       }
       else
       {
           System.out.println(root.data);
           printLinkedlist(root.next);
       }
   }
}
public class Linkedlist {
    
    public static void main(String[] args)
    {
        Node root=null;
        Linked list=new Linked();
       root =list.insert(25,root);
       root =list.insert(50,root);
       root =list.insert(75,root);
       
       list.printLinkedlist(root);
    }   
    
}
