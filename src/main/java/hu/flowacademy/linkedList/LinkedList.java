package hu.flowacademy.linkedList;

public interface LinkedList<T> {
    void add(T element);

    void add(int index, T element);

    void addFirst(T element);

    void addAll(LinkedList<T> elements);

    void clear();

    boolean contains(T element);

    int indexOf(T element);

    int lastIndexOf(T element);

    T get(int index);

    T getFirst();

    void remove(int index);

    int size();

    LinkedList<T> clone();
}
