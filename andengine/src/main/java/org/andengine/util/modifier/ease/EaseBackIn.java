package org.andengine.util.modifier.ease;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 *
 * @author Gil
 * @author Nicolas Gramlich
 * @since 16:52:11 - 26.07.2010
 */
public class EaseBackIn implements IEaseFunction {


	private static final float OVERSHOOT_CONSTANT = 1.70158f;

	private static EaseBackIn INSTANCE;

	private EaseBackIn() {

	}

	public static EaseBackIn getInstance() {
		if(null == INSTANCE) {
			INSTANCE = new EaseBackIn();
		}
		return INSTANCE;
	}

	@Override
	public float getPercentage(final float pSecondsElapsed, final float pDuration) {
		return EaseBackIn.getValue(pSecondsElapsed / pDuration);
	}

	public static float getValue(final float pPercentage) {
		return pPercentage * pPercentage * ((OVERSHOOT_CONSTANT + 1) * pPercentage - OVERSHOOT_CONSTANT);
	}
}
