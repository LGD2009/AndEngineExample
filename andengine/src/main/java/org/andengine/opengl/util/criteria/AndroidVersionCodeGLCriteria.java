package org.andengine.opengl.util.criteria;

import org.andengine.opengl.util.GLState;
import org.andengine.util.adt.data.operator.IntOperator;

import android.os.Build;

/**
 * (c) Zynga 2011
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 17:21:13 - 10.10.2011
 */
public class AndroidVersionCodeGLCriteria extends IntGLCriteria {

	public AndroidVersionCodeGLCriteria(final IntOperator pIntOperator, final int pAndroidVersionCode) {
		super(pIntOperator, pAndroidVersionCode);
	}

	@Override
	protected int getActualCriteria(final GLState pGLState) {
		return Build.VERSION.SDK_INT;
	}
}
