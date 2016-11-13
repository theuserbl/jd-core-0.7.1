/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.instruction.bytecode.instruction;

import jd.core.model.classfile.ConstantPool;
import jd.core.model.classfile.LocalVariables;


public class AThrow
  extends Instruction
    {
    public Instruction value;

    public AThrow(int opcode, int offset, int lineNumber, Instruction value)
    {
        super(opcode, offset, lineNumber);
        this.value = value;
    }


    public String getReturnedSignature(ConstantPool constants, LocalVariables localVariables)
    {
        return this.value.getReturnedSignature(constants, localVariables);
    }
}
