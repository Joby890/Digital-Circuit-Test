package gates;

public abstract class Gate {
	
	private Object one;
	private Object two;

	public Gate(Object one) {
		this.one = one;
	}
	
	public Gate(Object one, Object two) {
		this.one = one;
		this.two = two;
	}
	
	public abstract Boolean process();

	public Object getOne() {
		return one;
	}

	public Object getTwo() {
		return two;
	}

	public void setOne(Object one) {
		this.one = one;
	}

	public void setTwo(Object two) {
		this.two = two;
	}
	
	public void preProcess() {
		
		if(getOne() instanceof Gate) {
			Gate g = (Gate) getOne();
			setOne(g.process());
		}
		if(getTwo() instanceof Gate) {
			Gate g = (Gate) getTwo();
			setTwo(g.process());
		}
	}
	

}
