# jd-core-0.7.1
Inofficial recreation of jd-core 0.7.1

The original JD-GUI https://github.com/java-decompiler/jd-gui includes the jd-core, which exists as additional file https://github.com/java-decompiler/mvn-repo/blob/master/jd/jd-core/0.7.1/jd-core-0.7.1.jar
Like JD-GUI, the JD-Core is licensed under the GPLv3 https://github.com/java-decompiler/jd-gui/blob/master/NOTICE
But unlike JD-GUI, the source code is not published. But the author said, it is allowed to decompile it.
For more info also look at https://github.com/java-decompiler/jd-gui/issues/106

JD-Core was compiled with the eclipse compiler ecj. To see, if it was recreated right, it is helpful to see, if the created binary of the source is binary-identical to the original classes.

So, to compile write
*java -jar ecj-3.7.jar -5 -g [source-file]*
with this options, it creates the same binary files.

If you become an error in the form "*The type java.io.ObjectInputStream cannot be resolved. It is indirectly referenc
ed from required .class files*", then be sure you don't use Java 8 or newer for compilation with this ecj. Use Java 6 or so.

If it still differ, it have the reason, that I have added the JD-GUI copyright-header in all files. If you delete it and compile it then, then it will be the same binary like the original.
