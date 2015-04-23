package gates;

public class Buffer extends Gate {

	public Buffer(Object one) {
		super(one);
	}

	@Override
	public Boolean process() {
		preProcess();
		return ((Boolean) getOne());
	}

}
