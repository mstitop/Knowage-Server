<%@ page language="java" pageEncoding="utf-8" session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="eventModule">
<head>

<%@include file="/WEB-INF/jsp/commons/angular/angularResource.jspf"%>
<!-- angular imports -->
<%@include file="/WEB-INF/jsp/commons/angular/angularImport.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="/WEB-INF/jsp/commons/angular/eventLogsImport.jsp" %>

<!-- Styles -->
<link rel="stylesheet" type="text/css"
	href="<%=urlBuilder.getResourceLink(request, "themes/commons/css/customStyle.css")%>">
</head>

<body ng-controller="eventController" class="bodyStyle kn-usersManagement">

<!-- 	<div ng-repeat="(key,value) in events">{{key}} - {{value}}</div> -->

<angular-list-detail show-detail="showDetail">
	<list label="Events" >
	
		<angular-table
		flex
		id="events_id"
		ng-model="events"
		columns='[
			{"label":"User","name":"user"},
			{"label":"Date","name":"date"},
			{"label":"Type","name":"type"}
		]'
		highlights-selected-item=true
		click-function="loadDetail(item)"
		>
		
		</angular-table>
	
	</list>
	<detail>
	
			<md-input-container>
			  <label>User</label>
			  <input type="text" ng-model="selectedDetail.user">
			</md-input-container>
			
			<md-input-container>
			  <label>Date</label>
			  <input type="text" ng-model="selectedDetail.date">
			</md-input-container>
			
			<md-input-container>
			  <label>Type</label>
			  <input type="text" ng-model="selectedDetail.type">
			</md-input-container>
			
			<md-input-container>
			  <label>Description</label>
			  <input type="text" ng-model="selectedDetail.desc">
			</md-input-container>
			
			
	
	</detail>
</angular-list-detail>
	
<!-- 	<div style="border: 1px solid red;" ng-repeat="i in events"> -->
<!-- 		ID: {{i.id}}  -->
<!-- 		<br>  -->
<!-- 		USER: {{i.user}}  -->
<!-- 		<br>  -->
<!-- 		DATE: {{i.date}}  -->
<!-- 		<br>  -->
<!-- 		TYPE: {{i.type}}  -->
<!-- 		<br>  -->
<!-- 		DESC: {{i.desc}} -->
		
<!-- 	</div> -->


</body>
</html>