jersey-cache-control
====================

Annotations to be used with JAX-RS web services to add header "Cache-Control" to the response.


## Usage


### Using web.xml:
    <filter>
        <filter-name>CacheControlFilter</filter-name>
        <filter-class>package.name.CacheFilterFactory</filter-class>
    </filter>
    <filter-mapping>
        <filter-name>CacheControlFilter</filter-name>
        <url-pattern>/*</url-pattern>
        <dispatcher>REQUEST</dispatcher>
        <dispatcher>FORWARD</dispatcher>
        <dispatcher>INCLUDE</dispatcher>
        <dispatcher>ERROR</dispatcher>
    </filter-mapping>

If you use this approach, the @Provider is not needed in CacheFilterFactory.

### Using ResourceConfig:
    packages("package.name"); //fetches all services, and resolvers dynamically

This approach dynamically uses classes annotated with the @Provider.
