<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="A front-end template that helps you build fast, modern mobile web apps.">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <title>Material Design Lite</title>

    <!-- Add to homescreen for Chrome on Android -->
    <meta name="mobile-web-app-capable" content="yes">
    <link rel="icon" sizes="192x192" href="images/touch/chrome-touch-icon-192x192.png">

    <!-- Add to homescreen for Safari on iOS -->
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-title" content="Material Design Lite">
    <link rel="apple-touch-icon-precomposed" href="apple-touch-icon-precomposed.png">

    <!-- Tile icon for Win8 (144x144 + tile color) -->
    <meta name="msapplication-TileImage" content="images/touch/ms-touch-icon-144x144-precomposed.png">
    <meta name="msapplication-TileColor" content="#3372DF">

    <!-- SEO: If your mobile URL is different from the desktop URL, add a canonical link to the desktop page https://developers.google.com/webmasters/smartphone-sites/feature-phones -->
    <!--
    <link rel="canonical" href="http://www.example.com/">
    -->

    <link href='//fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en'
          rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
          rel="stylesheet">
    <link rel="stylesheet" href="https://code.getmdl.io/1.2.1/material.grey-orange.min.css">
    <link rel="stylesheet" href="../resources/css/styles.css">
    <link rel="stylesheet" href="../resources/css/turntable.css">
    <style>
        #view-source {
            position: fixed;
            display: block;
            right: 0;
            bottom: 0;
            margin-right: 40px;
            margin-bottom: 650px;
            z-index: 900;
        }
        
         #view-source2 {
            position: fixed;
            display: block;
            right: 0;
            bottom: 0;
            margin-right: 150px;
            margin-bottom: 650px;
            z-index: 900;
        }
        
        
        .mdl-card__media{
            background-color: black;
        }

        .mdl-shadow--4dp{
            box-shadow: none;
        }

        .mdl-card{
            background-color: transparent;
        }



    </style>


</head>
<body>
<div class="demo-blog demo-blog--blogpost mdl-layout mdl-js-layout has-drawer is-upgraded">
    <main class="mdl-layout__content">
        <!--
        <div class="demo-back">
            <a class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon" href="#" title="go back" role="button">
                <i class="material-icons" role="presentation">arrow_back</i>
            </a>
        </div>
        -->
        <div class="demo-blog__posts mdl-grid">
            <div class="mdl-card mdl-shadow--4dp mdl-cell mdl-cell--12-col">
                <div class="mdl-card__media mdl-color-text--grey-50">
                    <h3>JUKE BOX</h3>
                    <h5> - share your BEST SONG!</h5>
                </div>
                <div class="mdl-color-text--grey-700 mdl-card__supporting-text meta">

                    <div class="search">

                        <!-- Expandable Textfield -->
                        <form action="#">
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--expandable">
                                <label class="mdl-button mdl-js-button mdl-button--icon" for="sample6">
                                    <i class="material-icons">search</i>
                                </label>
                                <div class="mdl-textfield__expandable-holder">
                                    <input class="mdl-textfield__input" type="text" id="sample6">
                                    <label class="mdl-textfield__label" for="sample-expandable">Expandable Input</label>
                                </div>
                            </div>
                        </form>

                    </div>

                </div>

                <div class="mdl-color-text--grey-700 mdl-card__supporting-text">

                    <div id="container">
                        <div id="wrapper">
                            <div class="listcard" id="list1"></div>
                            <div class="listcard" id="list2"></div>
                            <div class="listcard" id="list3"></div>
                            <div class="listcard" id="list4"></div>
                            <div class="listcard" id="list5"></div>
                            <div class="listcard" id="list6"></div>
                            <div class="listcard" id="list7"></div>
                            <div class="listcard" id="list8"></div>
                        </div>
                    </div>


                </div>

                <div class="mdl-color-text--grey-700 mdl-card__supporting-text">


                    <!-- start turntable -->
                    <div id="turntable-1" class="turntable has-slipmat power-on">

                        <div class="frame"></div>

                        <div class="table-bg"></div>

                        <!-- image that sets the base dimensions-->
                        <img src="../resources/images/turn/tt_case_and_lighting.png" alt="" class="stub">

                        <div class="bd">

                            <div class="platter"></div>

                            <div class="slipmat-holder">
                                <div class="slipmat"></div>
                            </div>

                            <div class="record-holder">
                                <div class="record"></div>
                                <div class="record-grooves"></div>
                                <div class="label"></div>
                            </div>

                            <div class="spindle"></div>
                            <div class="power-light"></div>
                            <a href="#" class="power-dial" data-method="powerToggle"></a>
                            <a href="#" class="button start-stop" data-method="toggle"></a>
                            <a href="#" class="button speed-33 on"></a>
                            <a href="#" class="button speed-45"></a>
                            <div class="light light-on"></div>
                            <a href="#" class="button light"></a>
                            <div class="tonearm-holder">
                                <div class="tonearm"></div>
                            </div>
                        </div>

                    </div>
                    <!-- end turntable -->
                    <!-- turntable code
                    <div>
                        <a href="http://freshly-ground.com/data/audio/sm2/Figub%20Brazlevi%C4%8D%20-%20Bosnian%20Syndicate.mp3" data-turntable="turntable-large" data-artwork="http://freshly-ground.com/data/image/sm2/trainyards-cover-640.jpg">
                            <b>Figub Brazlevič</b> - Bosnian Syndicate</a></div>
                            -->



                </div>


                <div class="mdl-color-text--primary-contrast mdl-card__supporting-text comments">
                    <form>
                        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                            <textarea rows=1 class="mdl-textfield__input" id="comment"></textarea>
                            <label for="comment" class="mdl-textfield__label">Join the discussion</label>
                        </div>
                        <button class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon">
                            <i class="material-icons" role="presentation">check</i><span class="visuallyhidden">add comment</span>
                        </button>
                    </form>
                    <div class="comment mdl-color-text--grey-700">

                        <ul class="demo-list-three mdl-list">

                            <li class="mdl-list__item mdl-list__item--three-line">
                                <span class="mdl-list__item-primary-content">
                                  <i class="material-icons mdl-list__item-avatar">person</i>
                                  <span>Bryan Cranston</span>
                                  <span class="mdl-list__item-text-body">
                                    Bryan Cranston played the role of Walter in Breaking Bad. He is also known
                                    for playing Hal in Malcom in the Middle.
                                  </span>
                                </span>
                            </li>

                        </ul>
                    </div>
                </div>


            </div>

            <nav class="demo-nav mdl-color-text--grey-50 mdl-cell mdl-cell--12-col">

            </nav>
        </div>
        <footer class="mdl-mini-footer">
            <div class="mdl-mini-footer--left-section">

            </div>
            <div class="mdl-mini-footer--right-section">

            </div>
        </footer>
    </main>
    <div class="mdl-layout__obfuscator"></div>
