package whoami.boyinjeju.example.base.service;

import org.springframework.stereotype.Service;

@Service
public class DefaultService {
	
	public int errorTest (int dividend, int divisor) {
		return dividend / divisor;
		
	}

}
