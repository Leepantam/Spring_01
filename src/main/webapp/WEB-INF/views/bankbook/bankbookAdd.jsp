<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


</head>
<body>

	<div class="container">
		<div class="row">
			<h1>BankBookWrite Page</h1>
			<form class="form-horizontal" action="./bankbookAdd"
				method="post">
				<div class="form-group">
					<label class="control-label col-sm-2" for="account_name">NAME:</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="account_name"
							placeholder="Enter account_name" name="account_name">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="interest_rate">RATE:</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="interest_rate"
							placeholder="Enter interest_rate" name="interest_rate">
					</div>
				</div>

				<div class="form-group">
					<label for="sel1">Select list:</label> <select class="form-control"
						id="can_make" name='can_make'>
						<option>Y</option>
						<option>N</option>
					</select>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">ABLE:</button>
					</div>
				</div>
			</form>
		</div>
	</div>

</body>
</html>