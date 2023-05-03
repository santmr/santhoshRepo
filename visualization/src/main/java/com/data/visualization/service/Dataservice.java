package com.data.visualization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.data.visualization.model.Data;
import com.data.visualization.pojo.Datapojo;
import com.data.visualization.repository.Datarepository;

@Service
public class Dataservice implements DataAservice {

	@Autowired
	Datarepository datarepository;

	@Override
	public void saveDetails(Datapojo datapojo) throws Exception {
		// TODO Auto-generated method stub

		String fileName = StringUtils.cleanPath(datapojo.getMultipart().getOriginalFilename());
		try {
			if (fileName.contains("..")) {
				throw new Exception("Filename contains invalide path" + fileName);

			}
			Data da = new Data();
			da.setId(datapojo.getId());
			da.setFileData(datapojo.getMultipart().getBytes());
			da.setFileType(datapojo.getMultipart().getContentType());
			da.setFileName(fileName);
			datarepository.save(da);

		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("file could not saved");
		}

	}

}
