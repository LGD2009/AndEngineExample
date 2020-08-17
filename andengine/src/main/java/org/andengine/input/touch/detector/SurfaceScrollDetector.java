package org.andengine.input.touch.detector;

import org.andengine.input.touch.TouchEvent;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 16:12:29 - 16.08.2010
 */
public class SurfaceScrollDetector extends ScrollDetector {

	public SurfaceScrollDetector(final float pTriggerScrollMinimumDistance, final IScrollDetectorListener pScrollDetectorListener) {
		super(pTriggerScrollMinimumDistance, pScrollDetectorListener);
	}

	public SurfaceScrollDetector(final IScrollDetectorListener pScrollDetectorListener) {
		super(pScrollDetectorListener);
	}

	@Override
	protected float getX(final TouchEvent pTouchEvent) {
		return pTouchEvent.getMotionEvent().getX();
	}

	@Override
	protected float getY(final TouchEvent pTouchEvent) {
		return pTouchEvent.getMotionEvent().getY();
	}
}
