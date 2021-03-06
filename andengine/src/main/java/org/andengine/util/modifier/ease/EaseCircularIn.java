package org.andengine.util.modifier.ease;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 *
 * @author Gil
 * @author Nicolas Gramlich
 * @since 16:52:11 - 26.07.2010
 */
public class EaseCircularIn implements IEaseFunction {


	private static EaseCircularIn INSTANCE;

	private EaseCircularIn() {

	}

	public static EaseCircularIn getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new EaseCircularIn();
		}
		return INSTANCE;
	}

	@Override
	public float getPercentage(final float pSecondsElapsed, final float pDuration) {
		return EaseCircularIn.getValue(pSecondsElapsed / pDuration);
	}

	public static float getValue(final float pPercentage) {
		return (float) -(Math.sqrt(1 - pPercentage * pPercentage) - 1.0f);
	}
}
