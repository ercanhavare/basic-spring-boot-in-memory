package kodlama.io.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service // bu siinif business nesnesidir
public class BrandManager implements BrandService{

	private BrandRepository brandRepository;
		
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		//super();
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getAll() {
		//is kurallari
		return brandRepository.getAll();
	}
	
}
