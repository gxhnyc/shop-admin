package shopadmin.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.transaction.annotation.Transactional;

import shopadmin.entity.Cellphone;
import shopadmin.entity.CellphoneForm;

@Transactional
public interface CellphoneService {
	//----------------------------查询-----------------------------------
	/**
	 * 列出所有手机
	 * @return
	 */
	public List<Cellphone> findAll();
	/**
	 * 通过型号查询手机（同型号手机可能有多个颜色或者多个存储容量版本）
	 * @return
	 */
	public List<Cellphone> findByModel(String model);
	/**
	 * 通过手机id查询
	 * @param cp_id
	 * @return
	 */
	public Cellphone findByID(String cp_id);
	/**
	 * 通过颜色查询手机
	 * @param color
	 * @return
	 */
	public List<Cellphone> findByColor(String color);
	/**
	 * 通过手机运行内存查询
	 * @param ram
	 * @return
	 */
	public List<Cellphone> findByRam(Integer ram);
	/**
	 * 通过手机存储容量查询
	 * @param storage
	 * @return
	 */
	public List<Cellphone> findByStorage(Integer storage);
	//-----------------------------新增----------------------------
	/**
	 * 新增一个手机
	 * @param cellphone
	 */
	public void createOne(Cellphone cellphone);
	//-----------------------------删除-----------------------------
	/**
	 * 通过手机id删除手机
	 * @param id
	 */
	public void deleteOne(String id);
	/**
	 * 更新手机信息
	 * @param cellphone
	 */
	public void updateOne(Cellphone cellphone);
	/**
	 * 模糊查询
	 * @param cellphone
	 * @return
	 */
	public List<Cellphone> fuzzyQuery(Cellphone cellphone);
	
	
}
