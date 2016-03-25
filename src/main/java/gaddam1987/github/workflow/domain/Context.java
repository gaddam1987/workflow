package gaddam1987.github.workflow.domain;

public interface Context<T> {
    void setAttribute(T value);

    T getAttribute(Class<T> t);
}
