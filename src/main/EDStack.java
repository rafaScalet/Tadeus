package main;

public class EDStack {
  private ListaLinearSimples stack;

  public EDStack() {
    this.stack = new ListaLinearSimples();
  }

  public void push (Node node) {
    this.stack.append(node);
  }

  public Node pop () {
    return this.stack.pop();
  }

  public void show () {
    this.stack.show();
  }

  public boolean empty () {
    return this.stack.length() <= 0;
  }

  public String toString () {
    return this.stack.toString();
  }
}
