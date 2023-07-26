package com.ikarabulut.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class dropwizardSimpleApplication extends Application<dropwizardSimpleConfiguration> {

    public static void main(final String[] args) throws Exception {
        new dropwizardSimpleApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizardSimple";
    }

    @Override
    public void initialize(final Bootstrap<dropwizardSimpleConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final dropwizardSimpleConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
