package site.metacoding.red.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.PlayerDao;
import site.metacoding.red.service.PlayerService;

@RequiredArgsConstructor
@Controller
public class PlayerController {
	
	private final PlayerDao playerDao;
	private final PlayerService playerService;
	
	@GetMapping("/")
	public String findAll(Model model) {
		model.addAttribute("player",playerService.목록보기());
		return "player/main";
	}

}
