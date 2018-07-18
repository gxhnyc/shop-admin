package shopadmin.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class CellphoneForm {
private String cp_id;
	
	@Size(min=2,max=128)
	private String cp_brand;
	@Size(min=2,max=128)
	private String cp_model;
	@Size(min=2,max=128)
	private String cp_os;
	@Size(min=2,max=128)
	private String cp_cpu;
	@Min(1024)
	private Integer cp_minram;//以M为单位
	private Integer cp_maxram;//以M为单位
	@Min(1024)
	private Integer cp_minstorage;//以M为单位
	private Integer cp_maxstorage;//以M为单位
	@Size(min=2,max=128)
	private String cp_color;
	@Size(max=1024)
	private String cp_description;
	@Min(100)
	private Integer cp_price;//单位：元
	public String getCp_id() {
		return cp_id;
	}
	public void setCp_id(String cp_id) {
		this.cp_id = cp_id;
	}
	public String getCp_brand() {
		return cp_brand;
	}
	public void setCp_brand(String cp_brand) {
		this.cp_brand = cp_brand;
	}
	public String getCp_model() {
		return cp_model;
	}
	public void setCp_model(String cp_model) {
		this.cp_model = cp_model;
	}
	public String getCp_os() {
		return cp_os;
	}
	public void setCp_os(String cp_os) {
		this.cp_os = cp_os;
	}
	public String getCp_cpu() {
		return cp_cpu;
	}
	public void setCp_cpu(String cp_cpu) {
		this.cp_cpu = cp_cpu;
	}
	public String getCp_color() {
		return cp_color;
	}
	public void setCp_color(String cp_color) {
		this.cp_color = cp_color;
	}
	public String getCp_description() {
		return cp_description;
	}
	public void setCp_description(String cp_description) {
		this.cp_description = cp_description;
	}
	public Integer getCp_price() {
		return cp_price;
	}
	public void setCp_price(Integer cp_price) {
		this.cp_price = cp_price;
	}
	public Integer getCp_minram() {
		return cp_minram;
	}
	public void setCp_minram(Integer cp_minram) {
		this.cp_minram = cp_minram;
	}
	public Integer getCp_maxram() {
		return cp_maxram;
	}
	public void setCp_maxram(Integer cp_maxram) {
		this.cp_maxram = cp_maxram;
	}
	public Integer getCp_minstorage() {
		return cp_minstorage;
	}
	public void setCp_minstorage(Integer cp_minstorage) {
		this.cp_minstorage = cp_minstorage;
	}
	public Integer getCp_maxstorage() {
		return cp_maxstorage;
	}
	public void setCp_maxstorage(Integer cp_maxstorage) {
		this.cp_maxstorage = cp_maxstorage;
	}
}
