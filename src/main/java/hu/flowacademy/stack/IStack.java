package hu.flowacademy.stack;

public interface IStack<T> {
    void push(T element);

    T pop();

    T peek();
}
