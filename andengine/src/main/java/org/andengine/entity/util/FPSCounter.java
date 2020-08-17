package org.andengine.entity.util;

import org.andengine.engine.handler.IUpdateHandler;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 19:52:31 - 09.03.2010
 */
public class FPSCounter implements IUpdateHandler {

	protected float mSecondsElapsed;

	protected int mFrames;

	public float getFPS() {
		return this.mFrames / this.mSecondsElapsed;
	}

	@Override
	public void onUpdate(final float pSecondsElapsed) {
		this.mFrames++;
		this.mSecondsElapsed += pSecondsElapsed;
	}

	@Override
	public void reset() {
		this.mFrames = 0;
		this.mSecondsElapsed = 0;
	}
}
