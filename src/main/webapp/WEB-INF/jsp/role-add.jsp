<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath} }" ></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>添加角色</title>
<link href="${contextPath}/assets/css/add-error.css" rel="stylesheet">
</head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body>
	<h2>添加角色</h2>
	<fieldset>
		<legend>添加角色</legend>
		<!--action为空意味着会提交到当前表单页面的路径-->
		<form:form action="" method="post" commandName="roleForm">
		<div>
			<label for="role_name">角色名：</label>
			<form:input type="text" path="role_name" id="role_name"/>
			<form:errors path="role_name" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="role_desc">描　述：</label>
			<form:textarea path="role_desc" id="role_desc"/>
			<form:errors path="role_desc" cssClass="add-error"></form:errors>
		</div>
		<div>
			<label for="limitsIds" >权　限：</label>
			
			<form:select path="limitsIds" id="limitsIds" >
			 	<form:option value="" label="--请选择权限--" />
				<form:options items="${limitsOptions}" 
                   			  itemLabel="limits_name" 
                   			  itemValue="limits_id"
                   			  />                   
      		</form:select>
		</div>
		<div>
			<button type="submit">提交</button>
		</div>
		</form:form>
	
	</fieldset>
</body>
</html>