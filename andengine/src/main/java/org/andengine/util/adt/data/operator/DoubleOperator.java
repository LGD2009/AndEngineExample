package org.andengine.util.adt.data.operator;

/**
 * (c) Zynga 2012
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 14:24:15 - 02.02.2012
 */
public enum DoubleOperator {
	// ===========================================================
	// Elements
	// ===========================================================

	EQUALS() {
		@Override
		public boolean check(final double pDoubleA, final double pDoubleB) {
			return pDoubleA == pDoubleB;
		}
	},
	NOT_EQUALS()  {
		@Override
		public boolean check(final double pDoubleA, final double pDoubleB) {
			return pDoubleA != pDoubleB;
		}
	},
	LESS_THAN()  {
		@Override
		public boolean check(final double pDoubleA, final double pDoubleB) {
			return pDoubleA < pDoubleB;
		}
	},
	LESS_OR_EQUAL_THAN()  {
		@Override
		public boolean check(final double pDoubleA, final double pDoubleB) {
			return pDoubleA <= pDoubleB;
		}
	},
	MORE_THAN()  {
		@Override
		public boolean check(final double pDoubleA, final double pDoubleB) {
			return pDoubleA > pDoubleB;
		}
	},
	MORE_OR_EQUAL_THAN()  {
		@Override
		public boolean check(final double pDoubleA, final double pDoubleB) {
			return pDoubleA >= pDoubleB;
		}
	};

	public abstract boolean check(final double pDoubleA, final double pDoubleB);
}