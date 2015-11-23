package org.pcsworld.minecraftseeds.service;

import java.util.Date;
import java.util.List;

import org.pcsworld.minecraftseeds.model.Seed;
import org.pcsworld.minecraftseeds.model.SeedsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("seedsService")
public class SeedsService {
	private SeedsDao seedsDao;


	@Autowired
	public void setSeedsDao(SeedsDao seedsDao) {
		this.seedsDao = seedsDao;
	}

	public void create(Seed seed) {
		Date created = new Date();
		Date lastModified = new Date();
		seed.setCreated(created);
		seed.setLastModified(lastModified);
		//seed.setSubmitter("pc");
		System.out.println(seed.toString());
		seedsDao.create(seed);
		
	}
	
	public List<Seed> getCurrent(){
		return seedsDao.getSeeds();
	}

}
