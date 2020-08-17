package org.andengine.entity.util;

import org.andengine.engine.handler.IUpdateHandler;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 11:00:55 - 22.06.2010
 */
public class FrameCounter implements IUpdateHandler {

	private int mFrames;

	public int getFrames() {
		return this.mFrames;
	}

	@Override
	public void onUpdate(final float pSecondsElapsed) {
		this.mFrames++;
	}

	@Override
	public void reset() {
		this.mFrames = 0;
	}

}
