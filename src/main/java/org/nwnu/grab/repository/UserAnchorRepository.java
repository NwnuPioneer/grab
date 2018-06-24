package org.nwnu.grab.repository;


import org.nwnu.grab.domain.UserAnchor;
import org.springframework.data.repository.CrudRepository;


//@RepositoryDefinition(domainClass = Employee.class, idClass = Integer.class)
public interface UserAnchorRepository extends CrudRepository<UserAnchor,Integer>{

}
