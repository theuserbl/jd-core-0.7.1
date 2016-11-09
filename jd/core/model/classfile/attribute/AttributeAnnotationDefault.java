/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;


public class AttributeAnnotationDefault
  extends Attribute
{
    public final ElementValue default_value;


    public AttributeAnnotationDefault(byte tag, int attribute_name_index, ElementValue default_value)
    {
        super(tag, attribute_name_index);
        this.default_value = default_value;
    }
}
