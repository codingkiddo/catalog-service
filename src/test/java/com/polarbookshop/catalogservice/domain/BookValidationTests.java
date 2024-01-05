//package com.polarbookshop.catalogservice.domain;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.util.Set;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//
//import jakarta.validation.ConstraintViolation;
//import jakarta.validation.Validation;
//import jakarta.validation.Validator;
//import jakarta.validation.ValidatorFactory;
//
//public class BookValidationTests {
//
//	private static Validator validator;
//	
//	@BeforeAll
//	public static void setUp() {
//		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//		validator = factory.getValidator();
//	}
//	
//	@Test
//	public void whenAllFieldsCorrectThenValidationSucceeds() {
//		var book = new Book("1234567890", "Title", "Author", 9.90);
//		Set<ConstraintViolation<Book>> voilations = validator.validate(book);
//		assertThat(voilations).isEmpty();
//	}
//	
//	@Test
//	public void whenIsbnIsDefinedButIncorrectThenValidationFails() {
//		var book = new Book("%^%^%^%^%", "Title", "Author", 9.90);
//		Set<ConstraintViolation<Book>> voilations = validator.validate(book);
//		assertThat(voilations.iterator().next().getMessage()).isEqualTo("The ISBN format must be valid.");
//	}
//	
//}
