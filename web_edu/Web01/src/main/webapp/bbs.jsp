<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "java.io.PrintWriter" %>  <!-- 출력 도와주는 객체 -->
<%@ page import = "bbs.Bbs" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "bbs.BbsDAO" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<title>게시판</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
	crossorigin="anonymous"></script>
</head>
<body class="text-left">
	<jsp:include page="header.jsp"></jsp:include>
	
	<div class="container">
		<div class="row">
			<table>
				<thead>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>				
				</thead>
				<tbody>

					<%
						int pageNum = 1;
						if(request.getParameter("pageNum") != null){
							// 게시판 목록 화면에 이미 페이지 번호 요청값이 있다면
							pageNum = Integer.parseInt(request.getParameter("pageNum"));
						}
						BbsDAO bbsDAO = new BbsDAO();
						out.println("현재 페이지 : " + pageNum);
						ArrayList<Bbs> list = bbsDAO.getList(pageNum);
						for(int i=0; i<list.size(); i++){
							
					%>
					
					<tr>
						<td><%= list.get(i).getBbsID() %></td>
						<td><%= list.get(i).getBbsTitle() %></td>
						<td><%= list.get(i).getWriter() %></td>
						<td><%= list.get(i).getCrDate() %></td>
					</tr>
					
					<%
					
						};
						
					%>
				</tbody>	
			</table>
		</div>
		<div class="col-11">
			<a href="write.jsp" class="btn btn-primary float-end">Write</a>
		</div>
	</div>

</body>
</html>