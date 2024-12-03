package org.acumen.training.codes.records;

//gagawa na lang ng getter and setters sa interface tas override mo na lang para pwde mo  na maset yung final variables asa loob ng record

//wala kasing super super dito
interface IEmployee {

	public Integer getId();

	public void setId();

	public String getName();

	public void setName();

	public Double getSalary();

	public void setSalary();

}

//wala na tong super class kasi compacted na
//ang pwede na lang dito ay interface
//final na kasi to kaya di na sya pwedeng magoverride
public record Profile(Integer id, String name, Double salary) implements IEmployee {
	// ginagawa tung record na to na di na flexible
	// so kung maglalagay ka ng anything dito andun lang sya sa taas
	// automatic na to may constructor so no need na mag initialize ng constructor
	// canonical constructor meaning gawa na sya

	private static Integer idProfile;
	private static String nameProfile;
	private static Double salaryProfile;

	public Profile(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	// this is a read-only class kaya bawal ang setters

	public Profile(Integer id) {
		this(id, "", null);
	}

	// compacted
	public Profile() {
		this(null);
	}

	public Integer id() {
		return id;
	}

	public String name() {
		return name;
	}

	public Double salary() {
		return salary;
	}

	@Override
	public Integer getId() {
		return Profile.idProfile;
	}

	@Override
	public void setId() {
		Profile.idProfile = id;

	}

	@Override
	public String getName() {
		return Profile.nameProfile;
	}

	@Override
	public void setName() {
		Profile.nameProfile = name;
	}

	@Override
	public Double getSalary() {
		return Profile.salaryProfile;
	}

	@Override
	public void setSalary() {
		Profile.salaryProfile = salary;
	}

}
