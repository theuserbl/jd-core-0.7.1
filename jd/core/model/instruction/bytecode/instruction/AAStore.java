/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.model.instruction.bytecode.instruction;

import jd.core.model.classfile.ConstantPool;
import jd.core.model.classfile.LocalVariables;


public class AAStore
  extends ArrayStoreInstruction
{
    public AAStore(int opcode, int offset, int lineNumber, Instruction arrayref, Instruction indexref, Instruction objectref)
    {
        super(opcode, offset, lineNumber, arrayref, indexref, null, objectref);
    }


    public String getReturnedSignature(ConstantPool constants, LocalVariables localVariables)
    {
        String signature = 
          this.arrayref.getReturnedSignature(constants, localVariables);

        if ((signature == null) || (signature.length() == 0) || 
          (signature.charAt(0) != '[')) {
            return null;
        }
        return signature.substring(1);
    }
}
