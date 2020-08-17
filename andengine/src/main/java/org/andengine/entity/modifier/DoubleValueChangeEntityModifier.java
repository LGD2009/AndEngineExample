package org.andengine.entity.modifier;

import org.andengine.entity.IEntity;
import org.andengine.util.modifier.BaseDoubleValueChangeModifier;

/**
 * (c) Zynga 2011
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 14:27:48 - 10.08.2011
 */
public abstract class DoubleValueChangeEntityModifier extends BaseDoubleValueChangeModifier<IEntity> implements IEntityModifier {

	public DoubleValueChangeEntityModifier(final float pDuration, final float pValueChangeA, final float pValueChangeB) {
		super(pDuration, pValueChangeA, pValueChangeB);
	}

	public DoubleValueChangeEntityModifier(final float pDuration, final float pValueChangeA, final float pValueChangeB, final IEntityModifierListener pModifierListener) {
		super(pDuration, pValueChangeA, pValueChangeB, pModifierListener);
	}

	public DoubleValueChangeEntityModifier(final DoubleValueChangeEntityModifier pDoubleValueChangeEntityModifier) {
		super(pDoubleValueChangeEntityModifier);
	}
}
