<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!doctype html>
<html lang="ko">
<head>
<title></title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
</head>
<body>
<jsp:include page="navbar.jsp">
	<jsp:param name="menu" value="로그인"/>
</jsp:include>
<div class="container">
	<div class="row">
		<div class="col-12">
			<h1>아이디, 비밀번호를 입력하고 로그인하세요</h1>
		</div>
	</div>		
   			
   	<div class="row">
		<div class="col-12">
   			<form class="border bg-light p-3" name="form" method="post" action="login.hta">   				
   				<div class="form-group mb-2 w-75">
   					<label class="form-label">아이디</label>
   					<input type="text" class="form-control" id="id" name="id" />
   				</div>
   				<div class="form-group mb-2 w-75">
   					<label class="form-label">비밀번호</label>
   					<input type="password" class="form-control" id="password" name="password" />
   				</div>
   				<div class="text-end mb-3 w-75">		
   					<button type="submit" class="btn btn-primary">로그인</button>
   				</div>
   			</form>
		</div>
	</div>	
</div>
</body>
</html>