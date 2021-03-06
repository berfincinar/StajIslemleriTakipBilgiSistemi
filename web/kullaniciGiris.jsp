<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>SCÜ Staj Takip</title>
	<link href="css/tasarim.css" type="text/css" rel="stylesheet"/>
    <!-- <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">-->
	<link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Roboto&display=swap" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Roboto&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP" crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Roboto&display=swap" rel="stylesheet">
<!-- <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">-->

</head>
<body>
<header class="header">

        <div class="logo">
            <img src="images/logo1.png" width="120px" height="120px">
        </div>

        <nav class="nav">
            <ul class="main-list">
            	<p class="Baslik" style="font-size: 30px">Sivas Cumhuriyet Üniversitesi <br> Staj Takip Sistemi</p>
            </ul>
        </nav>
		<li class="list-item"><a href="#"><i class="fas fa-user fa-4x"></i></a></li>
</header>

<!--KULLANICI GİRİŞ-->
    <div id="kullaniciGiris">
    	<center><h2>Öğrenci Giriş Paneli</h2></center>

        <form action="loginControl.jsp" method="post">
    	<li class="list-item"><a href="#"><i class="far fa-user-circle fa-4x" style="color: black"></i></a></li>
    	<div id="kullaniciAdi"> <input type="text" name="ogrNo" placeholder="Öğrenci Numarası" style="text-align: center;"></div>
    	
    	<li class="list-item"><a href="#"><i class="fas fa-lock fa-4x"style="color: black"></i></a></li>
    	<div id="sifre"><input type="password" name="sifre"  placeholder="Şifre"  style="text-align: center;"></div>
        <br>
        
        <!--GirişYap Butonu-->
        <div id="girisYap"><input type="submit" value="Giriş Yap"></div>
       
        <!--KayıtOl Butonu-->
        <div id="kayıtOl"><a href="register.jsp"><p>Ogrenci Kayıt</p></a></div>
        <div id="danismanKayit"><a href="danismanRegister.jsp"><p>Danışman Kayıt</p></a></div>
    	</form>

        
<!--BeniHatırla Butonu-->
    	<label class="container"> Beni Hatırla
  		<input type="checkbox" checked="checked">
  		<span class="checkmark"></span></label>
    </div>

    <!--SOSYALMEDYA-->
    <div id="sosyalMedya">
    	<li class="sosyal"><b><a href="https://www.cumhuriyet.edu.tr" ><i class="fab fa-chrome fa-2x"style="color:black">
    	</i> &nbsp;&nbsp;www.cumhuriyet.edu.tr</a></li>
		
		<li class="instagram"><b><a href="https://www.instagram.com/cumunivkurumsal/" >
    	<i class="fab fa-instagram fa-2x"style="color:black"></i> &nbsp;&nbsp;cumunivkurumsal</a></li>
    	
    	<li class="twitter"><b><a href="https://twitter.com/cumunivkurumsal" >
    	<i class="fab fa-twitter fa-2x"style="color:black"></i> &nbsp;&nbsp;cumunivkurumsal</a></li>
    </div>
</body>
</html>
