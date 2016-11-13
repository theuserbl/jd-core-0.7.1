/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.instruction.bytecode.instruction;

import jd.core.model.classfile.ConstantPool;
import jd.core.model.classfile.LocalVariables;



public class AssertInstruction
  extends Instruction
{
    public Instruction test;
    public Instruction msg;

    public AssertInstruction(int opcode, int offset, int lineNumber, Instruction test, Instruction msg)
    {
        super(opcode, offset, lineNumber);
        this.test = test;
        this.msg = msg;
    }


    public String getReturnedSignature(ConstantPool constants, LocalVariables localVariables)
    {
        return null;
    }
}
