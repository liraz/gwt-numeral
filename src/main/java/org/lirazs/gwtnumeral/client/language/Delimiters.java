package org.lirazs.gwtnumeral.client.language;

import com.google.gwt.core.client.JavaScriptObject;

/**
 delimiters: {
     thousands: ' ',
     decimal: ','
 }
 */
public class Delimiters extends JavaScriptObject {

    protected Delimiters() {}

    public final native String getThousands() /*-{
        return this.thousands;
    }-*/;

    public final native String getDecimal() /*-{
        return this.decimal;
    }-*/;

    public static native Delimiters create(String thousands, String decimal) /*-{
        return {thousands: thousands, decimal: decimal};
    }-*/;
}
