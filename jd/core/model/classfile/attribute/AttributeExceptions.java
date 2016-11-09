/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;


public class AttributeExceptions
  extends Attribute
{
    public final int[] exception_index_table;


    public AttributeExceptions(byte tag, int attribute_name_index, int[] exception_index_table)
    {
        super(tag, attribute_name_index);
        this.exception_index_table = exception_index_table;
    }
}
