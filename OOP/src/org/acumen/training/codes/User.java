package org.acumen.training.codes;

public sealed abstract class User permits AdminUser, GuestUser, ValidUser {

	public abstract boolean logIn();

	public abstract boolean signUp();

	public abstract boolean logOut();

}

sealed class AdminUser extends User permits SuperUser{ // eto pwede maextend //required na manganak to

	@Override
	public boolean logIn() {

		return false;
	}

	@Override
	public boolean signUp() {

		return false;
	}

	@Override
	public boolean logOut() {

		return false;
	}
	
	public boolean isAdmin() {
		return false;
	}
}

final class GuestUser extends User { // final is used para di na sya pwedeng galawin or maextends

	@Override
	public boolean logIn() {

		return false;
	}

	@Override
	public boolean signUp() {

		return false;
	}

	@Override
	public boolean logOut() {

		return false;
	}

}

non-sealed class ValidUser extends User {

	@Override
	public boolean logIn() {

		return false;
	}

	@Override
	public boolean signUp() {

		return false;
	}

	@Override
	public boolean logOut() {

		return false;
	}

}

non-sealed class SuperUser extends AdminUser {

}

final class ResourceUser extends SuperUser {
}
	
