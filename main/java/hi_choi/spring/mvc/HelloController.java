package hi_choi.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
// 컨트롤러 생성
// jsp는 바로 실행할 수 없다. 컨트롤러가 매핑하는 방식으로 실행
// 실행방식은 spring\appServlet\servlet-context.xml형식에 지정되어 있음
@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		// 모델 객체 생성후 jsp 파일에 보낼 메시지 생성
		model.addAttribute("msg","스프링5 안녕~");
		
		// /WEB-INF/views/리턴값.jsp 
		return "hello";
		
	}
	
	
}

