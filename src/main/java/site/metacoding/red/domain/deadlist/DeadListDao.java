package site.metacoding.red.domain.deadlist;

import java.util.List;

public interface DeadListDao {
	public void insert();
	public List<DeadList> findAll();
	public DeadList findById(Integer id);
	public void update(DeadList deadList);
	public void deleteById(Integer id);
}
