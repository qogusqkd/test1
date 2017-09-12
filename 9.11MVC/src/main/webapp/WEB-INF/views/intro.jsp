<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
<!--
.seoul-common-wrap {
    position: relative;
    z-index: 100;
    height: 45px;
    background: #5474c0;
}
.seoul-common-inner {
    position: relative;
    width: 100%;
    max-width: 940px;
    margin: 0 auto;
}
.gnb-wrap {
    position: absolute;
    left: 215px;
    top: 0px;
    height: auto;
    z-index: 100;
    width: 730px;
}
.seoul-common-inner #gnb {
    position: absolute;
    left: 0px;
    top: 12px;
    height: 30px;
    z-index: 100;
    width: 450px;
}
a {
    display: block;
    color: #e5eef6;
    font-size: 0.93em;
    font-family: "맑은 고딕", "Malgun Gothic";
    letter-spacing: -1px;
    font-weight: 700;
}
a:link{text-decoration:none;}
a:active { text-decoration: underline; }
a:hover { font-size:1.1em; }

body, div, dl, dt, dd, th, td, ul, ol, li, h1, h2, h3, h4, h5, h6, form, fieldset, p, blockquote, button, input, textarea {
    margin: 0;
    padding: 0;
}

ul, ol, li {
    list-style: none;
}
li {
    float: left;
    padding: 0px 7px;
}

body {
    font: 16px "dotum", "돋움", "gulim", "굴림", "sans-serif";
    -webkit-text-size-adjust: none;
}
h1 img {
    width: 15%;
}

-->
</style>
<div class="seoul-common-wrap">
	<div class="seoul-common-inner">
		<h1><a href="intro"><img alt="서울특별시" src="resources/seoul-logo-mobile.png"></a></h1>
		<div class="gnb-wrap">
			<nav id="gnb">
				<ul>
					<li><a href="login">로그인</a></li>
					<li><a href="myPage">마이서울</a></li>					
					<li><a href="email">전자우편</a></li>
					<li><a href="intro">서울소개</a></li>
					<li><a href="join">시민참여</a></li>										
				</ul>
			</nav>
		</div>
	</div>
</div>
			


<h1>서울 소개 페이지</h1>

