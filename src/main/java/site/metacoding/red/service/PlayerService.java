package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.player.PlayerDao;

@RequiredArgsConstructor
@Service
public class PlayerService {
	
	private final PlayerDao playerDao;
	
	public List<Player> 목록보기() {
		List<Player> playerList = playerDao.findAll();
		System.out.println("실행됨?"+playerList.size());
	
		
		return playerList;
	}

	public Player 상세보기(Integer id, Integer principalId) {
		return playerDao.findById(id);
	}

	public void 수정하기(Integer id) {
	}

	public void 삭제하기(Integer id) {
		
	}

	public void 추가하기() {
		
	}

}
