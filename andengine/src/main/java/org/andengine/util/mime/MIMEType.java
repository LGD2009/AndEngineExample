package org.andengine.util.mime;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 14:58:20 - 10.01.2011
 */
public enum MIMEType {
	// ===========================================================
	// Elements
	// ===========================================================

	JPEG("image/jpeg"),
	GIF("image/gif"),
	PNG("image/png");


	
	private final String mTypeString;

	private MIMEType(final String pTypeString) {
		this.mTypeString = pTypeString;
	}

	public String getTypeString() {
		return this.mTypeString;
	}
}
