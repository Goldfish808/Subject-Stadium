package site.metacoding.red.domain.player;

import java.util.List;

public interface PlayerDao {
	public void insert();
	public List<Player> findAll();
	public Player findById(Integer id);
	public void update(Player deadList);
	public void deleteById(Integer id);
}
