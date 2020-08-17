package org.andengine.opengl.util.criteria;

import org.andengine.opengl.util.GLState;
import org.andengine.util.adt.data.operator.IntOperator;

/**
 * (c) Zynga 2011
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 16:59:32 - 10.10.2011
 */
public abstract class IntGLCriteria implements IGLCriteria {


	private final int mCriteria;
	private final IntOperator mIntOperator;

	public IntGLCriteria(final IntOperator pIntOperator, final int pCriteria) {
		this.mCriteria = pCriteria;
		this.mIntOperator = pIntOperator;
	}

	protected abstract int getActualCriteria(final GLState pGLState);

	@Override
	public boolean isMet(final GLState pGLState) {
		return this.mIntOperator.check(this.getActualCriteria(pGLState), this.mCriteria);
	}
}
