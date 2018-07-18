<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%-- 调用布局，内容将插入布局的content区域 --%>
<t:layout title="手机查询">	
			<fieldset>
				<legend><h4>手机查询</h4></legend>
				<!--action为空意味着会提交到当前表单页面的路径-->
				<form:form action="" method="post" commandName="cellphone">
				<div>
					<label for="cp_id">手机　ID：</label>
					<form:input type="text" path="cp_id" id="cp_id"/>
				</div>
				<div>
					<label for="cp_brand">手机品牌：</label>
					<form:input type="text" path="cp_brand" id="cp_brand"/>
				</div>
				<div>
					<label for="cp_model">手机型号：</label>
					<form:input type="text" path="cp_model" id="cp_model"/>
				
				</div>
				<div>
					<label for="cp_os">操作系统：</label>
					<form:input type="text" path="cp_os" id="cp_os"/>
					
				</div>
				<div>
					<label for="cp_cpu">CPU型号：</label>
					<form:input type="text" path="cp_cpu" id="cp_cpu"/>
					
				</div>
				<div>
					<label for="cp_ram">运行内存：</label>
					<form:input type="text" path="cp_ram" id="cp_ram"/>GB
				</div>
				<div>
					<label for="cp_storage">存储容量：</label>
					<form:input type="text" path="cp_storage" id="cp_storage"/>GB
				</div>
				<div>
					<label for="cp_color">手机颜色：</label>
					<form:input type="text" path="cp_color" id="cp_color"/>
				</div>
				<div>
					<label for="cp_price">手机价格：</label>
					<form:input type="text" path="cp_price" id="cp_price"/>分
					
				</div>				
				<div>					
					<button type="submit">查询</button>					
				</div>
				</form:form>
	
			</fieldset>
	
</t:layout>
