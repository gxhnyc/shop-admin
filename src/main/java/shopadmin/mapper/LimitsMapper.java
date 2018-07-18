package shopadmin.mapper;

import java.util.List;

import shopadmin.entity.Limits;




public interface LimitsMapper {
	
	/**
	 * 查找所有权限
	 * @return
	 */
	public List<Limits> findAllOptions();
}
