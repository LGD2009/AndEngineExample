package org.andengine.util.modifier.ease;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 *
 * @author Gil
 * @author Nicolas Gramlich
 * @since 16:52:11 - 26.07.2010
 */
public class EaseExponentialIn implements IEaseFunction {


	private static EaseExponentialIn INSTANCE;

	private EaseExponentialIn() {

	}

	public static EaseExponentialIn getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new EaseExponentialIn();
		}
		return INSTANCE;
	}

	@Override
	public float getPercentage(final float pSecondsElapsed, final float pDuration) {
		return EaseExponentialIn.getValue(pSecondsElapsed / pDuration);

	}

	public static float getValue(final float pPercentage) {
		return (float) ((pPercentage == 0) ? 0 : Math.pow(2, 10 * (pPercentage - 1)) - 0.001f);
	}
}
