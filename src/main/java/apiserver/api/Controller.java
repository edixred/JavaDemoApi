package apiserver.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/hi")
	public String wellcome() {
		String response = addNumber("S","x",1,2,3,4);
		return "welcome to DEMO : " + response;
		
	}

	private String addNumber(String param1, String param2, int n1, int n2, int n3, int n4) {
		int resp = 0;
		if(param1.equals("S")) {
			int acum1 = n3+n4;
			int acum2 = n1+n2;
			if(param2.equals("V")) {
				resp =acum1 *acum2;	
			} else {
				resp = acum1+acum2;
			}			
		} else {
			resp = n1+n2+n3+n4;
		}
		return String.valueOf(resp);
	}

	
}
