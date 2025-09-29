package ie104.doAn.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class WebConfig implements RepositoryRestConfigurer {
<<<<<<< HEAD
    private final String[] url = {"http://localhost:3000", "http://localhost:5500", "http://127.0.0.1:3000"};
=======

    private final String[] url = {"http://localhost:3000", "http://localhost:5500", "http://127.0.0.1:5500"};
>>>>>>> 097536f12426eebc1dce8c8b2efff86420395c11
    @Autowired
    private EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(entityManager.getMetamodel()
                .getEntities().stream().map(Type::getJavaType).toArray(Class[]::new));
        cors.addMapping("/**")
                .allowedOrigins(url)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*");
    }
}
