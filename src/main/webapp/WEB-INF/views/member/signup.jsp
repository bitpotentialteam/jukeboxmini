<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description"
	content="A front-end template that helps you build fast, modern mobile web apps.">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
<title>Material Design Lite</title>

<!-- Add to homescreen for Chrome on Android -->
<meta name="mobile-web-app-capable" content="yes">
<link rel="icon" sizes="192x192"
	href="images/touch/chrome-touch-icon-192x192.png">

<!-- Add to homescreen for Safari on iOS -->
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-title" content="Material Design Lite">
<link rel="apple-touch-icon-precomposed"
	href="apple-touch-icon-precomposed.png">

<!-- Tile icon for Win8 (144x144 + tile color) -->
<meta name="msapplication-TileImage"
	content="images/touch/ms-touch-icon-144x144-precomposed.png">
<meta name="msapplication-TileColor" content="#3372DF">

<!-- SEO: If your mobile URL is different from the desktop URL, add a canonical link to the desktop page https://developers.google.com/webmasters/smartphone-sites/feature-phones -->
<!--
        <link rel="canonical" href="http://www.example.com/">
        -->

<link
	href='//fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en'
	rel='stylesheet' type='text/css'>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://code.getmdl.io/1.2.1/material.grey-orange.min.css">
<link rel="stylesheet" href="../resources/css/styles.css">
<style>
#view-source {
	position: fixed;
	display: block;
	right: 0;
	bottom: 0;
	margin-right: 40px;
	margin-bottom: 40px;
	z-index: 900;
}
</style>
</head>

<body>
	<div
		class="demo-blog demo-blog--blogpost mdl-layout mdl-js-layout has-drawer is-upgraded">
		<main class="mdl-layout__content">
		<div class="demo-back">
			<a
				class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon"
				href="../music/playlist" title="go back" role="button"> <i
				class="material-icons" role="presentation">arrow_back</i>
			</a>
		</div>
		<div class="demo-blog__posts mdl-grid">
			<div class="mdl-card mdl-shadow--4dp mdl-cell mdl-cell--12-col">
				<div class="mdl-card__media mdl-color-text--grey-50">
					<h3>SIGN UP</h3>
				</div>
				<div class="mdl-color-text--grey-700 mdl-card__supporting-text meta">

					<!--  Form tag등, 원하는 형식을 p tag에 삽입. -->
					<div class="mdl-color-text--grey-700 mdl-card__supporting-text">

						<form action="signup" method="POST" id="signup">

							<div class="container">
							<div class="mdl-textfield mdl-js-textfield">
									<input class="mdl-textfield__input" type="text" id="userid"
										name="userid"> <label class="mdl-textfield__label"
										for="userid"><b>USER ID</b></label>
								</div>
						<button class="mdl-button mdl-js-button mdl-js-ripple-effect" id='idcheck' onclick="javascript:chkDupId();" >ID CHECK</button>
	<p>
								<div class="mdl-textfield mdl-js-textfield">
									<input class="mdl-textfield__input" type="password" id="input2"
										name="userpw"> <label class="mdl-textfield__label"
										for="input2"><b>USER PW</b></label> </p>
								</div>
							
							<p>	
								<div class="mdl-textfield mdl-js-textfield">
									<input class="mdl-textfield__input" type="text" id="input3"
										name="userpw"> <label class="mdl-textfield__label"
										for="input3"><b>NICK NAME</b></label> </p>
								</div>
								
								
								<button class="mdl-button mdl-js-button mdl-js-ripple-effect" id='signupBtn'>SIGN UP</button>
							
							</div>
						</form>
						
<!-- 						<input type="button" value="ID쳌" name="idcheck" onclick="javascript:chkDupId();"/> -->

					</div>


				</div>
			</div>

			<nav
				class="demo-nav mdl-color-text--grey-50 mdl-cell mdl-cell--12-col">
			</nav>
		</div>
		</main>
		<div class="mdl-layout__obfuscator"></div>
	</div>
	<script src="https://code.getmdl.io/1.2.1/material.min.js"></script>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
	
	<script>
	
 	$("#signupBtn").on("click", function(event){
 		

 	$("#signup").attr("action","../music/playlist");

 });
 	
</script> 
	
	
	<script>
	

	function chkDupId(){
		
		event.preventDefault();

		  var userid = $('#userid').val();
		  if($("#userid").val() == ''){alert('ID를 입력해주세요.'); return;}
		    	 
		    	 console.log($('#userid').val());
		  		  
		  $.ajax({
		     type : 'POST',   
		     data:"userid="+ userid,
		     dataType : 'text',
		     url : '../member/checkid',  //checkid실행
		     success : function(data) {
		    console.log(data);
		      if(data == 1){
		    	  
		       alert("중복 되어 있습니다.");
		      }else{
		     
		       alert("등록 가능 합니다.");
	
		      }
		     }
		  });  
		 }
	
	
	</script>

</body>
</html>