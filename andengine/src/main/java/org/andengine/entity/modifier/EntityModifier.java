package org.andengine.entity.modifier;

import org.andengine.entity.IEntity;
import org.andengine.util.modifier.BaseModifier;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 10:53:16 - 03.09.2010
 */
public abstract class EntityModifier extends BaseModifier<IEntity> implements IEntityModifier {

	public EntityModifier() {
		super();
	}

	public EntityModifier(final IEntityModifierListener pEntityModifierListener) {
		super(pEntityModifierListener);
	}
}
