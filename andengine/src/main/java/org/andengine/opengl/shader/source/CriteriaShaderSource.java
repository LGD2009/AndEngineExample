package org.andengine.opengl.shader.source;

import org.andengine.opengl.shader.exception.ShaderProgramException;
import org.andengine.opengl.util.GLState;
import org.andengine.opengl.util.criteria.IGLCriteria;

/**
 * (c) Zynga 2011
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 16:30:12 - 10.10.2011
 */
public class CriteriaShaderSource implements IShaderSource {


	private final CriteriaShaderSourceEntry[] mCriteriaShaderSourceEntries;

	public CriteriaShaderSource(final CriteriaShaderSourceEntry ... pCriteriaShaderSourceEntries) {
		this.mCriteriaShaderSourceEntries = pCriteriaShaderSourceEntries;
	}

	@Override
	public String getShaderSource(final GLState pGLState) {
		for(int i = 0; i < this.mCriteriaShaderSourceEntries.length; i++) {
			final CriteriaShaderSourceEntry criteriaShaderSourceEntry = this.mCriteriaShaderSourceEntries[i];
			if(criteriaShaderSourceEntry.isMet(pGLState)) {
				return criteriaShaderSourceEntry.getShaderSource();
			}
		}
		throw new ShaderProgramException("No " + CriteriaShaderSourceEntry.class.getSimpleName() + " met!");
	}

	public static class CriteriaShaderSourceEntry {


		private final String mShaderSource;
		private final IGLCriteria[] mGLCriterias;
		
		public CriteriaShaderSourceEntry(final String pShaderSource) {
			this(pShaderSource, (IGLCriteria[]) null);
		}

		public CriteriaShaderSourceEntry(final String pShaderSource, final IGLCriteria ... pCriterias) {
			this.mGLCriterias = pCriterias;
			this.mShaderSource = pShaderSource;
		}

		public String getShaderSource() {
			return this.mShaderSource;
		}

		public boolean isMet(final GLState pGLState) {
			if(this.mGLCriterias != null) {
				for(IGLCriteria gLCriteria : this.mGLCriterias) {
					if(!gLCriteria.isMet(pGLState)) {
						return false;
					}
				}
			}
			return true;
		}
	}
}
