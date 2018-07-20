<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CellPhone-showSelect</title>
<link href="${contextPath}/assets/css/add-error.css" rel="stylesheet">
</head>
<body>
	<h2>CellPhone-showSelect</h2>
	
		<c:forEach items="${cellphones}" var="cellphone">
			<ul>
				<li>${cellphone.cp_id}-【品牌：${cellphone.cp_brand }】-
					<a href="${contextPath }/cellphones/cellphone-details/${cellphone.cp_id}">
					【型号：${cellphone.cp_model}】</a>						
				</li>
				<li>
					【操作系统：${cellphone.cp_os }】
				</li>
				<li>
					【运行内存：${cellphone.cp_ram}GB】
				</li>
				<li>
					【存储容量：${cellphone.cp_storage}GB】
				</li>
				<li>
					【手机颜色：${cellphone.cp_color}】
				</li>
				<li>
					【手机价格：${cellphone.cp_price/100}元】
				</li>
				<li>
					<textarea rows="5" cols="30">描述：${cellphone.cp_description}...</textarea>
				</li>
				<li>
					<a href="${contextPath }/cellphones/">【返回】</a>	
				</li>
			</ul>
		
	</c:forEach>
</body>



</html>