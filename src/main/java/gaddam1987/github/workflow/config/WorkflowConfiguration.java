package gaddam1987.github.workflow.config;

import gaddam1987.github.workflow.domain.WorkFlowEngine;
import gaddam1987.github.workflow.service.Service1ComponentEntryPoint;
import gaddam1987.github.workflow.service.Service2ComponentEntryPoint;
import gaddam1987.github.workflow.service.Service3ComponentEntryPoint;
import gaddam1987.github.workflow.service.complex.Service4ComponentEntryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "gaddam1987.github.workflow")
public class WorkflowConfiguration {

    @Autowired
    Service1ComponentEntryPoint service1ComponentEntryPoint;

    @Autowired
    Service2ComponentEntryPoint service2ComponentEntryPoint;

    @Autowired
    Service3ComponentEntryPoint service3ComponentEntryPoint;

    @Autowired
    Service4ComponentEntryPoint service4ComponentEntryPoint;

    @Bean
    public DataSource dataSource() {
        // no need shutdown, EmbeddedDatabaseFactoryBean will take care of this
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        EmbeddedDatabase db = builder
                .setType(EmbeddedDatabaseType.H2) //.H2 or .DERBY
                //.addScript("db/sql/create-db.sql")
                //.addScript("db/sql/insert-data.sql")
                .build();
        return db;
    }

    @Bean
    public WorkFlowEngine initiatePaymentEngine() {
        WorkFlowEngine workFlowEngine = new WorkFlowEngine();
        workFlowEngine
                .next(service1ComponentEntryPoint)
                .next(service2ComponentEntryPoint)
                .next(service4ComponentEntryPoint);

        return workFlowEngine;
    }
}
