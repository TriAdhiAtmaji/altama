package com.altama.forecast.interfaces.web.facade.dto.assembler;

/**
 *
 * @author merlin
 */
public interface IObjectAssembler<X,Y> {
    Y toDTO(X domainObject);
    X toDomain(Y dtoObject);
}
