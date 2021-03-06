package com.unsilo.application.datalogic.services.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Sets the cache header to the value "no cache"
 * 
 * @see <a href='http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9.1'>W3c Header Field Definitions</a>
 * 
 * @see Originally from https://gist.github.com/alexnederlof/6098121#file-cacheannotations-java
 * @author alexnederlof
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface NoCache {

}