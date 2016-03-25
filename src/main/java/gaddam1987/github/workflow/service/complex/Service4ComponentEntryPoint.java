package gaddam1987.github.workflow.service.complex;

import gaddam1987.github.workflow.domain.StopProcessFlowException;
import gaddam1987.github.workflow.domain.WorkFlowComponent;
import gaddam1987.github.workflow.service.complex.domain.Service4Domain;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Service4ComponentEntryPoint extends WorkFlowComponent<Service4Domain> {
    private List<WorkFlowComponent<Service4Domain>> workFlowComponents = new ArrayList<WorkFlowComponent<Service4Domain>>();

    public void handle(Service4Domain service4Domain) {
        try {
            for (WorkFlowComponent<Service4Domain> workFlowComponent : workFlowComponents) {
                workFlowComponent.handle(service4Domain);
            }
        } catch (Exception e) {
            throw new StopProcessFlowException(e);
        }
    }


    public boolean isTree() {
        return true;
    }
}
