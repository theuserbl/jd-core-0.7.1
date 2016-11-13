/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.instruction.bytecode.instruction;

import java.util.List;
import jd.core.model.classfile.ConstantPool;
import jd.core.model.classfile.LocalVariables;





public class ComplexConditionalBranchInstruction
  extends ConditionalBranchInstruction
{
    public List<Instruction> instructions;

    public ComplexConditionalBranchInstruction(int opcode, int offset, int lineNumber, int cmp, List<Instruction> instructions, int branch)
    {
        super(opcode, offset, lineNumber, cmp, branch);
        this.instructions = instructions;
    }


    public String getReturnedSignature(ConstantPool constants, LocalVariables localVariables)
    {
        return null;
    }

    public int getPriority()
    {
        return this.cmp == 0 ? 12 : 13;
    }
}
