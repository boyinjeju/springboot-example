package whoami.boyinjeju.example.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import whoami.boyinjeju.example.base.service.DefaultService;

@RestController
@RequestMapping(value={"/", ""})
public class DefaultRestController {
	
	@Autowired
	private DefaultService defaultService;
	
	@GetMapping
	public ResponseEntity<HttpStatus> home() {
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/error-test")
	public ResponseEntity<Integer> errorTest() {
		return ResponseEntity.ok(defaultService.errorTest(100, 0));
	}

}
