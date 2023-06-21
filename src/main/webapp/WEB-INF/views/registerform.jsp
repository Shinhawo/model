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
	<jsp:param name="menu" value="회원가입" />
</jsp:include>
<div class="container">
	<div class="row">
		<div class="col-12">
			<h1>회원가입 폼입니다.</h1>
		</div>
	</div>
	<div class="row mb-3">
		<div class="col-12">
			<form class="border bg-light p-3" method="post" action="register.hta">
				<div class="form-group mb-2">
					<label class="form-label">아이디</label>
					<input type ="text" class="form-control" name="id">
				</div>
				<div class="form-group mb-2">
					<label class="form-label">비밀번호</label>
					<input type ="text" class="form-control" name="password">
				</div>
				<div class="form-group mb-2">
					<label class="form-label">이름</label>
					<input type ="text" class="form-control" name="name">
				</div>
				<div class="form-group mb-2">
					<label class="form-label">전화번호</label>
					<input type ="text" class="form-control" name="tel">
				</div>
				<div class="form-group mb-2">
					<label class="form-label">이메일</label>
					<input type ="text" class="form-control" name="email">
				</div>
				<div class="text-end">
					<button type = "submit" class="btn btn-primary">가입</button>
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>