package com.covid.tracker;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.covid.tracker.model.Country;
import com.covid.tracker.service.CovidDetailsServiceImpl;

@SpringBootTest
class CovidTrackerApplicationTests {

	@Test
	void contextLoads() {
	}

	
	
	@Test
	void testgetCountries() {
		CovidDetailsServiceImpl covidDetailsServiceImpl = new CovidDetailsServiceImpl();
		List<Country> listCont = covidDetailsServiceImpl.getCountries(true);
		assertTrue(!listCont.isEmpty());
	}
}
