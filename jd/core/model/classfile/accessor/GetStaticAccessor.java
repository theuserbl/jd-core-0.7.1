/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.accessor;


public class GetStaticAccessor
  extends Accessor
{
    public final String className;
    public final String fieldName;
    public final String fieldDescriptor;

    public GetStaticAccessor(byte tag, String className, String fieldName, String fieldDescriptor)
    {
        super(tag);
        this.className = className;
        this.fieldName = fieldName;
        this.fieldDescriptor = fieldDescriptor;
    }
}
