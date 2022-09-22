package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.baseteam.BaseteamDao;
import site.metacoding.red.domain.player.PlayerDao;
import site.metacoding.red.service.BaseteamService;
import site.metacoding.red.service.PlayerService;
import site.metacoding.red.web.dto.request.player.SaveDto;
import site.metacoding.red.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class PlayerController {
	
	private final PlayerService playerService;
	private final BaseteamService baseteamService;
	
	@GetMapping("/")
	public String findAll(Model model) {
		model.addAttribute("player",playerService.목록보기());
		model.addAttribute("teamList", baseteamService.목록보기());
		return "player/main";
	}
	
	@PostMapping("/add")
	public @ResponseBody CMRespDto<?> joinPlayer(@RequestBody SaveDto saveDto) {
		playerService.추가하기(saveDto);
		return new CMRespDto<>(1,"선수영입 성공",null);
	}
	
	@DeleteMapping("/deletePlayer")
	public @ResponseBody CMRespDto<?> deletePlayer(@RequestBody List<Integer> id) {
		for(Integer i :id) { //for each 문
			playerService.삭제하기(i);
		}
		
		
		return new CMRespDto<>(1,"선수영입 성공",null);
	}

}
