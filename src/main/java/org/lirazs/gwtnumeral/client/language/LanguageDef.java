package org.lirazs.gwtnumeral.client.language;

import com.google.gwt.core.client.JavaScriptObject;

// load a language
/*numeral.language('fr', {
    delimiters: {
        thousands: ' ',
        decimal: ','
    },
    abbreviations: {
        thousand: 'k',
                million: 'm',
                billion: 'b',
                trillion: 't'
    },
    ordinal : function (number) {
        return number === 1 ? 'er' : 'ème';
    },
    currency: {
        symbol: '€'
    }
});*/
public class LanguageDef extends JavaScriptObject {

    protected LanguageDef() {}

    public static native LanguageDef create() /*-{
        return {};
    }-*/;

    public static native LanguageDef create(Delimiters delimiters) /*-{
        return {
            delimiters : delimiters
        };
    }-*/;


    public static native LanguageDef create(Delimiters delimiters, Abbreviations abbreviations) /*-{
        return {
            delimiters : delimiters,
            abbreviations : abbreviations
        };
    }-*/;

    public final native Delimiters getDelimiters() /*-{
        return this.delimiters;
    }-*/;

    public final native Abbreviations getAbbreviations() /*-{
        return this.abbreviations;
    }-*/;
}
