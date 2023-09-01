package whoami.boyinjeju.example.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(RuntimeException.class)
	protected ResponseEntity<?> handleException(RuntimeException e) {
		e.printStackTrace();
		
		final ErrorResponse errorResponse = ErrorResponse.builder()
				.code("RuntimeException occurred")
				.message(e.getLocalizedMessage()).build();
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
	}
	
	@ExceptionHandler(Exception.class)
	protected ResponseEntity<?> handleException(Exception e) {
		e.printStackTrace();
		
		final ErrorResponse errorResponse = ErrorResponse.builder()
				.code("Exception occurred")
				.message(e.getLocalizedMessage()).build();
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
		
		
		// return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // no body
		
	}
	

}
