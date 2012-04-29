package com.craigpardey.hashcode.data;


public class PersonDefaultHashCodeTest extends BasePersonTest<Person> {

	@Override
	protected Person createPerson() {
		return new Person();
	}
}
