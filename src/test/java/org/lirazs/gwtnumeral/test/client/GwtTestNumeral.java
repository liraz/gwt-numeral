package org.lirazs.gwtnumeral.test.client;

import com.google.gwt.junit.client.GWTTestCase;
import org.lirazs.gwtnumeral.client.Numeral;
import org.lirazs.gwtnumeral.client.NumeralGwtLangEntryPoint;

/**
 * Created on 23/10/2015.
 */
public class GwtTestNumeral extends GWTTestCase {

    public String getModuleName() {
        return "org.lirazs.gwtnumeral.test.NumeralGwtTest";
    }

    public void gwtSetUp() {
        new NumeralGwtLangEntryPoint().onModuleLoad();
    }

    public void gwtTearDown() {
    }

    public void testDefault() {
        Numeral.defaultFormat("0,0");
        assertEquals("10,000", Numeral.numeral(10000).format());
    }
}
