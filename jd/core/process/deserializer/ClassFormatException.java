/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.process.deserializer;

public class ClassFormatException
  extends RuntimeException
{
    private static final long serialVersionUID = -3407799517256621265L;



    public ClassFormatException()
    {}

    public ClassFormatException(String s)
    {
        super(s);
    }
}
