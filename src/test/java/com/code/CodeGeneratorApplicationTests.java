package com.code;

import org.apache.catalina.webresources.FileResource;
import org.apache.ibatis.annotations.Insert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
