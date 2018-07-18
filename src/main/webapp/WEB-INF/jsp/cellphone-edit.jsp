<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>
<c:set var="title" value="${cellphone.cp_id !=null?'修改手机信息':'添加新的手机'}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>${title}</title>
<link href="${contextPath}/assets/css/add-error.css" rel="stylesheet">
</head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body>
	<h2>${title }</h2>
	<fieldset>
		<legend>${title } ${cp_id }</legend>
		<!--action为空意味着会提交到当前表单页面的路径-->
		<form:form action="" method="post" commandName="cellphone">
		<div>
			<label for="cp_brand">手机品牌：</label>
			<form:input type="text" path="cp_brand" id="cp_brand"/>
			<form:errors path="cp_brand" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="cp_model">手机型号：</label>
			<form:input type="text" path="cp_model" id="cp_model"/>
			<form:errors path="cp_model" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="cp_os">操作系统：</label>
			<form:input type="text" path="cp_os" id="cp_os"/>
			<form:errors path="cp_os" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="cp_cpu">CPU型号：</label>
			<form:input type="text" path="cp_cpu" id="cp_cpu"/>
			<form:errors path="cp_cpu" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="cp_ram">运行内存：</label>
			<form:input type="text" path="cp_ram" id="cp_ram"/>MB
			<form:errors path="cp_ram" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="cp_storage">存储容量：</label>
			<form:input type="text" path="cp_storage" id="cp_storage"/>MB
			<form:errors path="cp_storage" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="cp_color">手机颜色：</label>
			<form:input type="text" path="cp_color" id="cp_color"/>
			<form:errors path="cp_color" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="cp_price">手机价格：</label>
			<form:input type="text" path="cp_price" id="cp_price"/>分
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
</body>
</html>