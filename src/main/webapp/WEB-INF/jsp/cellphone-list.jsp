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
		<c:forEach items="${cellphones}" var="cellphone">
			<ul>
				<li>${cellphone.cp_id}-【品牌：${cellphone.cp_brand }】-
					<a href="${contextPath }/cellphones/cellphone-details/${cellphone.cp_id}">
					【型号：${cellphone.cp_model}】</a>
					【￥：${cellphone.cp_price/100}】
					
					<sec:authorize access="hasAuthority('Limi_CELLPHONE_RW')">
						<a href="${contextPath }/cellphones/cellphone-edit/${cellphone.cp_id}">【修改】</a>
					</sec:authorize>
					<sec:authorize access="hasAuthority('Limi_CELLPHONE_RW')">	
						<a href="${contextPath }/cellphones/cellphone-delete/${cellphone.cp_id}">【删除】</a>	
					</sec:authorize>	
				</li>
			</ul>
		</c:forEach>
	</ul>

</t:layout>
