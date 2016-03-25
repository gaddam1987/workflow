package gaddam1987.github.workflow.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@ContextConfiguration(classes = WorkflowConfiguration.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class WorkflowConfigurationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void hello() {
        System.out.println("Helloooooo1");
    }
}