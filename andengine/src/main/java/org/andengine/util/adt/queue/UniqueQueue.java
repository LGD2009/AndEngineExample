package org.andengine.util.adt.queue;

import org.andengine.util.adt.list.UniqueList;

/**
 * (c) Zynga 2012
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 17:17:33 PM - 03.022012
 */
public class UniqueQueue<T extends Comparable<T>> extends UniqueList<T> implements IUniqueQueue<T>{

	public UniqueQueue(final IQueue<T> pQueue) {
		super(pQueue);
	}

	@Override
	public T peek() {
		if(this.isEmpty()) {
			return null;
		} else {
			return this.get(0);
		}
	}

	@Override
	public T poll() {
		if(this.isEmpty()) {
			return null;
		} else {
			return this.remove(0);
		}
	}

	@Override
	public void enter(final T pItem) {
		this.add(pItem);
	}

	@Deprecated
	@Override
	public void enter(final int pIndex, final T pItem) throws IndexOutOfBoundsException {
		this.add(pIndex, pItem);
	}
}
