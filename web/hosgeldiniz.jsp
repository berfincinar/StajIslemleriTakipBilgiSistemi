<%-- 
    Document   : anaSayfa
    Created on : 29.Ara.2020, 20:40:11
    Author     : Hadise
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>SCÜ Staj Takip</title>
	<link href="css/anaSayfaTasarim.css" type="text/css" rel="stylesheet"/>
	<link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Roboto&display=swap" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&family=Roboto&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
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
            <li class="list-item"><a href="logOut.jsp"><i class="fas fa-sign-out-alt fa-4x"></i></a> </li>
    </header>
    <br>
    <br>
    <!--İÇ ÇERÇEVE-->
    <div id="duz-cerceve">
        <!--SOL MENU-->
        <ul class="saolMenu">
            <li><a href="#">&nbsp;&nbsp;<center><i class="fas fa-user fa-4x"></i></center></a></li>

            <li><a href="hosgeldiniz.jsp">&nbsp;&nbsp;<center><i class="fas fa-home"></i> &nbsp;&nbsp;Ana sayfa</center></a></li>

            <li><a href="ogrenciBilgi.jsp"><center><i class="fas fa-user"></i> &nbsp;&nbsp;Öğrenci Bilgi</center></a></li>

            <li><a href="isletmeBilgi.jsp"><center><i class="fas fa-building"></i> &nbsp;&nbsp;İşletme Bilgi</center></a></li>

            <li><a href="ogretmenBilgi.jsp"><center>&nbsp;<i class="fas fa-user-tie"></i>
             &nbsp;&nbsp;Öğretmen Bilgi</center></a></li>

            <li><a href="stajDefteri.jsp"><center><i class="fas fa-book-open"></i> &nbsp;&nbsp;Staj Defteri</center></a></li>
        </ul>
  <!--ARAMA ÇUBUĞU-->
        <div id="aramaButonu">
         <form>
            <div id="box">
            <input type="text" id="search" placeholder="Ara..">
            <i class="fa fa-search"></i>
            </div>
        </form>
    </div>

    <!-- Cumhuriyet Üniversitesi Logo-->
    <div id="HGCumhuriyet">
        <img src="images/logo1.png">
         <p class="SCÜ">Sivas<br>Cumhuriyet Üniversitesi</p>
    </div>
  
    <!--HOŞGELDINIZ-->
       <div id="hosgeldiniz">
           <p>Staj Takip Sistemine Hoşgeldiniz</p>
       </div>  
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
