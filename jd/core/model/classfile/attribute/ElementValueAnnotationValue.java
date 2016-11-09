/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;

public class ElementValueAnnotationValue
  extends ElementValue
{
    public final Annotation annotation_value;

    public ElementValueAnnotationValue(byte tag, Annotation annotation_value)
    {
        super(tag);
        this.annotation_value = annotation_value;
    }
}
