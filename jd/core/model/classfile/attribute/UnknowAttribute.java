/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;

public class UnknowAttribute
  extends Attribute
{
    public UnknowAttribute(byte tag, int attribute_name_index)
    {
        super(tag, attribute_name_index);
    }
}
