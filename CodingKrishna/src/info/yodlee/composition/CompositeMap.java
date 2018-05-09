package info.yodlee.composition;

public class CompositeMap {
	static abstract class Map {
		public abstract int map();
	}

	interface newMap {
		int map();
	}

	static class DerivedMap extends Map {
		private int value = 0;

		public DerivedMap() {
			value = 10;
			/* System.out.println("DerviedClass:" + value); */
		}

		public DerivedMap(int value) {
			value = 10;
		}

		@Override
		public int map() {
			return 10;
		}
	}

	class NewDerivedMap extends DerivedMap implements newMap {
		public int value = 20;

		public NewDerivedMap(int value) {
			this.value = value;
			System.out.println("NewDerivedMap:" + value);
		}

		public int map() {
			return value;
		}
	}

	public static void main(String[] args) {
		CompositeMap suri = new CompositeMap();
		DerivedMap alaparthi = suri.new NewDerivedMap(30);
		System.out.println(alaparthi.map());

	}

}
