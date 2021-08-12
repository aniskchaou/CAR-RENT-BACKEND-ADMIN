package delta.dev.software.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delta.dev.software.models.client.Supplier;
import delta.dev.software.repositories.SupplierRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class SupplierService {

	/**
	 * supplierRepository
	 */
	@Autowired
	private SupplierRepository supplierRepository;

	/**
	 * getSuppliers
	 * 
	 * @return
	 */
	public List<Supplier> getSuppliers() {
		return supplierRepository.findAll();
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return supplierRepository.count();
	}

	/**
	 * save
	 * 
	 * @param supplier
	 */
	public void save(Supplier supplier) {
		supplierRepository.save(supplier);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Supplier> findById(int id) {
		return supplierRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(int id) {
		supplierRepository.delete(supplierRepository.findById(id).get());
	}
}
