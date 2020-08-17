package org.andengine.entity.particle.emitter;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 15:58:12 - 01.10.2010
 */
public abstract class BaseParticleEmitter implements IParticleEmitter {


	protected float mCenterX;
	protected float mCenterY;

	public BaseParticleEmitter(final float pCenterX, final float pCenterY) {
		this.mCenterX = pCenterX;
		this.mCenterY = pCenterY;
	}

	public float getCenterX() {
		return this.mCenterX;
	}

	public float getCenterY() {
		return this.mCenterY;
	}

	public void setCenterX(final float pCenterX) {
		this.mCenterX = pCenterX;
	}

	public void setCenterY(final float pCenterY) {
		this.mCenterY = pCenterY;
	}

	public void setCenter(final float pCenterX, final float pCenterY) {
		this.mCenterX = pCenterX;
		this.mCenterY = pCenterY;
	}

	@Override
	public void onUpdate(final float pSecondsElapsed) {

	}

	@Override
	public void reset() {

	}
}
