/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.constant;

public class ConstantLong
  extends ConstantValue
{
    public final long bytes;

    public ConstantLong(byte tag, long bytes)
    {
        super(tag);
        this.bytes = bytes;
    }
}
