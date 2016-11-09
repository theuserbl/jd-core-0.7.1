/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;


public class ParameterAnnotations
{
    public Annotation[] annotations;

    public ParameterAnnotations(Annotation[] annotations)
    {
        this.annotations = annotations;
    }
}
