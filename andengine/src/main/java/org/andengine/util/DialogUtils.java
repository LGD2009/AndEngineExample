package org.andengine.util;

import android.app.Dialog;
import android.view.WindowManager;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 13:04:09 - 12.05.2011
 */
public class DialogUtils {

	public static void keepScreenOn(final Dialog pDialog) {
		pDialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	}
}
