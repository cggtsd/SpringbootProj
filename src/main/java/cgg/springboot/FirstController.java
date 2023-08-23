package cgg.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "This is testing spring boot...";
	}
}
