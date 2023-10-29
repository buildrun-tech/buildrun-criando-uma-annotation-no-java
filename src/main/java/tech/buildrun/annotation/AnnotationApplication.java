package tech.buildrun.annotation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.buildrun.annotation.controller.HelloController;

import java.util.Arrays;

@SpringBootApplication
public class AnnotationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Arrays.stream(HelloController.class.getDeclaredMethods())
				.forEach(method -> System.out.println(Arrays.toString(method.getAnnotations())));
	}
}
