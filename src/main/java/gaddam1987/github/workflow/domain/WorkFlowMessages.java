package gaddam1987.github.workflow.domain;

import java.util.Map;

public class WorkFlowMessages<T> implements Context<T> {

    Map<Class<T>, T> workFlowMessages;

    public void setAttribute(T value) {
        workFlowMessages.put((Class<T>) value.getClass(), value);
    }

    public T getAttribute(Class<T> t) {
        return workFlowMessages.get(t);
    }

}
