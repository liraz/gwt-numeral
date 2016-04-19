package org.lirazs.gwtnumeral.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public class NumeralGwtEntryPoint implements EntryPoint {

	interface NumeralScripts extends ClientBundle {
		NumeralScripts instance = GWT.create(NumeralScripts.class);

		@Source("scripts/numeral.min.js")
		TextResource numeraljs();
	}

	static void loadNumeralJs() {
		String text = 
				NumeralScripts.instance.numeraljs().getText();
		ScriptInjector.fromString(text).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

	@Override
	public void onModuleLoad() {
		loadNumeralJs();
	}
}
