package org.lirazs.gwtnumeral.client;

import com.google.gwt.core.client.JavaScriptObject;
import org.lirazs.gwtnumeral.client.language.LanguageDef;

/**
 * this is the numeral instance - this is, the object that it's returned from js numeral().
 * It also contains static methods for calling the numeral() function.
 * Note, javadocs copied & compressed from numeraljs.com site
 *
 * @author Liraz
 */
public class Numeral extends JavaScriptObject {

    protected Numeral() {}

    /**
     *
     * @return
     */
    public static final native Numeral numeral()/*-{
        return $wnd.numeral();
    }-*/;

    /**
     *
     * @param number
     * @return
     */
    public static final native Numeral numeral(double number)/*-{
        return $wnd.numeral(number);
    }-*/;

    /**
     *
     * @param number
     * @return
     */
    public static final native Numeral numeral(float number)/*-{
        return $wnd.numeral(number);
    }-*/;

    /**
     *
     * @param number
     * @return
     */
    public static final native Numeral numeral(int number)/*-{
        return $wnd.numeral(number);
    }-*/;

    /**
     *
     * @param format
     */
    public static final native void defaultFormat(String format)/*-{
        $wnd.numeral.defaultFormat(format);
    }-*/;

    /**
     * switch between languages
     *
     * @param langId
     */
    public static final native void language(String langId)/*-{
        $wnd.numeral.language(langId);
    }-*/;
    public static final native String language()/*-{
        return $wnd.numeral.language();
    }-*/;

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
    public static final native void language(String langId, LanguageDef langDef)/*-{
        $wnd.numeral.language(langId, langDef);
    }-*/;

    /**
     *
     * @param format
     * @return
     */
    public static final native void zeroFormat(String format)/*-{
        $wnd.numeral.zeroFormat(format);
    }-*/;

    /**
     * Go ahead and clone any numeral object while you're at it.
     *
     * @return
     */
    public native final Numeral clone() /*-{
        return this["clone"]();
    }-*/;

    /**
     *
     * @param format
     * @return
     */
    public native final String format(String format) /*-{
        return this["format"](format);
    }-*/;

    /**
     *
     * @return
     */
    public native final String format() /*-{
        return this["format"]();
    }-*/;

    /**
     *
     * @param format
     * @return
     */
    public native final String unformat(String format) /*-{
        return this["unformat"](format);
    }-*/;

    /**
     *
     * @param format
     * @return
     */
    public native final int unformatInt(String format) /*-{
        return this["unformat"](format);
    }-*/;

    /**
     *
     * @param format
     * @return
     */
    public native final double unformatDouble(String format) /*-{
        return this["unformat"](format);
    }-*/;

    /**
     *
     * @param format
     * @return
     */
    public native final float unformatFloat(String format) /*-{
        return this["unformat"](format);
    }-*/;


    public native final int add(int addition) /*-{
        return this["add"](addition);
    }-*/;
    public native final double add(double addition) /*-{
        return this["add"](addition);
    }-*/;
    public native final float add(float addition) /*-{
        return this["add"](addition);
    }-*/;


    public native final int subtract(int subtraction) /*-{
        return this["subtract"](subtraction);
    }-*/;
    public native final double subtract(double subtraction) /*-{
        return this["subtract"](subtraction);
    }-*/;
    public native final float subtract(float subtraction) /*-{
        return this["subtract"](subtraction);
    }-*/;


    public native final int multiply(int multiplication) /*-{
        return this["multiply"](multiplication);
    }-*/;
    public native final double multiply(double multiplication) /*-{
        return this["multiply"](multiplication);
    }-*/;
    public native final float multiply(float multiplication) /*-{
        return this["multiply"](multiplication);
    }-*/;


    public native final int divide(int division) /*-{
        return this["divide"](division);
    }-*/;
    public native final double divide(double division) /*-{
        return this["divide"](division);
    }-*/;
    public native final float divide(float division) /*-{
        return this["divide"](division);
    }-*/;

    public native final int value() /*-{
        return this["value"]();
    }-*/;
    public native final double valueDouble() /*-{
        return this["value"]();
    }-*/;
    public native final float valueFloat() /*-{
        return this["value"]();
    }-*/;

    public native final void set(int value) /*-{
        this["set"](value);
    }-*/;
    public native final void set(double value) /*-{
        this["set"](value);
    }-*/;
    public native final void set(float value) /*-{
        this["set"](value);
    }-*/;


    public native final int difference(int value) /*-{
        return this["difference"](value);
    }-*/;
    public native final double difference(double value) /*-{
        return this["difference"](value);
    }-*/;
    public native final float difference(float value) /*-{
        return this["difference"](value);
    }-*/;
}
