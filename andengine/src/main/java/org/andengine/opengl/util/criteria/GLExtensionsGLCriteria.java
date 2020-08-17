package org.andengine.opengl.util.criteria;

import org.andengine.opengl.util.GLState;
import org.andengine.util.adt.data.operator.StringOperator;

/**
 * (c) Zynga 2011
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 21:02:01 - 10.10.2011
 */
public class GLExtensionsGLCriteria extends StringGLCriteria {

	public GLExtensionsGLCriteria(final StringOperator pStringOperator, final String pGLExtensions) {
		super(pStringOperator, pGLExtensions);
	}

	@Override
	protected String getActualCriteria(final GLState pGLState) {
		return pGLState.getExtensions();
	}
}
