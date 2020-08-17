package org.andengine.util.modifier.ease;

import org.andengine.util.math.MathConstants;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 *
 * @author Gil
 * @author Nicolas Gramlich
 * @since 16:52:11 - 26.07.2010
 */
public class EaseSineOut implements IEaseFunction {


	private static EaseSineOut INSTANCE;

	private EaseSineOut() {

	}

	public static EaseSineOut getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new EaseSineOut();
		}
		return INSTANCE;
	}

	@Override
	public float getPercentage(final float pSecondsElapsed, final float pDuration) {
		return EaseSineOut.getValue(pSecondsElapsed / pDuration);
	}

	public static float getValue(final float pPercentage) {
		return (float) Math.sin(pPercentage * MathConstants.PI_HALF);
	}
}
