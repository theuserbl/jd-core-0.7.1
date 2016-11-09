/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;

import jd.core.model.classfile.LocalVariable;



public class AttributeLocalVariableTable
  extends Attribute
{
    public final LocalVariable[] local_variable_table;

    public AttributeLocalVariableTable(byte tag, int attribute_name_index, LocalVariable[] local_variable_table)
    {
        super(tag, attribute_name_index);
        this.local_variable_table = local_variable_table;
    }
}
