package org.andengine.engine.handler;

import org.andengine.util.adt.list.SmartList;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 09:45:22 - 31.03.2010
 */
public class UpdateHandlerList extends SmartList<IUpdateHandler> implements IUpdateHandler {


	private static final long serialVersionUID = -8842562717687229277L;

	public UpdateHandlerList() {

	}

	public UpdateHandlerList(final int pCapacity) {
		super(pCapacity);
	}

	@Override
	public void onUpdate(final float pSecondsElapsed) {
		final int handlerCount = this.size();
		for(int i = handlerCount - 1; i >= 0; i--) {
			this.get(i).onUpdate(pSecondsElapsed);
		}
	}

	@Override
	public void reset() {
		final int handlerCount = this.size();
		for(int i = handlerCount - 1; i >= 0; i--) {
			this.get(i).reset();
		}
	}
}
