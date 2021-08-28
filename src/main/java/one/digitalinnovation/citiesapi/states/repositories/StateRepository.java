package one.digitalinnovation.citiesapi.states.repositories;

import one.digitalinnovation.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
