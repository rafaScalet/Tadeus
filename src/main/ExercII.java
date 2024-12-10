package main;

import java.util.Scanner;

public class ExercII {
  public static void main(String[] args) {
    ListaLinearSimples lld = new ListaLinearSimples();
    Scanner in = new Scanner(System.in);
    int strSize = 3;
    int value = 0;
    while ((value = in.nextInt()) > 0) {
      Node node = new Node(String.format("%0" + strSize + "d", value), value);
      lld.insertInOrd(node);
      lld.show();
    }
    in.close();
  }
}
