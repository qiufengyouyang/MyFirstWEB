package com.fang.designer.memonry;

public class Original {
	private String val;

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public Original(String val) {
		super();
		this.val = val;
	}
	public Mementno createMementno(){
		return new Mementno(val);
	}
	public void restoreValue(Mementno memento){
		this.val = memento.getValue();
	}
}
