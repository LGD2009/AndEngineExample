package org.andengine.extension.tmx.util.exception;

import org.xml.sax.SAXException;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 18:37:46 - 08.08.2010
 */
public class TSXParseException extends SAXException {


	private static final long serialVersionUID = -7598783248970268198L;

	public TSXParseException() {
		super();
	}

	public TSXParseException(final String pDetailMessage) {
		super(pDetailMessage);
	}

	public TSXParseException(final Exception pException) {
		super(pException);
	}

	public TSXParseException(final String pMessage, final Exception pException) {
		super(pMessage, pException);
	}
}
