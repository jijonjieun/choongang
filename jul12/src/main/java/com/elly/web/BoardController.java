package com.elly.web;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	//서비스와 연결하기 = Autowired
	
	@Autowired
	private BoardService boardService;
	
	

	//메소드 하나로 흐름제어 하나함.
	//사용자의 어떤요청이 들어오면 어떤일을 하겠습니다.
	@RequestMapping(value = "/main")
	public String main() {//위 문장과 연결되어서 메인이라는 요청이 들어오면
		return"main"; //jsp파일명 //아래 해당 jsp파일을 열어줍니다.
	}
	
	
	@GetMapping("/board")
	public ModelAndView board() {
		//model	and view
		ModelAndView mv = new ModelAndView("board");
		mv.addObject("name","홍길동");
		return mv;
	}
	
	
}
