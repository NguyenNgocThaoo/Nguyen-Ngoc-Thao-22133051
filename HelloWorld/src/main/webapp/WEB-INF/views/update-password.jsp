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

	<header class="row">
		<div class="col">
			<div class="alert alert-primary col" align="center" >
			</div>
		</div>
	</header>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-12 col-md-5">
				<form action="/Helloworld/update-password" method="post">
					<div class="form-group">
						<label for="password">Mật khẩu mới: </label> <input type="password"
							id="password" name="password" class="form-control" 
							placeholder="Mật khẩu mới" required>
					</div>
					<div class="mb-3">
								<label for="confirmPassword" class="form-label">Nhập lại
									mật khẩu</label> <input type="password" class="form-control"
									id="confirmPassword" name="confirmPassword"
									placeholder="Nhập lại mật khẩu" required>
					</div>
					<div class="form-group mt-3" align="center">
						<button type="submit" class="btn btn-primary">Xác nhận</button>
					</div>
				</form>
			</div>
		</div>
	</div>
