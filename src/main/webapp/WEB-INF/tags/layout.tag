<%@ tag language="java" pageEncoding="UTF-8"%>
<!-- 调用该tag时还需传参title以指定页面标题 -->
<%@ attribute name="title" required="true"%>
<%@ attribute name="css" fragment="true" %><!-- fragment设为true意味着该参数的值是标记片段 -->
<%@ attribute name="js" fragment="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
		<title>${title}</title>
		<jsp:invoke fragment="css"></jsp:invoke>
		<style>
			.menu {
				display: inline-block;
			}
		</style>
	</head>
	<body>
	<div class="header">
	
		<sec:authorize access="hasAnyAuthority('Limi_CELLPHONE_RW','Limi_CELLPHONE_RO')">
		<ul class="menu">
			<li><a href="">-手机商城首页-</a></li>			
			<li><a href="${contextPath }/cellphones/">手机列表</a></li>			
			<sec:authorize access="hasAuthority('Limi_CELLPHONE_RW')">
			<li><a href="${contextPath }/cellphones/cellphone-edit">添加手机信息</a></li>
			</sec:authorize>
			<sec:authorize access="hasAuthority('Limi_CELLPHONE_RW')">
			<li><a href="${contextPath }/cellphones/cellphone-select">查询手机信息</a></li>
			</sec:authorize>
			<sec:authorize access="hasAuthority('Limi_CELLPHONE_RW')">
			<li><a href="${contextPath }/customer-list">查询顾客会员信息</a></li>
			</sec:authorize>
		</ul>
		</sec:authorize>
		
		
		
		<sec:authorize access="isAnonymous()">
		<%-- <sec:authentication property="principal.username" var="o_username" scope="session"/>
		<sec:authentication property="principal.operator.email" var="o_email"/> --%>
		<ul class="menu">
		
			<li><a href="">您好，欢迎来来首页！</a></li>			
			 <!-- springsecurity默认的退出路径是：POST /logout，注意：springsecurity自带处理 -->
			<li>	
				<form action="${contextPath }/login" method="post">
					<sec:csrfInput/>
					<button type="submit">登录</button>
				</form>
			</li>
			<li>	
				<form action="${contextPath }/login" method="post">
					<sec:csrfInput/>
					<button type="submit">注册</button>
				</form>
			</li>
		</ul>
		</sec:authorize>
		<sec:authorize access="isAuthenticated()">
		<sec:authentication property="principal.username" var="o_username" scope="session"/>
		<sec:authentication property="principal.operator.email" var="o_email"/>
		<ul class="menu">		
			<li><a href="">--当前用户--</a></li>
			<!--  principal属性可以拿到当前登录的用户详情（UserDetailsImpl） -->
			<li>用户名：<a href="">【${o_username }】</a></li>			
			
			<c:choose>	
				<c:when test="${o_email!=null }">
					<li>邮　箱：<a href="">【${o_email }】</a></li>
				</c:when>
				<c:otherwise>
					<li>邮　箱：<a href="">【未登记邮箱】</a></li>
				</c:otherwise>
			</c:choose>	
			<li>
			 <!-- springsecurity默认的退出路径是：POST /logout，注意：springsecurity自带处理 -->
				<form action="${contextPath }/logout" method="post">
					<sec:csrfInput/>
					<button type="submit">注销</button>
				</form>
			</li>
		</ul>
		</sec:authorize>
		
		
	</div>
	<hr>
	<div class="content">
		<!-- 取tag参数值 -->
		<h2>${title }</h2>
		<!-- 把layout标签的内容插入到此处 -->
		<jsp:doBody></jsp:doBody>
	</div>
	<hr>
	<div class="footer">
		copyright@ 2018
		<jsp:invoke fragment="js"></jsp:invoke>
	</div>
	
	
	</body>
</html>