</div>
<a href="../member/login"  id="view-source"
   class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-color--accent mdl-color-text--white">LOGIN</a>
   
   
   <a href="../member/signup"  id="view-source2"
   class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-color--accent mdl-color-text--black">Sign UP</a>
   
   
<script src="https://code.getmdl.io/1.2.1/material.min.js"></script>

<script src="resources/js/soundmanager2.js"></script>
<script src="resources/js/turntable-app.js"></script>
<script src="resources/js/turntable.js"></script>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

<script>

    var yDeg = 0;
    var vDeg = 50;

    $(document).ready(function () {


        $(document).bind("keydown", function (e) {

            switch (e.keyCode) {

                case 37: // left
                    console.log("right");
                    $("#wrapper").css("-webkit-transform", "rotateY(" + (yDeg += 45) + "deg)");
                    break;

                case 39: // right
                    console.log("left");
                    $("#wrapper").css("-webkit-transform", "rotateY(" + (yDeg -= 45) + "deg)");
                    break;

            }
            ;//end switch
        });

    });
</script>

<script>
//drag&drop
	// 파일을 드래그해서 새 창이 열리는 event를 막아준다. ==> 3개의 이벤트를 2번에 나눠 막음. why? drop event시 ajax를 호출하기 위해.
	$(document).ready(function(){
		
		var uploadedList = $(".uploadedList");
						 // 두 개의 이벤트가 같이 먹는다.
		$("#turntable-1").on("dragenter dragover ", function(event){
			event.preventDefault();
		});
						 
		$("#turntable-1").on("drop", function(event){
			event.preventDefault();
			
			var files = event.originalEvent.dataTransfer.files;
			var file = files[0];
			
			console.log(file);
			
			var formData = new FormData();	// javascript로 form tag를 만든다고 생각. but 브라우저의 호환이 좋지 않다.
			formData.append("file", file);	// "file" 형식의 file을 추가.
			
			console.log(formData);
			
			$.ajax({	// ajax로 처리하는 이유는 옵션을 추가해줘야 동작한다.
				
				url:"uploadFile",
				data:formData,	// data Type을 formData로 주면 기본으로 데이터 타입이 multipart로 전달.
				dataType:'text',
				type:"post",
				contentType:false,
				processData:false,
				success:function(data){
					console.log(data);
					alert(data);
					//uploadedList.append("<img src=show?name=" + data + ">");
					//uploadedList.html("<img src=show?name=" + data + ">");
				}
			});	
			
		});
		
	});
</script>




</body>
</html>