package site.metacoding.red.domain.baseteam;

import java.util.List;

public interface BaseTeamDao {
	public void insert();
	public List<BaseTeam> findAll();
	public BaseTeam findById(Integer id);
	public void update(BaseTeam baseTeam);
	public void deleteById(Integer id);
	public void updateByTeamId(Integer teamId);
}
