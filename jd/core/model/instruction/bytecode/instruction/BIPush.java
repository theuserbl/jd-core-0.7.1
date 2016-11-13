/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.instruction.bytecode.instruction;

public class BIPush
  extends IConst
{
    public BIPush(int opcode, int offset, int lineNumber, int value)
    {
        super(opcode, offset, lineNumber, value);
    }
}
