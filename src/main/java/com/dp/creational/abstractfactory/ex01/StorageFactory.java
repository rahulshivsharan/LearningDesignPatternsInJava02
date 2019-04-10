package com.dp.creational.abstractfactory.ex01;

public class StorageFactory {
	public static Storage createStorage(StorageAbstractFactory factory) {
		return factory.createStorageDevice();
	}
}
