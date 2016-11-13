/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.instruction.bytecode.instruction;

import jd.core.model.classfile.ConstantPool;
import jd.core.model.classfile.LocalVariables;

public class AConstNull extends Instruction
{
    public AConstNull(int opcode, int offset, int lineNumber)
    {
        super(opcode, offset, lineNumber);
    }


    public String getReturnedSignature(ConstantPool constants, LocalVariables localVariables)
    {
        return null;
    }
}
