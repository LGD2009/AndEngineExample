package org.andengine.util.modifier.ease;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 *
 * @author Gil
 * @author Nicolas Gramlich
 * @since 16:52:11 - 26.07.2010
 */
public class EaseCircularOut implements IEaseFunction {

	private static EaseCircularOut INSTANCE;

	private EaseCircularOut() {

	}

	public static EaseCircularOut getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new EaseCircularOut();
		}
		return INSTANCE;
	}

	@Override
	public float getPercentage(final float pSecondsElapsed, final float pDuration) {
		return EaseCircularOut.getValue(pSecondsElapsed / pDuration);
	}

	public static float getValue(final float pPercentage) {
		final float t = pPercentage - 1;
		return (float) Math.sqrt(1 - t * t);
	}

}
