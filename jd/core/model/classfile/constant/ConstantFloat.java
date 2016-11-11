/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.constant;

public class ConstantFloat
  extends ConstantValue
{
    public final float bytes;

    public ConstantFloat(byte tag, float bytes)
    {
        super(tag);
        this.bytes = bytes;
    }
}
