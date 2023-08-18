package study.datajap.repository;

import org.springframework.data.repository.CrudRepository;
import study.datajap.entity.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {


}
