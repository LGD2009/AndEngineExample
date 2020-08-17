package org.andengine.opengl.util.criteria;

import org.andengine.opengl.util.GLState;
import org.andengine.util.adt.data.operator.StringOperator;

/**
 * (c) Zynga 2011
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 16:52:33 - 10.10.2011
 */
public class GLVersionGLCriteria extends StringGLCriteria {

	public GLVersionGLCriteria(final StringOperator pStringOperator, final String pExpectedGLVersion) {
		super(pStringOperator, pExpectedGLVersion);
	}

	@Override
	protected String getActualCriteria(final GLState pGLState) {
		return pGLState.getVersion();
	}
}