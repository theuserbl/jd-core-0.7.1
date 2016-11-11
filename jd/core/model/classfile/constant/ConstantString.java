/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.constant;

public class ConstantString
  extends ConstantValue
{
    public final int string_index;

    public ConstantString(byte tag, int string_index)
    {
        super(tag);
        this.string_index = string_index;
    }
}
