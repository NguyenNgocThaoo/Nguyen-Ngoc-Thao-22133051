<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/
bootstrap.min.css"
	rel="stylesheet">
<title>Đăng nhập tài khoản</title>


	<header class="row">
		<div class="col">
			<div class="alert alert-primary col" align="center" >
				<h1>Đăng nhập tài khoản</h1>
			</div>
		</div>
	</header>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-12 col-md-5">
				<form action="/Helloworld/forget-password" method="post">
					<div class="form-group">
						<label for="email">Username:</label> <input type="text" id="username"
							name="username" class="form-control" />
					</div>
					<div class="form-group mt-3" align="center">
						<button type="submit" class="btn btn-primary">Xác nhận</button>
					</div>
				</form>
			</div>
		</div>
	</div>
