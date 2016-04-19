package org.lirazs.gwtnumeral.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public class NumeralGwtLangEntryPoint implements EntryPoint {

	interface NumeralScripts extends ClientBundle {

		NumeralScripts instance = GWT.create(NumeralScripts.class);

		@Source("scripts/numeral+langs.min.js")
		TextResource numeral_langs_js();

	}

	static void loadNumeralJs() {
		String text = 
				NumeralScripts.instance.numeral_langs_js().getText();
		ScriptInjector.fromString(text).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

	@Override
	public void onModuleLoad() {
		loadNumeralJs();
	}
}
