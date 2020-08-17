package org.andengine.util.modifier.ease;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 *
 * @author Gil
 * @author Nicolas Gramlich
 * @since 16:52:11 - 26.07.2010
 */
public class EaseQuartIn implements IEaseFunction {


	private static EaseQuartIn INSTANCE;

	private EaseQuartIn() {

	}

	public static EaseQuartIn getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new EaseQuartIn();
		}
		return INSTANCE;
	}

	@Override
	public float getPercentage(final float pSecondsElapsed, final float pDuration) {
		return EaseQuartIn.getValue(pSecondsElapsed / pDuration);
	}

	public static float getValue(final float pPercentage) {
		return pPercentage * pPercentage * pPercentage * pPercentage;
	}
}
