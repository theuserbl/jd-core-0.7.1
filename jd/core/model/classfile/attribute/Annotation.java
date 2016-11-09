/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile.attribute;


public class Annotation
{
    public final int type_index;
    public final ElementValuePair[] elementValuePairs;

    public Annotation(int type_index, ElementValuePair[] elementValuePairs)
    {
        this.type_index = type_index;
        this.elementValuePairs = elementValuePairs;
    }
}
