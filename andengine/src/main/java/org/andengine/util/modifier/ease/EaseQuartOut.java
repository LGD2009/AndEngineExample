package org.andengine.util.modifier.ease;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 *
 * @author Gil
 * @author Nicolas Gramlich
 * @since 16:52:11 - 26.07.2010
 */
public class EaseQuartOut implements IEaseFunction {


	private static EaseQuartOut INSTANCE;

	private EaseQuartOut() {

	}

	public static EaseQuartOut getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new EaseQuartOut();
		}
		return INSTANCE;
	}

	@Override
	public float getPercentage(final float pSecondsElapsed, final float pDuration) {
		return EaseQuartOut.getValue(pSecondsElapsed / pDuration);
	}

	public static float getValue(final float pPercentage) {
		final float t = pPercentage - 1;
		return 1 - (t * t * t * t);
	}
}
