package com.altama.forecast.domain.shared;

/**
 *
 * @author leevy.malik
 */
public interface AggregateObject<T> {

    boolean sameIdentityAs(T other);
}
