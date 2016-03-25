package gaddam1987.github.workflow.service;

import gaddam1987.github.workflow.domain.WorkFlowComponent;
import gaddam1987.github.workflow.service.domain.Service1Domain;
import gaddam1987.github.workflow.service.domain.Service2Domain;
import org.springframework.stereotype.Component;

@Component
public class Service2ComponentEntryPoint extends WorkFlowComponent<Service2Domain> {

    @Override
    public void handle(Service2Domain service2Domain) {
    }

    @Override
    public boolean isTree() {
        return false;
    }
}
