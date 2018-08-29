package hello;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface GreetingRepository extends Repository<Greeting, String> {

	public List<Greeting> findAll();	
	public void save(Greeting task);
}
