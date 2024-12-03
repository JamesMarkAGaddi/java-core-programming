package org.acumen.training.codes;

public interface IFilter<E extends CharSequence> {

	boolean accept(E x);

}
