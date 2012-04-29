package com.craigpardey.hashcode.data;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


public class PersonReflectionHashCodeTest extends BasePersonTest<ReflectionHashCodePerson> {

	@Override
	protected ReflectionHashCodePerson createPerson() {
		return new ReflectionHashCodePerson();
	}
}

class ReflectionHashCodePerson extends Person {
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, false);
	}
	
	@Override
	public boolean equals(Object o){
		return EqualsBuilder.reflectionEquals(this, o, false);
	}
}
