<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>
<c:set var="title" value="${cellphone.cp_id !=null?'修改手机信息':'添加新的手机'}"></c:set>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<t:layout title="${title }">

	<jsp:attribute name="css">
		<link href="${contextPath}/assets/css/add-error.css" rel="stylesheet">
	</jsp:attribute>
	<jsp:attribute name="js">
		<script>
			console.log("手机列表");
		</script>
	</jsp:attribute>
	<jsp:body>
	<fieldset>
		<legend>${title } ${cp_id }</legend>
		<!--action为空意味着会提交到当前表单页面的路径-->
		<form:form action="" method="post" commandName="cellphone">
		<div>
			<label for="cp_brand">手机品牌：</label>
			<form:select path="cp_brand">
				<form:option value="" >-请选择品牌-</form:option>
				<form:option value="APPLE" >APPLE</form:option>
				<form:option value="HUWEI" >HUWEI</form:option>
				<form:option value="OPPO" >OPPO</form:option>
				<form:option value="VIVO" >VIVO</form:option>
				<form:option value="XIAOMI" >XIAOMI</form:option>
				<form:option value="HUNMER" >HUNMER</form:option>
				<form:option value="SUMSANG" >SUMSANG</form:option>
				<form:option value="NOKIA" >NOKIA</form:option>
				<form:option value="HTC" >HTC</form:option>
			</form:select>
			<form:errors path="cp_brand" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="cp_model">手机型号：</label>		
			<form:select path="cp_model">
				<form:option value="" >-请选择型号-</form:option>
				<form:option value="APPLE" >APPLE</form:option>
				<form:option value="HUWEI" >HUWEI</form:option>
				<form:option value="OPPO" >OPPO</form:option>
				<form:option value="VIVO" >VIVO</form:option>
				<form:option value="XIAOMI" >XIAOMI</form:option>
				<form:option value="HUNMER" >HUNMER</form:option>
				<form:option value="SUMSANG" >SUMSANG</form:option>
				<form:option value="NOKIA" >NOKIA</form:option>
				<form:option value="HTC" >HTC</form:option>
			</form:select>
			<form:errors path="cp_model" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="cp_os">操作系统：</label>
			<form:select path="cp_os">
				<form:option value="" >-请选择系统-</form:option>
				<form:option value="APPLE" >APPLE</form:option>
				<form:option value="HUWEI" >HUWEI</form:option>
				<form:option value="OPPO" >OPPO</form:option>
				<form:option value="VIVO" >VIVO</form:option>
				<form:option value="XIAOMI" >XIAOMI</form:option>
				<form:option value="HUNMER" >HUNMER</form:option>
				<form:option value="SUMSANG" >SUMSANG</form:option>
				<form:option value="NOKIA" >NOKIA</form:option>
				<form:option value="HTC" >HTC</form:option>
			</form:select>
			<form:errors path="cp_os" cssClass="add-error"></form:errors>
		</div>
		<div>
		
			<label for="cp_cpu">CPU型号：</label>
			<form:select path="cp_cpu">
				<form:option value="" >-请选择CPU-</form:option>
				<form:option value="APPLE" >APPLE</form:option>
				<form:option value="HUWEI" >HUWEI</form:option>
				<form:option value="OPPO" >OPPO</form:option>
				<form:option value="VIVO" >VIVO</form:option>
				<form:option value="XIAOMI" >XIAOMI</form:option>
				<form:option value="HUNMER" >HUNMER</form:option>
				<form:option value="SUMSANG" >SUMSANG</form:option>
				<form:option value="NOKIA" >NOKIA</form:option>
				<form:option value="HTC" >HTC</form:option>
			</form:select>
			<form:errors path="cp_cpu" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="cp_cpu_cores">CPU内核：</label>
			<form:input type="number" min="0" max="16" placeholder="4" path="cp_cpu_cores" id="cp_cpu_cores"/>核
			<form:errors path="cp_price" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="cp_ram">运行内存：</label>
			<form:input type="number" min="0" max="1024" placeholder="8" path="cp_ram" id="cp_ram"/>GB
			<form:errors path="cp_ram" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="cp_storage">存储容量：</label>
			<form:input type="number" min="0" max="1024" placeholder="16"  path="cp_storage" id="cp_storage"/>GB
			<form:errors path="cp_storage" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="cp_color">手机颜色：</label>
			<form:select path="cp_cpu">
				<form:option value="" >-请选择颜色-</form:option>
				<form:option value="APPLE" >APPLE</form:option>
				<form:option value="HUWEI" >HUWEI</form:option>
				<form:option value="OPPO" >OPPO</form:option>
				<form:option value="VIVO" >VIVO</form:option>
				<form:option value="XIAOMI" >XIAOMI</form:option>
				<form:option value="HUNMER" >HUNMER</form:option>
				<form:option value="SUMSANG" >SUMSANG</form:option>
				<form:option value="NOKIA" >NOKIA</form:option>
				<form:option value="HTC" >HTC</form:option>
			</form:select>
			<form:errors path="cp_color" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="cp_price">手机价格：</label>
			<form:input type="number" min="0" max="10000000" placeholder="100000" path="cp_price" id="cp_price"/>分
			<form:errors path="cp_price" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="cp_description">描　述：</label>
			<form:textarea path="cp_description" id="cp_description" cols="30" rows="5"/>
			<form:errors path="cp_description" cssClass="add-error"></form:errors>
		</div>
		
		<div>
			<c:if test="${title=='修改手机信息' }">
				<button type="submit">修改</button>
			</c:if>
			<c:if test="${title=='添加新的手机' }">
				<button type="submit">添加</button>
			</c:if>
			
		</div>
		</form:form>
	
	</fieldset>
	</jsp:body>

</t:layout>
