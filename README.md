jersey-cache-control
====================

Annotations to be used with JAX-RS web services to add header "Cache-Control" to the response.


## Usage

### Using ResourceConfig:
    public static class JerseyServletConfig extends ResourceConfig {
        public JerseyServletConfig() {
            packages("package.name"); //fetches all services, and resolvers dynamically
        }
    }

This approach dynamically uses classes annotated with the **@Provider**.
