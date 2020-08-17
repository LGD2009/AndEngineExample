package org.andengine.extension.tmx;

import org.andengine.extension.tmx.util.constants.TMXConstants;
import org.xml.sax.Attributes;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 10:14:06 - 27.07.2010
 */
public class TMXProperty implements TMXConstants {


	private final String mName;
	private final String mValue;

	public TMXProperty(final Attributes pAttributes) {
		this.mName = pAttributes.getValue("", TMXConstants.TAG_PROPERTY_ATTRIBUTE_NAME);
		this.mValue = pAttributes.getValue("", TMXConstants.TAG_PROPERTY_ATTRIBUTE_VALUE);
	}

	public String getName() {
		return this.mName;
	}

	public String getValue() {
		return this.mValue;
	}

	@Override
	public String toString() {
		return this.mName + "='" + this.mValue + "'";
	}
}
