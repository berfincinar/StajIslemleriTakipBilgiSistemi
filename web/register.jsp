<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE ">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta charset="UTF-8">
       
    <title>SCÜ Staj Takip</title>
    <link href="css/registerTasarim.css" type="text/css" rel="stylesheet"/>
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
       <li class="list-item"><a href="#"><i class="fas fa-list fa-4x"></i></a> </li>
       
    </header>
    <br>
    <br>
    <!--İÇ ÇERÇEVE-->
    <div id="duz-cerceve">
        <!--KayıtOL Menu-->
        
        <p class="KayitOl" ><h2 style="color: black">Öğrenci Kayıt Paneli</h2></p>
    
        <form action="RegisterServlet" method="post" class="STYLE-NAME">
        
        <label>
        <input id="kAdi" type="text" name="ogrNo" placeholder="OgrenciNo" />
        </label>

        <label>
        <input id="password" type="password" name="sifre" placeholder="Şifre" />
        </label>

        <label>
        <input id="isim" type="text" name="isim" placeholder="İsim" />
        </label>

        <label>
        <input id="soyad" type="text" name="soyisim" placeholder="Soyisim" />
        </label>

        <label>
        <input id="mail" type="text" name="eMail" placeholder="E-Mail" />
        </label>

        <label>
        <input id="telNo" type="text" name="telNo" placeholder="Telefon Numarası" />
        </label>

        <label>
        <input id="dTarihi" type="text" name="dogumTarihi" placeholder="Doğum Tarihi" />
        </label>

        <label>
        <input id="bölüm" type="text" name="bolum" placeholder="Bölüm" />
        </label>

        <label>
        <input id="sinif" type="text" name="sinif" placeholder="Sınıf" />
        </label>
            
        <label>
        <input id="sirket" type="text" name="sirketAdi" placeholder="Şirket Adı" />
        </label>

            <div id="kayıtOl"><input type="submit" value="Kayıt Ol"></div>
        </form>
        
        <!--SOL MENU-->
        <ul class="saolMenu">
            <li><a href="#">&nbsp;&nbsp;<center><i class="fas fa-user fa-4x"></i></center></a></li>

            <li><a href="#hosgeldiniz">&nbsp;&nbsp;<center><i class="fas fa-home"></i> &nbsp;&nbsp;Ana sayfa</center></a></li>

            <li><a href="#ogrencibilgi"><center><i class="fas fa-user"></i> &nbsp;&nbsp;Öğrenci Bilgi</center></a></li>

            <li><a href="#isletmebilgi"><center><i class="fas fa-building"></i> &nbsp;&nbsp;İşletme Bilgi</center></a></li>

            <li><a href="#ogretmenbilgi"><center>&nbsp;<i class="fas fa-user-tie"></i>
             &nbsp;&nbsp;Öğretmen Bilgi</center></a></li>

            <li><a href="#stajdefteri"><center><i class="fas fa-book-open"></i> &nbsp;&nbsp;Staj Defteri</center></a></li>
        </ul>
        
  
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
