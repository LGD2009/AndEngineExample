package org.andengine.engine.camera.hud.controls;

import org.andengine.engine.camera.Camera;
import org.andengine.input.touch.TouchEvent;
import org.andengine.input.touch.detector.ClickDetector;
import org.andengine.input.touch.detector.ClickDetector.IClickDetectorListener;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.util.math.MathUtils;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 00:21:55 - 11.07.2010
 */
public class AnalogOnScreenControl extends BaseOnScreenControl implements IClickDetectorListener {


	private final ClickDetector mClickDetector = new ClickDetector(this);

	public AnalogOnScreenControl(final float pX, final float pY, final Camera pCamera, final ITextureRegion pControlBaseTextureRegion, final ITextureRegion pControlKnobTextureRegion, final float pTimeBetweenUpdates, final VertexBufferObjectManager pVertexBufferObjectManager, final IAnalogOnScreenControlListener pAnalogOnScreenControlListener) {
		super(pX, pY, pCamera, pControlBaseTextureRegion, pControlKnobTextureRegion, pTimeBetweenUpdates, pVertexBufferObjectManager, pAnalogOnScreenControlListener);

		this.mClickDetector.setEnabled(false);
	}

	public AnalogOnScreenControl(final float pX, final float pY, final Camera pCamera, final ITextureRegion pControlBaseTextureRegion, final ITextureRegion pControlKnobTextureRegion, final float pTimeBetweenUpdates, final long pOnControlClickMaximumMilliseconds, final VertexBufferObjectManager pVertexBufferObjectManager, final IAnalogOnScreenControlListener pAnalogOnScreenControlListener) {
		super(pX, pY, pCamera, pControlBaseTextureRegion, pControlKnobTextureRegion, pTimeBetweenUpdates, pVertexBufferObjectManager, pAnalogOnScreenControlListener);

		this.mClickDetector.setTriggerClickMaximumMilliseconds(pOnControlClickMaximumMilliseconds);
	}

	@Override
	public IAnalogOnScreenControlListener getOnScreenControlListener() {
		return (IAnalogOnScreenControlListener)super.getOnScreenControlListener();
	}

	public void setOnControlClickEnabled(final boolean pOnControlClickEnabled) {
		this.mClickDetector.setEnabled(pOnControlClickEnabled);
	}

	public void setOnControlClickMaximumMilliseconds(final long pOnControlClickMaximumMilliseconds) {
		this.mClickDetector.setTriggerClickMaximumMilliseconds(pOnControlClickMaximumMilliseconds);
	}

	@Override
	public void onClick(final ClickDetector pClickDetector, final int pPointerID, final float pSceneX, final float pSceneY) {
		this.getOnScreenControlListener().onControlClick(this);
	}

	@Override
	protected boolean onHandleControlBaseTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY) {
		this.mClickDetector.onSceneTouchEvent(null, pSceneTouchEvent);
		return super.onHandleControlBaseTouched(pSceneTouchEvent, pTouchAreaLocalX, pTouchAreaLocalY);
	}

	@Override
	protected void onUpdateControlKnob(final float pRelativeX, final float pRelativeY) {
		if(pRelativeX * pRelativeX + pRelativeY * pRelativeY <= 0.25f) {
			super.onUpdateControlKnob(pRelativeX, pRelativeY);
		} else {
			final float angleRad = MathUtils.atan2(pRelativeY, pRelativeX);
			super.onUpdateControlKnob((float) Math.cos(angleRad) * 0.5f, (float) Math.sin(angleRad) * 0.5f);
		}
	}

	public interface IAnalogOnScreenControlListener extends IOnScreenControlListener {


		public void onControlClick(final AnalogOnScreenControl pAnalogOnScreenControl);
	}
}
