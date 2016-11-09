/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;


public class AttributeInnerClasses
  extends Attribute
{
    public final InnerClass[] classes;


    public AttributeInnerClasses(byte tag, int attribute_name_index, InnerClass[] classes)
    {
        super(tag, attribute_name_index);
        this.classes = classes;
    }
}
