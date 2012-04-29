package com.craigpardey.hashcode.data;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class PersonMinimalHashCodeTest extends BasePersonTest<MinimalHashCodePerson> {

	@Override
	protected MinimalHashCodePerson createPerson() {
		return new MinimalHashCodePerson();
	}
}

class MinimalHashCodePerson extends Person {
	@Override
	public int hashCode() {
		HashCodeBuilder b = new HashCodeBuilder();
		b.append(getId());
		return b.hashCode();
	}
	
	@Override
	public boolean equals(Object o){
		if( o == null){
			return false;
		}
		if( ! (o instanceof ExplicitHashCodePerson)){
			return false;
		}
		ExplicitHashCodePerson that = (ExplicitHashCodePerson)o;
		EqualsBuilder b = new EqualsBuilder();
		b.append(getId(), that.getId());
		return b.isEquals();
	}
}
