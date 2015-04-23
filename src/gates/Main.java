package gates;

public class Main {

	public static void main(String[] args) {

		for (int x1 = 0; x1 < 2; x1++) {
			for (int x2 = 0; x2 < 2; x2++) {
				for (int x3 = 0; x3 < 2; x3++) {
					for (int x4 = 0; x4 < 2; x4++) {
						for (int x5 = 0; x5 < 2; x5++) {
							Object a = new XOr(new Buffer(new And(x1 != 0,x2 != 0)), new And(x3 != 0, x4 != 0));
							Object b = new XOr(new Not(new And(x1 != 0, x2 != 0)), new Or(new And(x3 != 0, x4 != 0), x5 != 0));
							if (new And(a, b).process()) {
								System.out.println("" + x1 + " " + x2 + " "+ x3 + " " + x4 + " " + x5);
							}
						}
					}
				}
			}
		}
	}
}
