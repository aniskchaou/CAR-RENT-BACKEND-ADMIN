package delta.dev.software.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delta.dev.software.models.person.JobTitle;
import delta.dev.software.repositories.JobTitleRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class JobTitlesService {

	/**
	 * 
	 */
	@Autowired
	private JobTitleRepository jobTitlesRepository;

	/**
	 * getJobTitless
	 * 
	 * @return
	 */
	public List<JobTitle> getJobTitless() {
		return jobTitlesRepository.findAll();
	}

}
