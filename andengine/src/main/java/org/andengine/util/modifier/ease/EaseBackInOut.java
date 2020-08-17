package org.andengine.util.modifier.ease;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 *
 * @author Gil
 * @author Nicolas Gramlich
 * @since 16:52:11 - 26.07.2010
 */
public class EaseBackInOut implements IEaseFunction {


	private static EaseBackInOut INSTANCE;

	private EaseBackInOut() {

	}

	public static EaseBackInOut getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new EaseBackInOut();
		}
		return INSTANCE;
	}

	@Override
	public float getPercentage(final float pSecondsElapsed, final float pDuration) {
		final float percentage = pSecondsElapsed / pDuration;

		if(percentage < 0.5f) {
			return 0.5f * EaseBackIn.getValue(2 * percentage);
		} else {
			return 0.5f + 0.5f * EaseBackOut.getValue(percentage * 2 - 1);
		}
	}
}
