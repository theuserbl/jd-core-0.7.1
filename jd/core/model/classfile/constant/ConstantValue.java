/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.constant;

public abstract class ConstantValue
  extends Constant
{
    public ConstantValue(byte tag)
    {
        super(tag);
    }
}
