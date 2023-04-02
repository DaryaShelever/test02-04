package app.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Person;
import app.core.exception.PersonException;
import app.core.service.DictinoryServes;

@RestController
@RequestMapping("/api/person")
@CrossOrigin
public class DictionaryController {

	@Autowired
	private DictinoryServes dictinory;

	@PostMapping("/add-name")
	public Person addWordToDictinory(@RequestBody Person p) {
		try {
			return this.dictinory.addName(p);
		} catch (PersonException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}

	}

}
