package io.springfox.spring.boot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.runner.WebApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

class Swagger2BootCompatibilityTest {
    @Test
    void enabledSwagger2ConfigurationStartsInBoot4WebContext() {
        new WebApplicationContextRunner()
                .withUserConfiguration(Swagger2WebMvcAutoConfiguration.class)
                .withPropertyValues("swagger.enabled=true")
                .run(context -> assertThat(context).hasNotFailed());
    }
}
