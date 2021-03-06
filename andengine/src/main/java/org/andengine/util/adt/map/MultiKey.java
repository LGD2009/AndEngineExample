package org.andengine.util.adt.map;

import java.util.Arrays;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 16:54:24 - 07.11.2010
 */
public class MultiKey<K> {


	private final K[] mKeys;
	private final int mCachedHashCode;

	public MultiKey(final K... pKeys) {
		this.mKeys = pKeys;

		this.mCachedHashCode = MultiKey.hash(pKeys);
	}

	public K[] getKeys() {
		return this.mKeys;
	}

	@Override
	public boolean equals(final Object pOther) {
		if(pOther == this) {
			return true;
		}
		if(pOther instanceof MultiKey<?>) {
			final MultiKey<?> otherMultiKey = (MultiKey<?>) pOther;
			return Arrays.equals(this.mKeys, otherMultiKey.mKeys);
		}
		return false;
	}

	public static int hash(final Object ... pKeys) {
		int hashCode = 0;
		for(final Object key : pKeys) {
			if(key != null) {
				hashCode ^= key.hashCode();
			}
		}
		return hashCode;
	}


	@Override
	public int hashCode() {
		return this.mCachedHashCode;
	}

	@Override
	public String toString() {
		return "MultiKey" + Arrays.asList(this.mKeys).toString();
	}

	public K getKey(final int pIndex) {
		return this.mKeys[pIndex];
	}

	public int size() {
		return this.mKeys.length;
	}
}
