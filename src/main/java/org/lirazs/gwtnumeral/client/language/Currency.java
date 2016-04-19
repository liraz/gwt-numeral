package org.lirazs.gwtnumeral.client.language;

import com.google.gwt.core.client.JavaScriptObject;

/**
 currency: {
    symbol: '€'
 }
 */
public class Currency extends JavaScriptObject {

    protected Currency() {}

    public final native String getSymbol() /*-{
        return this.symbol;
    }-*/;

    public static native Currency create(char symbol) /*-{
        return {symbol: symbol};
    }-*/;
}
