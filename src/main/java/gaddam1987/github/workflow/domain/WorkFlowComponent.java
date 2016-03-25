package gaddam1987.github.workflow.domain;

public abstract class WorkFlowComponent<T> {
    public abstract void handle(T t);

    public abstract boolean isTree();
}
