/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.constant;

public class ConstantInteger
  extends ConstantValue
{
    public final int bytes;

    public ConstantInteger(byte tag, int bytes)
    {
        super(tag);
        this.bytes = bytes;
    }
}
