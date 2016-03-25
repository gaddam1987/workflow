package gaddam1987.github.workflow.domain;

import java.util.ArrayList;
import java.util.List;

public class WorkFlowEngine {
    private List<WorkFlowComponent> workFlowComponents = new ArrayList<WorkFlowComponent>();

    public WorkFlowEngine next(WorkFlowComponent workFlowComponent) {
        workFlowComponents.add(workFlowComponent);
        return this;
    }
}
