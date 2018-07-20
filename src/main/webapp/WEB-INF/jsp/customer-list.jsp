<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%-- 调用布局，内容将插入布局的content区域 --%>
<t:layout title="手机列表">
	
	<h2>${title}</h2>
	
	
	<ul>
		<c:forEach items="${customers}" var="customer">
			<ul>
				<li>-【会员ID：${customer.c_id}】-</li>
				<li>
					<a href="${contextPath }/customer-details/${customer.c_id}">
					【姓名：${customer.username}】</a>
				</li>
				<li>最后一次登录时间：${customer.lastdate}</li>
			</ul>
		</c:forEach>
	</ul>

</t:layout>
