import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    List<String> retList = new ArrayList<>();
    Node<String>current_node = head;
    while (current_node != null) {
      retList.add(current_node.val);
      current_node = current_node.next;
      
    }
    System.out.println(retList.toString());


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
    Solution.linkedListValues(huh);
  }
}
