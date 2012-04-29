package com.craigpardey.hashcode.data;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class PersonExplicitHashCodeTest extends BasePersonTest<ExplicitHashCodePerson> {

	@Override
	protected ExplicitHashCodePerson createPerson() {
		return new ExplicitHashCodePerson();
	}
}

class ExplicitHashCodePerson extends Person {
	@Override
	public int hashCode() {
		HashCodeBuilder b = new HashCodeBuilder();
		b.append(getId());
		b.append(getDateOfBirth());
		b.append(getFirstName());
		b.append(getLastName());
		b.append(getWeightInPounds());
		b.append(getHeightInInches());
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
		b.append(getDateOfBirth(), that.getDateOfBirth());
		b.append(getFirstName(), that.getFirstName());
		b.append(getLastName(), that.getLastName());
		b.append(getWeightInPounds(), that.getWeightInPounds());
		b.append(getHeightInInches(), that.getHeightInInches());
		return b.isEquals();
	}
}
