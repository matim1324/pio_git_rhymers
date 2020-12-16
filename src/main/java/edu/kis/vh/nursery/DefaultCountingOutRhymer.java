package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

  public static final int SIZE = 12;
  public static final int MAX = 11;
  public static final int CURRENT= -1;
  private final int[] numbers = new int[SIZE];

  public int total = CURRENT;

  public void countIn(int in) {
    if (!isFull()) numbers[++total] = in;
  }

  public boolean callCheck() {
    return total == CURRENT;
  }

  public boolean isFull() {
    return total == MAX;
  }

  protected int peekaboo() {
    if (callCheck()) return CURRENT;
    return numbers[total];
  }

  public int countOut() {
    if (callCheck()) return CURRENT;
    return numbers[total--];
  }
}
