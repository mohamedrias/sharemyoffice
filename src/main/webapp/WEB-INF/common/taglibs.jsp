<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<%-- <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
if(session.getAttribute("userid") == null){
    response.sendRedirect("index");
}
    response.setHeader("Pragma","no-cache"); 
    response.setHeader("Cache-Control","no-store"); 
    response.setHeader("Expires","0"); 
    response.setDateHeader("Expires",-1); 

%>