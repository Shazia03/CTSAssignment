package com.cts.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cts.model.Department;
import com.cts.model.Employee;
import com.cts.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService
{
	private List<Department> deptList;
	public DepartmentServiceImpl()
	{
		deptList=new ArrayList<Department>();
	}

	@Override
	public boolean add(Department d) {
		if(get(d.getDeptId())!=null)
		{
			return false;
		}
		deptList.add(d);
		return true;
		
	}

	@Override
	public boolean update(Department d)
	{
		if(get(d.getDeptId())==null)
		{
			deptList.add(d);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean delete(int id) {
		Department d =get(id);
		if(d!=null)
		{
			deptList.remove(d);
			return true;
		}
		return false;
	}

	@Override
	public Department get(int id) {
		for(Department d:deptList)
		{
			if(d.getDeptId()==id)
				return d;
		}
		return null;
	}

	@Override
	public List<Department> get() {
		
		return deptList;
	} 

	@Override
	public boolean add(Employee e, Department d)
	{ 
			if(get(d.getDeptId())!=null&&(get(e.getId())!=null))
			{
				return false;
			}
		deptList.add(d);
		return true;
	}

	@Override
	public boolean remove(Employee e, Department d)
	{
		
		return false;
	}

	@Override
	public List<Department> getEmployees(int deptId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> getEmployees(int deptId, int amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> getEmployees(int deptId, int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
