package org.lirazs.gwtnumeral.client.language;


import com.google.gwt.core.client.JavaScriptObject;

/**
 abbreviations: {
     thousand: 'k',
     million: 'm',
     billion: 'b',
     trillion: 't'
 },
 */
public class Abbreviations extends JavaScriptObject {

    protected Abbreviations() {}

    public static native Abbreviations create(char thousand, char million, char billion, char trillion) /*-{
        return {thousand: thousand, million: million, billion: billion, trillion: trillion};
    }-*/;
}
