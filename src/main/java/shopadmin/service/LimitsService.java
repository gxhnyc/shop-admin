package shopadmin.service;

import java.util.List;

import shopadmin.entity.Limits;

public interface LimitsService {
	/**
	 * 查找所有权限
	 * @return
	 */
	public List<Limits> findAllOptions();
}
