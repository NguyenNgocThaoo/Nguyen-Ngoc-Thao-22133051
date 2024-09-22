<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">

<header class="row">
	<div class="col">
		<div class="alert alert-primary col" align="center">
			<h1>Đăng nhập tài khoản</h1>
		</div>
	</div>
</header>

<div class="container">
	<div class="row justify-content-center">
		<div class="col-12 col-md-5">
			<form action="/Helloworld/login" method="post">
				<div class="form-group">
					<label for="email">Username:</label> 
					<input type="text" id="username" name="username" class="form-control" />
				</div>
				<div class="form-group">
					<label for="password">Mật khẩu: </label> 
					<input type="password" id="password" name="password" class="form-control" />
				</div>
				<div class="form-group mt-3" align="center">
					<button type="submit" class="btn btn-primary">Đăng nhập</button>
				</div>
				<!-- Liên kết Quên mật khẩu -->
				<div class="form-group mt-3 text-center">
					<a href="${pageContext.request.contextPath}/forget-password">Quên mật khẩu?</a>
				</div>
			</form>
		</div>
	</div>
</div>
