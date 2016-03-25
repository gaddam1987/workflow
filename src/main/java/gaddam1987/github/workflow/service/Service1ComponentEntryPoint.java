package gaddam1987.github.workflow.service;

import gaddam1987.github.workflow.domain.WorkFlowComponent;
import gaddam1987.github.workflow.service.domain.Service1Domain;
import org.springframework.stereotype.Component;

@Component
public class Service1ComponentEntryPoint extends WorkFlowComponent<Service1Domain> {

    public void handle(Service1Domain service1Domain) {
    }

    public boolean isTree() {
        return false;
    }
}
