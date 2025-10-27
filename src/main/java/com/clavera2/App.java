package com.clavera2;

import com.clavera2.http.Status;
import com.clavera2.http.Method;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Status stat = Status.Ok;
        Method method = Method.PUT;
        IO.println("method is " + method);
    }
}
