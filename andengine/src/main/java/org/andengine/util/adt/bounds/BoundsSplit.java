package org.andengine.util.adt.bounds;

import org.andengine.util.exception.AndEngineRuntimeException;

/**
 * (c) Zynga 2011
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 21:13:32 - 11.10.2011
 */
public enum BoundsSplit {
	// ===========================================================
	// Elements
	// ===========================================================

	TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT;

	public static class BoundsSplitException extends AndEngineRuntimeException {


		private static final long serialVersionUID = 7970869239897412727L;
	}
}

