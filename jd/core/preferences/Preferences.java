/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.core.preferences;


public class Preferences
{
    protected boolean showDefaultConstructor;
    protected boolean realignmentLineNumber;

    public Preferences()
    {
        this.showDefaultConstructor = false;
        this.realignmentLineNumber = true;
    }

    public Preferences(boolean showDefaultConstructor, boolean realignmentLineNumber)
    {

        this.showDefaultConstructor = showDefaultConstructor;
        this.realignmentLineNumber = realignmentLineNumber;
    }

    public boolean getShowDefaultConstructor()
    {
        return this.showDefaultConstructor;
    }

    public boolean getRealignmentLineNumber()
    {
        return this.realignmentLineNumber;
    }
}
