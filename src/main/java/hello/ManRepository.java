package hello;

/**
 * Created by 1 on 15.05.2017.
 */
import org.springframework.data.repository.CrudRepository;

import hello.model.Man;


public interface ManRepository extends CrudRepository<Man, Integer> {

}
