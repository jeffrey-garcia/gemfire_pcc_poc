package com.example.demopcc;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@EnableCaching
@SpringBootApplication
public class DemoPccApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPccApplication.class, args);
	}
}

@Data @NoArgsConstructor @Entity
class ClientHealthInfo{
	@Id
	private String accountId;
	private Long steps;
	private Long caloriesBurnt;
	private Integer weight;
	private Long energyBurnt;
	private Long energyBurntGoal;
	private Long exerciseTime;
	private Long exerciseTimeGoal;
	private Long standHours;
	private Long standHoursGoal;
}

interface ClientHealthInfoRepository extends JpaRepository<ClientHealthInfo, String>{

}

@Slf4j
@RestController
class MyController{

	@Autowired
	ClientHealthInfoRepository clientHealthInfoRepository;

	@Cacheable(cacheNames = "clientHealthInfo")
	@GetMapping("/clientHealthInfo/{accountId}")
	public ClientHealthInfo get(@PathVariable String accountId){
		log.info("MyController.get execute");
		return clientHealthInfoRepository.findOne(accountId);
	}

	@CachePut(cacheNames = "clientHealthInfo", key = "#clientHealthInfo.accountId")
	@PostMapping("/clientHealthInfo")
	public void update(@RequestBody ClientHealthInfo clientHealthInfo){
		log.info("MyController.update execute");
		clientHealthInfoRepository.save(clientHealthInfo);
	}

}