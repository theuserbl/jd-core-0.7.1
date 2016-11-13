/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.process.deserializer;

import java.io.DataInput;
import java.io.IOException;
import jd.core.model.classfile.attribute.Annotation;
import jd.core.model.classfile.attribute.ElementValue;
import jd.core.model.classfile.attribute.ElementValueAnnotationValue;
import jd.core.model.classfile.attribute.ElementValueArrayValue;
import jd.core.model.classfile.attribute.ElementValueClassInfo;
import jd.core.model.classfile.attribute.ElementValueEnumConstValue;
import jd.core.model.classfile.attribute.ElementValuePair;
import jd.core.model.classfile.attribute.ElementValuePrimitiveType;




public class AnnotationDeserializer
{
    public static Annotation[] Deserialize(DataInput di)
      throws IOException
    {
        int num_annotations = di.readUnsignedShort();
        if (num_annotations == 0) {
            return null;
        }
        Annotation[] annotations = new Annotation[num_annotations];

        for (int i = 0; i < num_annotations; i++) {
            annotations[i] = new Annotation(
              di.readUnsignedShort(), 
              DeserializeElementValuePairs(di));
        }
        return annotations;
    }

    private static ElementValuePair[] DeserializeElementValuePairs(DataInput di)
      throws IOException
    {
        int num_element_value_pairs = di.readUnsignedShort();
        if (num_element_value_pairs == 0) {
            return null;
        }
        ElementValuePair[] pairs = new ElementValuePair[num_element_value_pairs];

        for (int i = 0; i < num_element_value_pairs; i++) {
            pairs[i] = new ElementValuePair(
              di.readUnsignedShort(), 
              DeserializeElementValue(di));
        }
        return pairs;
    }

    public static ElementValue DeserializeElementValue(DataInput di)
      throws IOException
    {
        byte type = di.readByte();

        switch (type) {
            case 66: case 67: case 68: 
            case 70: case 73: 
            case 74: case 83: 
            case 90: case 115: 
                return new ElementValuePrimitiveType(
                  (byte)1, type, 
                  di.readUnsignedShort());
            case 101: 
                return new ElementValueEnumConstValue(
                  (byte)2, 
                  di.readUnsignedShort(), 
                  di.readUnsignedShort());
            case 99: 
                return new ElementValueClassInfo(
                  (byte)3, 
                  di.readUnsignedShort());
            case 64: 
                return new ElementValueAnnotationValue(
                  (byte)4, 
                  new Annotation(di.readUnsignedShort(), 
                  DeserializeElementValuePairs(di)));
            case 91: 
                return new ElementValueArrayValue(
                  (byte)5, 
                  DeserializeElementValues(di));
        }
        throw new ClassFormatException("Invalid element value type: " + type);
    }


    private static ElementValue[] DeserializeElementValues(DataInput di)
      throws IOException
    {
        int num_values = di.readUnsignedShort();
        if (num_values == 0) {
            return null;
        }
        ElementValue[] values = new ElementValue[num_values];

        for (int i = 0; i < num_values; i++) {
            values[i] = DeserializeElementValue(di);
        }
        return values;
    }
}
