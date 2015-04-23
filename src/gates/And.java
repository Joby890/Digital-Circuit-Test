package gates;

public class And extends Gate {
	
	public And(Object one, Object two) {
		super(one,two);
	}

	@Override
	public Boolean process() {
		//System.out.println("One is gate: " + (getOne() instanceof Gate));
		//System.out.println("One is boolean: " + (getOne() instanceof Boolean));
		//System.out.println("Two is gate: " + (getTwo() instanceof Gate));
		//System.out.println("Two is boolean: " + (getTwo() instanceof Boolean));
		preProcess();
		
		return ((Boolean) getOne()) && ((Boolean)getTwo());
		
	}
	
	

}
