/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;

public class Attribute
{
    public final byte tag;
    public final int attribute_name_index;

    public Attribute(byte tag, int attribute_name_index)
    {
        this.tag = tag;
        this.attribute_name_index = attribute_name_index;
    }
}
