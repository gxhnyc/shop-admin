package shopadmin.service;

import java.util.List;

import shopadmin.entity.Role;


public interface RoleService {
	/**
	 * 查询出所有的角色
	 * @return List<Role>
	 */
	public List<Role> findAllOptions();

	public Role findOne(Long id);

	public void create(Role role);

	public void deleteOne(Long id);

	public Role findOneToEdit(Long id);
	public void update(Role ro);
}
