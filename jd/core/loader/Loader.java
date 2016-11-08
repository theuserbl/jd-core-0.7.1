/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.loader;

import java.io.DataInputStream;

public abstract interface Loader
{
    public abstract DataInputStream load(String paramString)
      throws LoaderException;
  
    public abstract boolean canLoad(String paramString);
}
