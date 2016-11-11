/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.constant;

public class ConstantUtf8
  extends Constant
{
    public String bytes;

    public ConstantUtf8(byte tag, String bytes)
    {
        super(tag);
        this.bytes = bytes;
    }
}
