<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="login" method="POST" id="login">

		<h1>L O G I N</h1>

		<div class="container">
			<label><b>USER ID</b></label> <input type="text" name="userid">
			<label><b>USER PW</b></label> <input type="password" name="userpw">


			<button id="loginBtn">login</button>

		</div>
	</form>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

	<script>


	
		$("#loginBtn").on("click", function(event){

		$("#login").attr({action:'../music/playlist',method:'post'});

	});




</script>

</body>
</html>