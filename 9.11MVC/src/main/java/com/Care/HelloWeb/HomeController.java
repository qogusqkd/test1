package com.Care.HelloWeb;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "intro";
	}
	
	/*
	 * URL : http://localhost:8081/HelloWeb/move
	 * http: 프로토콜
	 * localhost : 도메인 주소
	 * 8081: 접속포트
	 * HelloWeb : 사용할 서비스(하나의 프로그램이라 생각)
	 * move를 포함한 이후 내용: URI
	 */
	//value는 요청받은 URI를 의미함.
	@RequestMapping(value = "/move")
	public String move() {
		logger.info("/move");
		return "move";
	}
	
	@RequestMapping(value = "/login")
	public String login(Locale locale) {
		
		return "/form/loginForm";
	}
	@RequestMapping(value = "/loginProc")
	public String loginProc(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		logger.info(id+":"+pw);
		return "home";
	}
	@RequestMapping(value = "/loginAnno")
	public String loginFormAnno() {
		
		return "/form/loginFormAnno";
	}
	@RequestMapping(value = "/loginProcAnno")
	public String loginProc(
			@RequestParam("id")String id,
			@RequestParam("pw")String pw) {

		logger.info(id+":"+pw);
		return "home";

}
}