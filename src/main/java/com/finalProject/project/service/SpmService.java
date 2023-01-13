package com.finalProject.project.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.finalProject.project.dao.ISpmDAO;
import com.finalProject.project.model.spmVO;

@Service
public class SpmService implements ISpmService {
	@Autowired
	@Qualifier("ISpmDAO")
	private ISpmDAO dao;

	@Override
	public ArrayList<spmVO> listSupplement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public spmVO spmDetail(String spmName) {
		return dao.spmDetail(spmName);
	}

	@Override
	public ArrayList<spmVO> ctgListSpm(String spmCtg) {
		return dao.ctgListSpm(spmCtg);
	}

}
