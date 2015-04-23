package gates;

public class Or extends Gate {

	public Or(Object one, Object two) {
		super(one, two);
	}

	@Override
	public Boolean process() {
		preProcess();
		return ((Boolean) getOne()) || ((Boolean) getTwo());
	}

}
