package org.andengine.util.modifier.ease;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 *
 * @author Gil
 * @author Nicolas Gramlich
 * @since 16:52:11 - 26.07.2010
 */
public class EaseStrongIn implements IEaseFunction {


	private static EaseStrongIn INSTANCE;

	private EaseStrongIn() {

	}

	public static EaseStrongIn getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new EaseStrongIn();
		}
		return INSTANCE;
	}

	@Override
	public float getPercentage(final float pSecondsElapsed, final float pDuration) {
		return EaseStrongIn.getValue(pSecondsElapsed / pDuration);
	}

	public static float getValue(final float pPercentage) {
		return pPercentage * pPercentage * pPercentage * pPercentage * pPercentage;
	}
}
