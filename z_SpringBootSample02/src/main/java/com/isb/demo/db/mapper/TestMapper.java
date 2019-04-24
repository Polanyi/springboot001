package com.isb.demo.db.mapper;

import java.util.List;

import com.isb.demo.db.dto.Test;

public interface TestMapper {

	public List<Test> getAll() throws Exception;
	
}
