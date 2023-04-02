package app.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Person;

public interface PersonRepositopy extends JpaRepository<Person, Integer> {

}
