/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.constant;

public class ConstantClass
  extends Constant
{
    public final int name_index;

    public ConstantClass(byte tag, int name_index)
    {
        super(tag);
        this.name_index = name_index;
    }
}
