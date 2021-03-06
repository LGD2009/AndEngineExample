package org.andengine.input.touch.controller;

import android.view.MotionEvent;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 20:23:33 - 13.07.2010
 */
public class SingleTouchController extends BaseTouchController {

	public SingleTouchController() {

	}

	@Override
	public void onHandleMotionEvent(final MotionEvent pMotionEvent) {
		this.fireTouchEvent(pMotionEvent.getX(), pMotionEvent.getY(), pMotionEvent.getAction(), 0, pMotionEvent);
	}
}
