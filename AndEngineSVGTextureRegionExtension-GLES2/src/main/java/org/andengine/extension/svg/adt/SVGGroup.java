package org.andengine.extension.svg.adt;

import org.andengine.extension.svg.util.constants.ISVGConstants;


/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 12:58:32 - 24.05.2011
 */
public class SVGGroup implements ISVGConstants {


	private final SVGGroup mSVGroupParent;
	private final SVGProperties mSVGProperties;
	private final boolean mHasTransform;
	private final boolean mHidden;

	public SVGGroup(final SVGGroup pSVGroupParent, final SVGProperties pSVGProperties, final boolean pHasTransform) {
		this.mSVGroupParent = pSVGroupParent;
		this.mSVGProperties = pSVGProperties;
		this.mHasTransform = pHasTransform;
		this.mHidden = (this.mSVGroupParent != null && this.mSVGroupParent.isHidden()) || this.isDisplayNone();
	}

	public boolean hasTransform() {
		return this.mHasTransform;
	}

	public SVGProperties getSVGProperties() {
		return this.mSVGProperties;
	}

	public boolean isHidden() {
		return this.mHidden;
	}

	private boolean isDisplayNone() {
		return VALUE_NONE.equals(this.mSVGProperties.getStringProperty(ATTRIBUTE_DISPLAY, false));
	}
}
