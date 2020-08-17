package org.andengine.util.modifier.ease;

import static org.andengine.util.math.MathConstants.PI;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 *
 * @author Gil
 * @author Nicolas Gramlich
 * @since 16:52:11 - 26.07.2010
 */
public class EaseSineInOut implements IEaseFunction {


	private static EaseSineInOut INSTANCE;

	private EaseSineInOut() {

	}

	public static EaseSineInOut getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new EaseSineInOut();
		}
		return INSTANCE;
	}

	@Override
	public float getPercentage(final float pSecondsElapsed, final float pDuration) {
		final float percentage = pSecondsElapsed / pDuration;

		return (float) (-0.5f * (Math.cos(percentage * PI) - 1));
	}
}
