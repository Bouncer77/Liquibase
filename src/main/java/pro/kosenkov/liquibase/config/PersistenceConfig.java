package pro.kosenkov.liquibase.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "pro.kosenkov.liquibase.repository")
public class PersistenceConfig {
}
