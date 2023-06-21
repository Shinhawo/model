<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
   <div class="container">
      <ul class="navbar-nav me-auto">
         <li class="nav-item"><a class="nav-link ${param.menu eq '홈' ? 'active' : '' }" href="/model2/home.hta">홈</a></li>
         <li class="nav-item"><a class="nav-link ${param.menu eq '게시판' ? 'active' : '' }" href="/model2/board/list.hta">게시판</a></li>
      </ul>
      <ul class="navbar-nav ">
         <li class="nav-item"><a class="nav-link ${param.menu eq '로그인' ? 'active' : '' }" href="/model2/loginform.hta">로그인</a></li>
         <li class="nav-item"><a class="nav-link ${param.menu eq '회원가입' ? 'active' : '' }" href="/model2/registerform.hta">회원가입</a></li>
         <li class="nav-item"><a class="nav-link " href="/model2/logout.hta">로그아웃</a></li>
      </ul>
   </div>
</nav>