/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.instruction.bytecode.instruction;

import jd.core.model.classfile.ConstantPool;
import jd.core.model.classfile.LocalVariables;


public class AStore
  extends StoreInstruction
{
    public AStore(int opcode, int offset, int lineNumber, int index, Instruction objectref)
    {
        super(opcode, offset, lineNumber, index, null, objectref);
    }


    public String getReturnedSignature(ConstantPool constants, LocalVariables localVariables)
    {
        return this.valueref.getReturnedSignature(constants, localVariables);
    }
}
