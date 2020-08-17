package org.andengine.util.adt.trie;

import android.util.SparseArray;

/**
 * (c) Zynga 2012
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 12:25:47 - 30.01.2012
 */
public class Trie implements ITrie {


	private static final int CHILDREN_SIZE_DEFAULT = 'Z' - 'A' + 1;

	private final TrieNode mRoot = new TrieNode();

	@Override
	public void add(final CharSequence pCharSequence) {
		this.mRoot.add(pCharSequence);
	}

	@Override
	public void add(final CharSequence pCharSequence, final int pStart, final int pEnd) {
		this.mRoot.add(pCharSequence, pStart, pEnd);
	}

	@Override
	public boolean contains(final CharSequence pCharSequence) {
		return this.mRoot.contains(pCharSequence);
	}

	@Override
	public boolean contains(final CharSequence pCharSequence, final int pStart, final int pEnd) {
		return this.mRoot.contains(pCharSequence, pStart, pEnd);
	}

	public static class TrieNode implements ITrie {


		private SparseArray<TrieNode> mChildren;

		private boolean mWordEndFlag;

		public TrieNode() {
			this(false);
		}

		public TrieNode(final boolean pWordEndFlag) {
			this.mWordEndFlag = pWordEndFlag;
		}

		@Override
		public void add(final CharSequence pCharSequence) {
			final int length = pCharSequence.length();
			if(length == 0) {
				return;
			}

			this.add(pCharSequence, 0, length);
		}

		@Override
		public void add(final CharSequence pCharSequence, final int pStart, final int pEnd) {
			if(this.mChildren == null) {
				this.mChildren = new SparseArray<TrieNode>(Trie.CHILDREN_SIZE_DEFAULT);
			}
			final char character = pCharSequence.charAt(pStart);

			TrieNode child = this.mChildren.get(character);
			if(child == null) {
				child = new TrieNode();
				this.mChildren.put(character, child);
			}

			if(pStart < pEnd - 1) {
				child.add(pCharSequence, pStart + 1, pEnd);
			} else {
				child.mWordEndFlag = true;
			}
		}

		@Override
		public boolean contains(final CharSequence pCharSequence) {
			final int length = pCharSequence.length();
			if(length == 0) {
				throw new IllegalArgumentException();
			}
			return this.contains(pCharSequence, 0, length);
		}

		@Override
		public boolean contains(final CharSequence pCharSequence, final int pStart, final int pEnd) {
			if(this.mChildren == null) {
				return false;
			}

			final char character = pCharSequence.charAt(pStart);
			final TrieNode child = this.mChildren.get(character);
			if(child == null) {
				return false;
			} else {
				if(pStart < pEnd - 1) {
					return child.contains(pCharSequence, pStart + 1, pEnd);
				} else {
					return child.mWordEndFlag;
				}
			}
		}
	}
}
