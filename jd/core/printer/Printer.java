/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */
 
package jd.core.printer;

public abstract interface Printer
{
    public static final int UNKNOWN_LINE_NUMBER = 0;

    public abstract void print(byte paramByte);

    public abstract void print(char paramChar);

    public abstract void print(int paramInt);

    public abstract void print(String paramString);

    public abstract void printNumeric(String paramString);

    public abstract void printString(String paramString1, String paramString2);

    public abstract void printKeyword(String paramString);

    public abstract void printJavaWord(String paramString);

    public abstract void printType(String paramString1, String paramString2, String paramString3);

    public abstract void printTypeDeclaration(String paramString1, String paramString2);

    public abstract void printTypeImport(String paramString1, String paramString2);

    public abstract void printField(String paramString1, String paramString2, String paramString3, String paramString4);

    public abstract void printFieldDeclaration(String paramString1, String paramString2, String paramString3);

    public abstract void printStaticField(String paramString1, String paramString2, String paramString3, String paramString4);

    public abstract void printStaticFieldDeclaration(String paramString1, String paramString2, String paramString3);

    public abstract void printConstructor(String paramString1, String paramString2, String paramString3, String paramString4);

    public abstract void printConstructorDeclaration(String paramString1, String paramString2, String paramString3);

    public abstract void printStaticConstructorDeclaration(String paramString1, String paramString2);

    public abstract void printMethod(String paramString1, String paramString2, String paramString3, String paramString4);

    public abstract void printMethodDeclaration(String paramString1, String paramString2, String paramString3);

    public abstract void printStaticMethod(String paramString1, String paramString2, String paramString3, String paramString4);

    public abstract void printStaticMethodDeclaration(String paramString1, String paramString2, String paramString3);

    public abstract void start(int paramInt1, int paramInt2, int paramInt3);

    public abstract void end();

    public abstract void indent();

    public abstract void desindent();

    public abstract void startOfLine(int paramInt);

    public abstract void endOfLine();

    public abstract void extraLine(int paramInt);

    public abstract void startOfComment();

    public abstract void endOfComment();

    public abstract void startOfJavadoc();

    public abstract void endOfJavadoc();

    public abstract void startOfXdoclet();

    public abstract void endOfXdoclet();

    public abstract void startOfError();

    public abstract void endOfError();

    public abstract void startOfImportStatements();

    public abstract void endOfImportStatements();

    public abstract void startOfTypeDeclaration(String paramString);

    public abstract void endOfTypeDeclaration();

    public abstract void startOfAnnotationName();

    public abstract void endOfAnnotationName();

    public abstract void startOfOptionalPrefix();

    public abstract void endOfOptionalPrefix();

    public abstract void debugStartOfLayoutBlock();

    public abstract void debugEndOfLayoutBlock();

    public abstract void debugStartOfSeparatorLayoutBlock();

    public abstract void debugEndOfSeparatorLayoutBlock(int paramInt1, int paramInt2, int paramInt3);

    public abstract void debugStartOfStatementsBlockLayoutBlock();

    public abstract void debugEndOfStatementsBlockLayoutBlock(int paramInt1, int paramInt2, int paramInt3);

    public abstract void debugStartOfInstructionBlockLayoutBlock();

    public abstract void debugEndOfInstructionBlockLayoutBlock();

    public abstract void debugStartOfCommentDeprecatedLayoutBlock();

    public abstract void debugEndOfCommentDeprecatedLayoutBlock();

    public abstract void debugMarker(String paramString);

    public abstract void debugStartOfCaseBlockLayoutBlock();

    public abstract void debugEndOfCaseBlockLayoutBlock();
}
