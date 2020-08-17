package org.andengine.util.modifier.ease;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 *
 * @author Gil
 * @author Nicolas Gramlich
 * @since 16:52:11 - 26.07.2010
 */
public class EaseQuadIn implements IEaseFunction {


	private static EaseQuadIn INSTANCE;

	private EaseQuadIn() {

	}

	public static EaseQuadIn getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new EaseQuadIn();
		}
		return INSTANCE;
	}

	@Override
	public float getPercentage(final float pSecondsElapsed, final float pDuration) {
		return EaseQuadIn.getValue(pSecondsElapsed / pDuration);
	}

	public static float getValue(final float pPercentage) {
		return pPercentage * pPercentage;
	}
}
