package gaddam1987.github.workflow.service;

import gaddam1987.github.workflow.domain.WorkFlowComponent;
import gaddam1987.github.workflow.service.domain.Service3Domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service3ComponentEntryPoint extends WorkFlowComponent<Service3Domain> {
    @Autowired
    Service3 service3;

    public void handle(Service3Domain service3Domain) {
    }

    public boolean isTree() {
        return false;
    }
}
