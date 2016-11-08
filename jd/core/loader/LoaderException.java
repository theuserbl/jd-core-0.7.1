/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.loader;

public class LoaderException 
  extends Exception
{
    private static final long serialVersionUID = 9506606333927794L;

    public LoaderException() {}

    public LoaderException(String msg)
    {
        super(msg);
    }
}
