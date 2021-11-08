package com.overlay.model;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;

public enum Role {

	ADMINISTRATOR(1), SIMPLE(2);

	int id;

	public static Optional<Role> find(String s) {
		Predicate<Role> predicate = p -> p.name().equals(s);
		return Arrays.asList(values()).stream().filter(predicate).findAny();
	}

	public static Optional<Role> get(int value) {
		if (value == ADMINISTRATOR.getId()) {
			return Optional.of(ADMINISTRATOR);
		}

		if (value == SIMPLE.getId()) {
			return Optional.of(SIMPLE);
		}
		return Optional.empty();
	}

	private Role(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
