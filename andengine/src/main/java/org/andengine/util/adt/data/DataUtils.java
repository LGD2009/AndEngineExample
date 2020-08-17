package org.andengine.util.adt.data;



/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 15:01:49 - 20.03.2011
 */
public final class DataUtils {

	public static final int unsignedByteToInt(final byte pByte) {
		return pByte & 0xFF;
	}
}
