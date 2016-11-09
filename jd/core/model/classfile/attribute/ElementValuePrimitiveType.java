/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;


public class ElementValuePrimitiveType
  extends ElementValue
{
    public byte type;

    public final int const_value_index;


    public ElementValuePrimitiveType(byte tag, byte type, int const_value_index)
    {
        super(tag);
        this.type = type;
        this.const_value_index = const_value_index;
    }
}
