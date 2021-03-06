jersey-cache-control
====================

Annotations to be used with JAX-RS web services to add header "Cache-Control" to the response.

This project should be seen as nothing more than just a skeleton for annotation functionality in a JAX-RS environment.

## Usage

### Using ResourceConfig:
Include the CacheFilterFactory.java in **package.name** and refer to that package in your ResourceConfig

    public static class JerseyServletConfig extends ResourceConfig {
        public JerseyServletConfig() {
            packages("package.name"); //fetches all services, and resolvers dynamically
        }
    }

This approach dynamically uses classes annotated with the **@Provider**.

OR

Register the CacheFilterFactory.java directly in your ResourceConfig

    public static class JerseyServletConfig extends ResourceConfig {
        public JerseyServletConfig() {
            register(CacheFilterFactory.class);
        }
    }


