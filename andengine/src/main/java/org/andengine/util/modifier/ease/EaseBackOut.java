package org.andengine.util.modifier.ease;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 *
 * @author Gil
 * @author Nicolas Gramlich
 * @since 16:52:11 - 26.07.2010
 */
public class EaseBackOut implements IEaseFunction {


	private static EaseBackOut INSTANCE;

	private EaseBackOut() {

	}

	public static EaseBackOut getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new EaseBackOut();
		}
		return INSTANCE;
	}

	@Override
	public float getPercentage(final float pSecondsElapsed, final float pDuration) {
		return EaseBackOut.getValue(pSecondsElapsed / pDuration);
	}

	public static float getValue(final float pPercentage) {
		final float t = pPercentage - 1;
		return 1 + t * t * ((1.70158f + 1) * t + 1.70158f);
	}
}
