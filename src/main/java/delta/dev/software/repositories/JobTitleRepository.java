package delta.dev.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delta.dev.software.models.person.JobTitle;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
