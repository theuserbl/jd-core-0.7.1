/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;


public class AttributeNumberTable
  extends Attribute
{
    public final LineNumber[] line_number_table;

    public AttributeNumberTable(byte tag, int attribute_name_index, LineNumber[] line_number_table)
    {
        super(tag, attribute_name_index);
        this.line_number_table = line_number_table;
    }
}
