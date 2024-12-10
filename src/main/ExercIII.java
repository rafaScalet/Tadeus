package main;

import java.util.Scanner;

public class ExercIII {
  public static void main(String[] args) {
    EDStack stk1 = new EDStack();
    EDStack stk2 = new EDStack();
    Scanner in = new Scanner(System.in);
    int value = 0;
    int factor = 2;
    while ((value = in.nextInt()) >= 0) {
      Node n1 = new Node(value + "", value);
      stk1.push(n1);
      Node n2 = new Node((value * factor) + "", value * factor);
      stk2.push(n2);
    }
    EDStackMerged mstk = new EDStackMerged();
    EDStack newStk = mstk.merge(stk1, stk2);
    newStk.show();
    in.close();
  }
}
