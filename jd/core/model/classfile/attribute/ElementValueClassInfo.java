/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;

public class ElementValueClassInfo
  extends ElementValue
{
    public final int class_info_index;

    public ElementValueClassInfo(byte tag, int class_info_index)
    {
        super(tag);
        this.class_info_index = class_info_index;
    }
}
