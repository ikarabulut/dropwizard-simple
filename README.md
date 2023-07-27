# Dropwizard simple build

This is my implementation of the [getting started example](https://www.dropwizard.io/en/stable/getting-started.html) from the dropwizard tutorial. Completed in preparation for a larger project that will utilizing dropwizard.

## Running locally
- Clone the repository `git clone git@github.com:ikarabulut/dropwizard-simple.git`
- `cd` into the projects root directory & build the package `mvn package`
- Run the file `java -jar target/dropwizard-simple-1.0-SNAPSHOT.jar server config.yml`
- This will run the dropwizard application on two ports 
  - `:8080`: main application
    - Navigate to this path with the `hello-world` endpoint that is configured
  - `:8081`: admin portal
    - Navigate to multiple endpoints bootstrapped by dropwizard
      - `/metrics`
      - `/healthcheck`

## Learnings
- "fat" jars: aka "uber jars". These `.jar` files are packaged utilizing the `maven-shader` plugin. Though this plugin addition to your `pom.xml` file you will have the added functionality to create a single artifact that contains all of the `.class` dependency files allowing you to pass a single artifact through environments without having to worry about the differences in installed libraries.