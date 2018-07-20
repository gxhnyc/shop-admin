package shopadmin.mapper;

import java.util.List;

import shopadmin.entity.Cellphone;
import shopadmin.entity.CellphoneForm;

public interface CellphoneMapper {
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
		/**
		 * 添加一台手机
		 * @param cellphone
		 */
		public void createOne(Cellphone cellphone);
		/**
		 * 判断手机型号是否已经存在
		 * @param cp_model
		 * @return
		 */
		public Integer modelExist(String cp_model);
		/**
		 * 更新手机信息
		 * @param cellphone
		 */
		public void updateOne(Cellphone cellphone);
		/**
		 * 通过id删除手机信息
		 * @param id
		 */
		public void deleteOne(String id);
		/**
		 * 模糊查询
		 * @param cellphone
		 * @return
		 */
		public List<Cellphone> fuzzyQuery(Cellphone cellphone);
		
}
