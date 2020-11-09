package com.code;

import org.apache.ibatis.annotations.Insert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalField;

import static java.time.temporal.ChronoField.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CodeGeneratorApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void timeStamp() {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.getLong(EPOCH_DAY));

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime.getLong(NANO_OF_DAY));

	}

}
