package com.poseidon.web;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
		
		return "home";
	}
	
	@RequestMapping(value="/home") //페이지를열어
	public String home() {
		return "home2";
	}
	
	@RequestMapping("main") //값보낼떄
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView("main"); //jsp파일명
		
		//리스트 list = 10~100담기
		
		List<Integer>list = new ArrayList<Integer>();
		for (int i = 1; i <=10; i++) {
			list.add(i*10);
		}
		mv.addObject("list", list);
		
		mv.addObject("mame", "홍길동"); //앞은 이름 뒤는 값 : 객체보내기
		//마네라는 이름으로 홍길동값을 메인에 보낼거임
		return mv;
		//디스패처랑 모양 같음 리턴값꼭있어야하나? 보이드가 없네..
		
	}
	
	
}
