/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.instruction.bytecode.instruction;


public abstract class ArrayInstruction
  extends Instruction
{
    public Instruction arrayref;

    public ArrayInstruction(int opcode, int offset, int lineNumber, Instruction arrayref)
    {
        super(opcode, offset, lineNumber);
        this.arrayref = arrayref;
    }
}
