package no.vestein.sudoku.eventhandler;

public interface ListenerList<T> extends Iterable<Listener> {

  void register(final Listener listener);

  void unregister(final Listener listener);

  T getListeners();

}
