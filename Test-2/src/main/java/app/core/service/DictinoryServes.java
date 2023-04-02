package app.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Person;
import app.core.exception.PersonException;
import app.core.repository.PersonRepositopy;

@Service
@Transactional
public class DictinoryServes {

	@Autowired
	private PersonRepositopy personRepositopy;

	public Person addName(Person p) throws PersonException {
		if (this.personRepositopy.existsById(p.getId())) {
			throw new PersonException(" faild : name with this id already exsise" + p.getId());
		} else {
			return this.personRepositopy.save(p);
		}

	}

}
