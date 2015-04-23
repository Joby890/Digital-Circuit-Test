package gates;

public class XOr extends Gate {

	public XOr(Object one, Object two) {
		super(one, two);
	}

	@Override
	public Boolean process() {
		preProcess();
		return ((Boolean) getOne()) ^ ((Boolean) getTwo());
	}
	
	

}
