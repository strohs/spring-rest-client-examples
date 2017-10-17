package cliff.springframework.springrestclientexamples.services;

import cliff.springframework.api.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * 
 */
public interface ApiService {

    //for our restTemplate based REST client
    List<User> getUsers(Integer limit);

    //uses spring5 reactive types
    Flux<User> getUsers(Mono<Integer> limit);
}
