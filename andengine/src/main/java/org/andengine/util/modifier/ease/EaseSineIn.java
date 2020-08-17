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
public class EaseSineIn implements IEaseFunction {


	private static EaseSineIn INSTANCE;

	private EaseSineIn() {

	}

	public static EaseSineIn getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new EaseSineIn();
		}
		return INSTANCE;
	}

	@Override
	public float getPercentage(final float pSecondsElapsed, final float pDuration) {
		return EaseSineIn.getValue(pSecondsElapsed / pDuration);
	}

	public static float getValue(final float pPercentage) {
		return (float) (-Math.cos(pPercentage * MathConstants.PI_HALF) + 1);
	}
}
