package com.netmind.model;

import java.util.UUID;

public class NetmineObject {

	private UUID uuid;

	public NetmineObject() {
		uuid = UUID.randomUUID();

	}

	public NetmineObject(UUID uuid) {
		this.uuid = uuid;

	}

	public UUID getUUID() {
		return uuid;
	}

}