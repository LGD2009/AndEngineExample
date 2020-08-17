package org.andengine.engine.options.resolutionpolicy;

import org.andengine.opengl.view.RenderSurfaceView;

import android.view.View.MeasureSpec;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 11:23:00 - 29.03.2010
 */
public class RatioResolutionPolicy extends BaseResolutionPolicy {


	private final float mRatio;

	public RatioResolutionPolicy(final float pRatio) {
		this.mRatio = pRatio;
	}

	public RatioResolutionPolicy(final float pWidthRatio, final float pHeightRatio) {
		this.mRatio = pWidthRatio / pHeightRatio;
	}

	@Override
	public void onMeasure(final RenderSurfaceView pRenderSurfaceView, final int pWidthMeasureSpec, final int pHeightMeasureSpec) {
		BaseResolutionPolicy.throwOnNotMeasureSpecEXACTLY(pWidthMeasureSpec, pHeightMeasureSpec);

		final int specWidth = MeasureSpec.getSize(pWidthMeasureSpec);
		final int specHeight = MeasureSpec.getSize(pHeightMeasureSpec);

		final float desiredRatio = this.mRatio;
		final float realRatio = (float)specWidth / specHeight;

		int measuredWidth;
		int measuredHeight;
		if(realRatio < desiredRatio) {
			measuredWidth = specWidth;
			measuredHeight = Math.round(measuredWidth / desiredRatio);
		} else {
			measuredHeight = specHeight;
			measuredWidth = Math.round(measuredHeight * desiredRatio);
		}

		pRenderSurfaceView.setMeasuredDimensionProxy(measuredWidth, measuredHeight);
	}
}
