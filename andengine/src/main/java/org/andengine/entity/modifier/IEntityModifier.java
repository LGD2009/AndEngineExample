package org.andengine.entity.modifier;

import org.andengine.entity.IEntity;
import org.andengine.util.IMatcher;
import org.andengine.util.modifier.IModifier;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 11:17:50 - 19.03.2010
 */
public interface IEntityModifier extends IModifier<IEntity> {

	
	@Override
	public IEntityModifier deepCopy() throws DeepCopyNotSupportedException;

	public interface IEntityModifierListener extends IModifierListener<IEntity>{

	}
	
	public interface IEntityModifierMatcher extends IMatcher<IModifier<IEntity>> {

	}
}
