package org.andengine.util.modifier.ease;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 *
 * @author Gil
 * @author Nicolas Gramlich
 * @since 16:50:40 - 26.07.2010
 */
public class EaseLinear implements IEaseFunction {


	private static EaseLinear INSTANCE;

	private EaseLinear() {

	}

	public static EaseLinear getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new EaseLinear();
		}
		return INSTANCE;
	}

	@Override
	public float getPercentage(final float pSecondsElapsed, final float pDuration) {
		return pSecondsElapsed / pDuration;
	}
}
