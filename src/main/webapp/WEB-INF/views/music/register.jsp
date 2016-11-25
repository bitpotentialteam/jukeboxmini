<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
              href="resources/images/touch/chrome-touch-icon-192x192.png">

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

            .mdl-grid .mdl-card {
                background:
                        url("http://www.cinema4d.co.kr/files/attach/images/119/631/143/001/2010-07-27%2022;33;56.jpg");
                background-size: 100% 100% ;
            }
			.is-focused > .mdl-textfield__label, .is-dirty > .mdl-textfield__label{
			
				color: rgba(0, 0, 0, 0.7);
			
			}

        </style>
    </head>

<body>


<div class="demo-blog demo-blog--blogpost mdl-layout mdl-js-layout has-drawer is-upgraded">
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
                    <h3>MUSIC REGISTER</h3>
                </div>
                <main>
                <div class="mdl-color-text--grey-700 mdl-card__supporting-text meta">

                    <div class="row">
                        <div class="col-md-7" id="dragndrop">
                            <p>drop</p>
                            <p>your music file </p>
                            <p>here!!</p>
                        </div>
                        <div class="col-md-5">
                            <form class="input" action="musicRegister" method="post">
                                <ul>
                                    <li>
                                        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                            <input class="mdl-textfield__input" type="text" id="input_title">
                                            <label class="mdl-textfield__label" for="input_title">Title</label>
                                        </div>
                                    </li>

                                    <li>
                                        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                            <input class="mdl-textfield__input" type="text" id="input_singer">
                                            <label class="mdl-textfield__label" for="input_singer">Singer</label>
                                        </div>
                                    </li>

                                    <li>
                                        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                            <input class="mdl-textfield__input" type="text" id="input_album">
                                            <label class="mdl-textfield__label" for="input_album">Album</label>
                                        </div>
                                    </li>

                                    <li>
                                        <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                                            <input class="mdl-textfield__input" type="text" id="input_date">
                                            <label class="mdl-textfield__label" for="input_date">Release Date</label>
                                        </div>
                                    </li>
                                </ul>
                                <div class="box-footer">
                                    <button class="mdl-button mdl-js-button mdl-js-ripple-effect" id="regBtn">register</button>
                                </div>
                            </form>
                        </div>



                </div>

            </div>
    </main>
    <div class="mdl-layout__obfuscator"></div>
</div>
</div>

<script src="https://code.getmdl.io/1.2.1/material.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

<script>
    //drag&drop
    // 파일을 드래그해서 새 창이 열리는 event를 막아준다. ==> 3개의 이벤트를 2번에 나눠 막음. why? drop event시 ajax를 호출하기 위해.
    $(document).ready(function(){

        var uploadedList = $(".uploadedList");
        // 두 개의 이벤트가 같이 먹는다.
        
        
        $("#dragndrop").on("dragenter dragover ", function(event){
            event.preventDefault();
        }); 

        $("#dragndrop").on("drop", function(event){
            event.preventDefault();

            var files = event.originalEvent.dataTransfer.files;
            var file = files[0];

            console.log(file);

            var formData = new FormData();	// javascript로 form tag를 만든다고 생각. but 브라우저의 호환이 좋지 않다.
            formData.append("file", file);	// "file" 형식의 file을 추가.

            
            console.log(formData);

            $.ajax({	// ajax로 처리하는 이유는 옵션을 추가해줘야 동작한다.

                url:"uploadFile",
                data:formData,	
                dataType:'json',
                type:"post",
                contentType:false,
                processData:false,
                success:function(result){
                	
                    console.log(result);
					console.log(result.title);                 
                    
					$(".mdl-js-textfield").addClass("is-dirty");
                  	$("#input_title").val(result.title);
					$("#input_singer").val(result.singer);
					$("#input_album").val(result.album);
					$("#input_date").val(result.regDate);
             
                }
            });

        });

    });
</script>

 
</body>
</html>