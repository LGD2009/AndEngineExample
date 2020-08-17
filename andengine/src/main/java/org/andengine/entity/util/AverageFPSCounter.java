package org.andengine.entity.util;



/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 19:52:31 - 09.03.2010
 */
public abstract class AverageFPSCounter extends FPSCounter {


	private static final float AVERAGE_DURATION_DEFAULT = 5;

	protected final float mAverageDuration;

	public AverageFPSCounter() {
		this(AVERAGE_DURATION_DEFAULT);
	}

	public AverageFPSCounter(final float pAverageDuration) {
		this.mAverageDuration = pAverageDuration;
	}

	protected abstract void onHandleAverageDurationElapsed(final float pFPS);

	@Override
	public void onUpdate(final float pSecondsElapsed) {
		super.onUpdate(pSecondsElapsed);

		if(this.mSecondsElapsed > this.mAverageDuration){
			this.onHandleAverageDurationElapsed(this.getFPS());

			this.mSecondsElapsed -= this.mAverageDuration;
			this.mFrames = 0;
		}
	}
}
