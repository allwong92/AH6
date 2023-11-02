import java.util.ArrayList;   // import ArrayList class
import java.util.List;

import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {    // T means generics in Java, the value can be any type (String, Integer) but NOT primitives
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    /*
     * This method gets the head of a linked list and returns a list 
     * containing all values of the nodes in the linked list.
     */
    List<String> retList = new ArrayList<>();   // initialize list to return
    Node<String>current_node = head;            // to hold the Node currently being traversed        
    
    while (current_node != null) {              // while current_node isn't null
      retList.add(current_node.val);            // add value of current_node to retList
      current_node = current_node.next;         // set current_node to next node
      
    }
    // Print list containing all values using toString method
    System.out.println(retList.toString());

    return retList;
  }

  public static List<String> linkedListValuesRecursive(Node<String> head, ArrayList<String> retList) {
    /*
     * This method gets the head of a linked list and an ArrayList called retList and returns the 
     * retList containing all values of the nodes in the linked list but 
     * now it does it recursively.
     */
    Node<String>current_node = head;      // assign head to current_node
    retList.add(current_node.val);        // add the value of current node to retList

      if (current_node.next != null){     // while the next node isn't null (base case is tail)
        linkedListValuesRecursive(current_node.next, retList);    // call function again with next node as head
      }
      

    return retList;
  }

  public static void main(String[] args) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    Solution.linkedListValues(a); 
    // -> [ "a", "b", "c", "d" ]

    Node<String> hi = new Node<>("Allison");
    Solution.linkedListValues(hi);
    // -> [Allison]

    Node<String> hello = new Node<>("Raj");
    Node<String> hey = new Node<>("Marcus");
    Node<String> welcome = new Node<>("Lean");
    Node<String> greetings = new Node<>("Henry");
    Node<String> aloha = new Node<>("Zhou");
    Node<String> HIII = new Node<>("Will");
    Node<String> huh = new Node<>("Ryan");
    huh.next = hello;
    hello.next = hey;
    hey.next = welcome;
    welcome.next = hi;
    hi.next = greetings;
    greetings.next = aloha;
    aloha.next = HIII;

     Solution.linkedListValues(hello);
    // -> [Raj, Marcus, Lean, Allison, Henry, Zhou, Will]


    // Test recursive method

    ArrayList<String> retList = new ArrayList<>();
    Solution.linkedListValuesRecursive(a, retList);
    System.out.println(retList);
    // -> [a, b, c, d]


  }
}
