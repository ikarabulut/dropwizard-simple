package com.ikarabulut.dropwizard.resources;

import com.ikarabulut.dropwizard.api.Saying;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import io.dropwizard.testing.junit5.ResourceExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(DropwizardExtensionsSupport.class)
class HelloWorldResourceTest {
    private static final String defaultName = "Stranger";

    private static final String template = "Hello, " + defaultName + "!";
    private static final ResourceExtension EXT = ResourceExtension      .builder()
            .addResource(new HelloWorldResource(template, defaultName))
            .build();
    @Test
    void sayHelloWithoutQueryParamShouldReturnDefaultName() {
        Saying expectedSaying = new Saying(1, template);
        HelloWorldResource helloWorldResource = new HelloWorldResource(template, defaultName);

        Saying returnedSaying = EXT.target("/hello-world").request().get(Saying.class);

        assertThat(returnedSaying.getContent()).isEqualTo(expectedSaying.getContent());
    }
}
