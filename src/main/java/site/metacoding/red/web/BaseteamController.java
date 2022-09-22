package site.metacoding.red.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.service.BaseteamService;

@RequiredArgsConstructor
@Controller
public class BaseteamController {
	private final BaseteamService baseteamService;
	
	@GetMapping("/baseteam/{id}")
	public String findTeam(@PathVariable Integer id) {
		baseteamService.구단찾기(id);
		return "baseteam/team";
	}
}
