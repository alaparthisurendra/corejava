package info.inetsolv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="/fc")
public class Firstcontoller {
	
	@RequestMapping(method=RequestMethod.GET)
	public String Dosomework()
	{
		System.out.println("Dosomework()");
		return "one";
	}

}
