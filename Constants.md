#Files with constands and where they are used and how.

The reason is, that a decompiler can not "see", if constants are used from constant-files or if there was a pure number used.

AccessorConstants <br/>
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/model/classfile/accessor/AccessorConstants.java

AttributeConstants <br/>
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/model/classfile/attribute/AttributeConstants.java <br/>
used in <br/>
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/model/classfile/Base.java <br/>
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/model/classfile/attribute/AttributeCode.java <br/>
used as <br/>
 if (this.attributes[i].tag == AttributeConstants.ATTR_NUMBER_TABLE)

ClassFileConstants <br/>
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/model/classfile/ClassFileConstants.java

ConstantConstant <br/>
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/model/classfile/constant/ConstantConstant.java

CoreConstants <br/>
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/CoreConstants.java

ElementValueContants <br/>
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/model/classfile/attribute/ElementValueContants.java

UtilConstants <br/>
https://github.com/theuserbl/jd-core-0.7.1/blob/master/jd/core/util/UtilConstants.java
