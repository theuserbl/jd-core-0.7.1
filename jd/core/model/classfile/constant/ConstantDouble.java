/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.constant;

public class ConstantDouble
  extends ConstantValue
{
    public final double bytes;

    public ConstantDouble(byte tag, double bytes)
    {
        super(tag);
        this.bytes = bytes;
    }
}
