/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;


public class AttributeSourceFile
  extends Attribute
{
    public final int sourcefile_index;

    public AttributeSourceFile(byte tag, int attribute_name_index, int sourcefile_index)
    {
        super(tag, attribute_name_index);
        this.sourcefile_index = sourcefile_index;
    }
}
