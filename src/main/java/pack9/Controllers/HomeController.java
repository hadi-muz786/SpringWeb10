package pack9.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import paccck9.HomeService;
import pacck9.HouseRqo;

@Controller
public class HomeController {
	private HomeService homeserv;

	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView resultAll() {
		System.out.println("Hey this is my Home");
		HouseRqo hr = homeserv.AllSrvice();
		System.out.println(hr.toString());

		ModelAndView mvn = new ModelAndView("home");
		mvn.addObject("bj", hr);
		mvn.addObject("name", "Abdul HDMR");

		return mvn;
	}
		
		@RequestMapping(value = "home", method = RequestMethod.GET)
		public ModelAndView resulHome 															() {
			System.out.println("Hey this is my Home");

			HouseRqo hr = homeserv.AllSrvice();
			System.out.println(hr.toString());

			ModelAndView mvn = new ModelAndView("home");
			mvn.addObject("bj", hr);
			mvn.addObject("name", "Abdul HDMR");

			return mvn;
			
			
			
		
		
		
		
		
		
		
	}

	public HomeService getHomeserv() {
		return homeserv;
	}

	public void setHomeserv(HomeService homeserv) {
		this.homeserv = homeserv;
	}

}
