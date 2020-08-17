package org.andengine.entity;

/**
 * (c) Zynga 2012
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 15:49:11 - 01.05.2012
 */
public class TagEntityMatcher implements IEntityMatcher {


	private int mTag;

	public TagEntityMatcher(final int pTag) {
		this.mTag = pTag;
	}

	public int getTag() {
		return this.mTag;
	}

	public void setTag(final int pTag) {
		this.mTag = pTag;
	}

	@Override
	public boolean matches(final IEntity pEntity) {
		return this.mTag == pEntity.getTag();
	}
}
