package site.metacoding.red.domain.baseteam;

import java.security.Timestamp;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BaseTeam {
	private Integer id;
	private String teamname;
	private Timestamp createdAt;

}
