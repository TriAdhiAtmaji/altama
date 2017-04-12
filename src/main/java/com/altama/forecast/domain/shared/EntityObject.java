package com.altama.forecast.domain.shared;

/**
 * An entity, as explained in the DDD model
 *  
 */
public interface EntityObject<T> {

  boolean sameIdentityAs(T other);

}
