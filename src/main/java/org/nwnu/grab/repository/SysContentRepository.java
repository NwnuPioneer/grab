package org.nwnu.grab.repository;


import org.nwnu.grab.domain.SysContent;
import org.springframework.data.repository.CrudRepository;


//@RepositoryDefinition(domainClass = Employee.class, idClass = Integer.class)
public interface SysContentRepository extends CrudRepository<SysContent,Integer>{
}
