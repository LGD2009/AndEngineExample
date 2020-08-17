package org.andengine.extension.svg.adt.filter.element;

import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Paint;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 16:55:28 - 26.05.2011
 */
public class SVGFilterElementGaussianBlur implements ISVGFilterElement {


	private final BlurMaskFilter mBlurMaskFilter;

	public SVGFilterElementGaussianBlur(final float pStandardDeviation) {
		final float radius = pStandardDeviation * 2;
		this.mBlurMaskFilter = new BlurMaskFilter(radius, Blur.NORMAL);
	}

	@Override
	public void apply(final Paint pPaint) {
		pPaint.setMaskFilter(this.mBlurMaskFilter);
	}
}
