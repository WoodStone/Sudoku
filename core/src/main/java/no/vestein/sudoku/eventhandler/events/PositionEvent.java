package no.vestein.sudoku.eventhandler.events;

public class PositionEvent extends Event {

  private final int x, y;

  public PositionEvent(final int x, final int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

}
