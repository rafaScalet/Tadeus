package main;

public class EDStackMerged {
  public EDStack merge (EDStack stk1, EDStack stk2) {
    EDStack mergedStack = new EDStack();

    while (!stk1.empty()) {
      mergedStack.push(stk1.pop());
      // mergedStack.push(stk2.pop());
    }
    return mergedStack;
  }
}
