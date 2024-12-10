package main;

public class ListaLinearSimples{
  private Node top;
  private Node bottom;
  private int size;

  private Node searchPos (int position) {
    if (this.empty() || position > this.size) {
      return null;
    }

    Node temp = this.top;

    for (int index = 1; position != index && temp != null; index++) {
      temp = temp.getNext();
    }

    return temp;
  }

  public boolean empty() {
    return this.top == null & this.bottom == null;
  }

  public void add(Node node) {
    if(this.empty()) {
      this.bottom = this.top = node;
      this.size++;
      return;
    }

    node.setNext(this.top);
    this.top = node;
    this.size++;
  }

  public void append(Node node) {
    if(this.empty()) {
      this.bottom = this.top = node;
      this.size++;
      return;
    }

    this.bottom.setNext(node);
    this.bottom = node;
    this.size++;
  }

  public void insertInOrd (Node node) {
    if(this.empty()) {
      this.add(node);
      return;
    }

    if(node.getId().compareTo(this.top.getId()) <= 0) {
      node.setNext(this.top);
      this.top = node;
      this.size++;
      return;
    }

    Node current = this.top;
    while (current.getNext() != null && current.getNext().getId().compareTo(node.getId()) < 0) {
      current = current.getNext();
    }

    node.setNext(current.getNext());
    current.setNext(node);
    this.size++;
  }

  public Node remove() {
    Node temp = null;

    if (this.empty()) {
      return temp;
    }

    if (this.size <= 1) {
      temp = this.top;
      this.bottom = this.top = null;
      this.size--;
      return temp;
    }

    temp = this.top.getNext();
    this.top.setNext(null);
    this.top = temp;
    this.size--;

    return temp;
  }

  public Node pop() {
    Node temp = null;

    if (this.empty()) {
      return temp;
    }

    if (this.size <= 1) {
      temp = this.top;
      this.bottom = this.top = null;
      this.size--;
      return temp;
    }

    temp = this.searchPos(this.size - 1);
    temp.setNext(null);
    this.bottom = temp;
    this.size--;

    return temp;
  }

  public void clear() {
    while (!this.empty()) {
      this.pop();
    }
  }

  public void show() {
    Node temp = this.top;
    while (temp != null) {
      System.out.print(temp.getValue() + " ");
      temp = temp.getNext();
    }
    System.out.println(this.length() + " | ");
  }

  public int length() {
    return this.size;
  }
}
