package org.acumen.training.codes.records;

public class TestEmployment {

	public static void main(String[] args) {

		EmpStatus employmentStatus = EmpStatus.TENURED;
		System.out.println(employmentStatus);

		EmpStatus employmentStatus1 = EmpStatus.CONTRACT;
		System.out.println(employmentStatus1);

		EmpStatus employmentStatus2 = EmpStatus.PROBATIONARY;
		System.out.println(employmentStatus2);

		employmentStatus2.setName("hotdog");
		for (EmpStatus lookup : EmpStatus.values()) {
			System.out.println(lookup.name()); // same lang to ng toString sa tasss neto
			System.out.println(lookup);
			System.out.println(lookup.ordinal());
			System.out.println(lookup.hashCode());
			System.out.println();

		}

	}
}
