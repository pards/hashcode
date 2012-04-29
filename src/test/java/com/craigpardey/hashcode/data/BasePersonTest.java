package com.craigpardey.hashcode.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.util.StopWatch;

public abstract class BasePersonTest<T extends Person> {

	@Test
	public void testHashCode() {
		int size = 1000000;
		StopWatch timer = new StopWatch(createPerson().getClass().getSimpleName());
		timer.start("Build set of " + size);
		Set<T> set = new HashSet<T>();
		for(int i = 0; i < size; i++){
			T person = createPerson(i);
			set.add(person);
		}
		timer.stop();
		Assert.assertEquals(size, set.size());
		System.out.println(timer.prettyPrint());
	}
	
	private T createPerson(int id) {
		T p = createPerson();
		p.setId(id);
		p.setDateOfBirth(new Date());
		p.setFirstName("Craig");
		p.setLastName("Pardey");
		p.setHeightInInches(70);
		p.setWeightInPounds(160);
		return p;
	}
	
	protected abstract T createPerson();
}
