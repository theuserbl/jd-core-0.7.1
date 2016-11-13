#Files with constands and where they are used and how.

The reason is, that a decompiler can not "see", if constants are used from constant-files or if there was a pure number used.

AccessorConstants
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/model/classfile/accessor/AccessorConstants.java

AttributeConstants
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/model/classfile/attribute/AttributeConstants.java
used in
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/model/classfile/Base.java
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/model/classfile/attribute/AttributeCode.java
used as
 if (this.attributes[i].tag == AttributeConstants.ATTR_NUMBER_TABLE)

ClassFileConstants
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/model/classfile/ClassFileConstants.java

ConstantConstant
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/model/classfile/constant/ConstantConstant.java

CoreConstants
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/CoreConstants.java

ElementValueContants
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/model/classfile/attribute/ElementValueContants.java

UtilConstants
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/util/UtilConstants.java
