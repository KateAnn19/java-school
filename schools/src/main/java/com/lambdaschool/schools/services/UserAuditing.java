package com.lambdaschool.schools.services;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component //let's Spring know
public class UserAuditing implements AuditorAware<String> //connects to Createdby (and the other ones) inside Auditable
{
    @Override
    public Optional<String> getCurrentAuditor()
    {
        return Optional.of("SYSTEM");
    }
}
