/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;

public class ElementValueArrayValue
  extends ElementValue
{
    public final ElementValue[] values;

    public ElementValueArrayValue(byte tag, ElementValue[] values)
    {
        super(tag);
        this.values = values;
    }
}
