package gates;

public class Not extends Gate {

	public Not(Object one) {
		super(one);
	}

	@Override
	public Boolean process() {
		preProcess();
		return !((boolean) getOne());
	}

}
