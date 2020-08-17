package org.andengine.util.modifier.ease;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 *
 * @author Gil
 * @author Nicolas Gramlich
 * @since 16:52:11 - 26.07.2010
 */
public class EaseCubicIn implements IEaseFunction {


	private static EaseCubicIn INSTANCE;

	private EaseCubicIn() {

	}

	public static EaseCubicIn getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new EaseCubicIn();
		}
		return INSTANCE;
	}

	@Override
	public float getPercentage(final float pSecondsElapsed, final float pDuration) {
		return EaseCubicIn.getValue(pSecondsElapsed / pDuration);
	}

	public static float getValue(final float pPercentage) {
		return pPercentage * pPercentage * pPercentage;
	}
}
