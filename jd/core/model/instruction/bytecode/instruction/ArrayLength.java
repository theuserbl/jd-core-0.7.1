/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.instruction.bytecode.instruction;

import jd.core.model.classfile.ConstantPool;
import jd.core.model.classfile.LocalVariables;


public class ArrayLength
  extends ArrayInstruction
{
    public ArrayLength(int opcode, int offset, int lineNumber, Instruction arrayref)
    {
        super(opcode, offset, lineNumber, arrayref);
    }


    public String getReturnedSignature(ConstantPool constants, LocalVariables localVariables)
    {
        return "I";
    }
}
