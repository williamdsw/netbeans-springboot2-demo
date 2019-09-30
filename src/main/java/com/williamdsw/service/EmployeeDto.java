package com.williamdsw.service;

/**
 * @author William
 */
public class EmployeeDto
{
    //-----------------------------------------------------------//
    // FIELDS
    
    private String name;
    private String email;
    
    //-----------------------------------------------------------//
    // CONSTRUCTOR
    
    public EmployeeDto () {}

    //-----------------------------------------------------------//
    // GETTERS / SETTERS
    
    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }
}