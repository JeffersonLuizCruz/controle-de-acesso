package com.overlay.model;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;

public enum Role {

	ADMINISTRATOR, SIMPLE;


	public static Optional<Role> find(String s) {
		Predicate<Role> predicate = p -> p.name().equals(s);
		return Arrays.asList(values()).stream().filter(predicate).findAny();
	}

}
