package com.lambdaschool.schools.exceptions;

public class ResourceNotFoundException extends RuntimeException
{
    public ResourceNotFoundException(String message)
    {
        super("Found and error with school: " + message);
    }
}
