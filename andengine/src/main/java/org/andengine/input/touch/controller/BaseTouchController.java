package org.andengine.input.touch.controller;

import org.andengine.input.touch.TouchEvent;
import org.andengine.util.adt.pool.RunnablePoolItem;
import org.andengine.util.adt.pool.RunnablePoolUpdateHandler;

import android.view.MotionEvent;

/**
 * (c) 2010 Nicolas Gramlich
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 21:06:40 - 13.07.2010
 */
public abstract class BaseTouchController implements ITouchController  {


	private ITouchEventCallback mTouchEventCallback;

	private final RunnablePoolUpdateHandler<TouchEventRunnablePoolItem> mTouchEventRunnablePoolUpdateHandler = new RunnablePoolUpdateHandler<TouchEventRunnablePoolItem>() {
		@Override
		protected TouchEventRunnablePoolItem onAllocatePoolItem() {
			return new TouchEventRunnablePoolItem();
		}
	};

	public BaseTouchController() {

	}

	@Override
	public void setTouchEventCallback(final ITouchEventCallback pTouchEventCallback) {
		this.mTouchEventCallback = pTouchEventCallback;
	}

	@Override
	public void reset() {
		this.mTouchEventRunnablePoolUpdateHandler.reset();
	}

	@Override
	public void onUpdate(final float pSecondsElapsed) {
		this.mTouchEventRunnablePoolUpdateHandler.onUpdate(pSecondsElapsed);
	}

	protected void fireTouchEvent(final float pX, final float pY, final int pAction, final int pPointerID, final MotionEvent pMotionEvent) {
		final TouchEvent touchEvent = TouchEvent.obtain(pX, pY, pAction, pPointerID, MotionEvent.obtain(pMotionEvent));

		final TouchEventRunnablePoolItem touchEventRunnablePoolItem = this.mTouchEventRunnablePoolUpdateHandler.obtainPoolItem();
		touchEventRunnablePoolItem.set(touchEvent);
		this.mTouchEventRunnablePoolUpdateHandler.postPoolItem(touchEventRunnablePoolItem);
	}

	class TouchEventRunnablePoolItem extends RunnablePoolItem {
		// ===========================================================
		// Fields
		// ===========================================================

		private TouchEvent mTouchEvent;

		public void set(final TouchEvent pTouchEvent) {
			this.mTouchEvent = pTouchEvent;
		}

		@Override
		public void run() {
			BaseTouchController.this.mTouchEventCallback.onTouchEvent(this.mTouchEvent);
		}

		@Override
		protected void onRecycle() {
			super.onRecycle();
			final TouchEvent touchEvent = this.mTouchEvent;
			touchEvent.getMotionEvent().recycle();
			touchEvent.recycle();
		}
	}
}
