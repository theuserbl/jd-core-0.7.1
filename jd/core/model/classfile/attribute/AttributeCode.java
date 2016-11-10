/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;



public class AttributeCode
  extends Attribute
{
    public final byte[] code;


    public final CodeException[] exception_table;


    public final Attribute[] attributes;


    public AttributeCode(byte tag, int attribute_name_index, int max_stack, int max_locals, byte[] code, CodeException[] exception_table, Attribute[] attributes)
    {
        super(tag, attribute_name_index);


        this.code = code;
        this.exception_table = exception_table;
        this.attributes = attributes;
    }

    public AttributeNumberTable getAttributeLineNumberTable()
    {
        if (this.attributes != null) {
            for (int i = this.attributes.length - 1; i >= 0; i--)
                if (this.attributes[i].tag == AttributeConstants.ATTR_NUMBER_TABLE)
                    return (AttributeNumberTable)this.attributes[i];
        }
        return null;
    }

    public AttributeLocalVariableTable getAttributeLocalVariableTable()
    {
        if (this.attributes != null) {
            for (int i = this.attributes.length - 1; i >= 0; i--)
                if (this.attributes[i].tag == AttributeConstants.ATTR_LOCAL_VARIABLE_TABLE)
                    return (AttributeLocalVariableTable)this.attributes[i];
        }
        return null;
    }

    public AttributeLocalVariableTable getAttributeLocalVariableTypeTable()
    {
        if (this.attributes != null) {
            for (int i = this.attributes.length - 1; i >= 0; i--)
                if (this.attributes[i].tag == AttributeConstants.ATTR_LOCAL_VARIABLE_TYPE_TABLE)
                    return (AttributeLocalVariableTable)this.attributes[i];
        }
        return null;
    }
}
