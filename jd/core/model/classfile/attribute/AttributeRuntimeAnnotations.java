/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;


public class AttributeRuntimeAnnotations
  extends Attribute
{
    public final Annotation[] annotations;


    public AttributeRuntimeAnnotations(byte tag, int attribute_name_index, Annotation[] annotations)
    {
        super(tag, attribute_name_index);
        this.annotations = annotations;
    }
}
