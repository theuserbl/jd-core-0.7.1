/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;


public class AttributeRuntimeParameterAnnotations
  extends Attribute
{
    public ParameterAnnotations[] parameter_annotations;

    public AttributeRuntimeParameterAnnotations(byte tag, int attribute_name_index, ParameterAnnotations[] parameter_annotations)
    {
        super(tag, attribute_name_index);
        this.parameter_annotations = parameter_annotations;
    }
}
