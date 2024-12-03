package org.acumen.training.codes.records;

//kung ayaw mo na ng may ccinstructor, dito ka na
//dapat type-safe meaning walang naklaagy na datatye sa mga final variables
//dapat walang constrcutor or class na makikita kapag tinatawag
// dapat informative meaning hindi numbers kapag prinint mo sya sa main

interface ISalary {

	public Double getSalary();

	public void setSalary();

}

public enum EmpStatus implements ISalary {

	// walang extends ang mga enum kasi nakaprivate ang constructor nya,
	// private constrcutor cannot super();

	// override toString
	// step 1 - add semicolon sa mga final vars
	// step 3 - inject the constructor parameters sa mga final vars, yung mga nasa
	// parenthesis
	CONTRACT("Contract"), TENURED("Tenured"), PROBATIONARY("Probationary"),; // ref vars ang tawag dito

	// step 2 - implement private constructor, CTRL+SPACEBAR
	// step 2 - instantiate the name var
	// note that lahat ng mga to ay private talaga
	// pwede mo dagdagan yung mga ieedit na vars nito, gamit kang this at edi constructor
	private String name;

	private EmpStatus(String name) { // private constructor
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name.toLowerCase();
	}
	
	//Step 5 - pag trip mo lang maggetter setter pero di napapakitan talaga kasi pakita lang yan ganun pa rin ang final 

	@Override
	public Double getSalary() {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public void setSalary() {
		// TODO Auto-generated method stub
	}

}
