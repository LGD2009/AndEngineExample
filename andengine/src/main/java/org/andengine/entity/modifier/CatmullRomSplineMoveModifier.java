package org.andengine.entity.modifier;

import org.andengine.util.modifier.ease.IEaseFunction;

/**
 * (c) Zynga 2012
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 11:51:22 - 21.03.2012
 */
public class CatmullRomSplineMoveModifier extends CardinalSplineMoveModifier {

	public CatmullRomSplineMoveModifier(final float pDuration, final CatmullRomMoveModifierConfig pCatmullRomMoveModifierConfig) {
		super(pDuration, pCatmullRomMoveModifierConfig);
	}

	public CatmullRomSplineMoveModifier(final float pDuration, final CatmullRomMoveModifierConfig pCatmullRomMoveModifierConfig, final IEaseFunction pEaseFunction) {
		super(pDuration, pCatmullRomMoveModifierConfig, pEaseFunction);
	}

	public CatmullRomSplineMoveModifier(final float pDuration, final CatmullRomMoveModifierConfig pCatmullRomMoveModifierConfig, final IEntityModifierListener pEntityModifierListener) {
		super(pDuration, pCatmullRomMoveModifierConfig, pEntityModifierListener);
	}

	public CatmullRomSplineMoveModifier(final float pDuration, final CatmullRomMoveModifierConfig pCatmullRomMoveModifierConfig, final IEntityModifierListener pEntityModifierListener, final IEaseFunction pEaseFunction) {
		super(pDuration, pCatmullRomMoveModifierConfig, pEntityModifierListener, pEaseFunction);
	}

	public class CatmullRomMoveModifierConfig extends CardinalSplineMoveModifierConfig {


		private static final int CARDINALSPLINE_CATMULLROM_TENSION = 0;

		public CatmullRomMoveModifierConfig(final int pControlPointCount) {
			super(pControlPointCount, CatmullRomMoveModifierConfig.CARDINALSPLINE_CATMULLROM_TENSION);
		}
	}
}
