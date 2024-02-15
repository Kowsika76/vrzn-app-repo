package com.verizon.reactive;



import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class TestController {
	@GetMapping("/name")
    Mono<String> getName(){
        return Mono.just("Gokul");
    }

    @GetMapping("/names")
    Flux<Student> getNames(){
//        return Flux.just("Bhavana", "Jalal", "Shiva")
    	return Flux.just(
    			new Student(56,"bhavana"),
    			new Student(67,"jalal"),
    			new Student(89,"kowsi"),
    			new Student(53,"siva"),
    			new Student(90,"vicky"))
    			
                .delayElements(Duration.ofMillis(2000));
    }
private record Student(int id,String name) {}
}
