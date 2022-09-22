<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br />
	<div class="d-flex justify-content-end">
		<div style="width: 300px">
			<form class="d-flex" method="get" action="/">
				<input class="form-control me-2" type="text" placeholder="Search" name="keyword">
				<button class="btn btn-primary" type="submit">Search</button>
			</form>
		</div>
	</div>

	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>선수이름</th>
				<th>포지션</th>
				<th>구단</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="player" items="${player}">
				<tr>
					<td>${player.id}</td>
					<td><a href="/boards/${player.id}">${player.playername}</a></td>
					<td>${player.position}</td>
					<td>${player.teamId}</td>
					<td><input id="remember" class="form-check-input" type="checkbox">	</label></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</div>

<%@ include file="../layout/footer.jsp"%>