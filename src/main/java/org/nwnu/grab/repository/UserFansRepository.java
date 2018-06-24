package org.nwnu.grab.repository;


import org.nwnu.grab.domain.UserFans;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 * 
 * @author dusk
 *
 */

//@RepositoryDefinition(domainClass = UserFans.class, idClass = Integer.class)
public interface UserFansRepository extends Repository<UserFans,Integer>{
	
	public void save(UserFans userFans);
	
	public UserFans findByUid(Integer uid);
	
}
