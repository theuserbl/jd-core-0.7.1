/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.classfile;

import jd.core.model.classfile.attribute.Annotation;
import jd.core.model.classfile.attribute.Attribute;
import jd.core.model.classfile.attribute.AttributeRuntimeAnnotations;
import jd.core.model.classfile.attribute.AttributeSignature;
import jd.core.model.classfile.attribute.AttributeConstants;


public class Base
{
    public int access_flags;
    public final Attribute[] attributes;

    public Base(int access_flags, Attribute[] attributes)
    {
        this.access_flags = access_flags;
        this.attributes = attributes;
    }

    public AttributeSignature getAttributeSignature()
    {
        if (this.attributes != null)
        {
            for (int i = this.attributes.length - 1; i >= 0; i--) {
                if (this.attributes[i].tag == AttributeConstants.ATTR_SIGNATURE)
                    return (AttributeSignature)this.attributes[i];
            }
        }
        return null;
    }

    public boolean containsAttributeDeprecated()
    {
        if (this.attributes != null)
        {
            for (int i = this.attributes.length - 1; i >= 0; i--) {
                if (this.attributes[i].tag == AttributeConstants.ATTR_DEPRECATED)
                    return true;
            }
        }
        return false;
    }

    public boolean containsAnnotationDeprecated(ClassFile classFile)
    {
        if (this.attributes != null)
        {
            for (int i = this.attributes.length - 1; i >= 0; i--)
            {
                switch (this.attributes[i].tag)
                {

                    case AttributeConstants.ATTR_RUNTIME_VISIBLE_ANNOTATIONS:
                    case AttributeConstants.ATTR_RUNTIME_INVISIBLE_ANNOTATIONS:
                        Annotation[] annotations = 
                          ((AttributeRuntimeAnnotations)this.attributes[i]).annotations;
                        if (containsAnnotationDeprecated(classFile, annotations)) {
                            return true;
                        }
                        break;
                }

            }
        }
        return false;
    }


    private boolean containsAnnotationDeprecated(ClassFile classFile, Annotation[] annotations)
    {
        if (annotations != null)
        {
            int idsIndex = 
              classFile.getConstantPool().internalDeprecatedSignatureIndex;

            for (int i = annotations.length - 1; i >= 0; i--) {
                if (idsIndex == annotations[i].type_index)
                    return true;
            }
        }
        return false;
    }
}
