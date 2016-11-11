/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.constant;


public class ConstantFieldref
  extends Constant
{
    public final int class_index;

    public final int name_and_type_index;

    public ConstantFieldref(byte tag, int class_index, int name_and_type_index)
    {
        super(tag);
        this.class_index = class_index;
        this.name_and_type_index = name_and_type_index;
    }
}
