<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page pageEncoding="utf-8" session="false"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/css/bootstrap.min.css" />" rel="stylesheet">
<title>BOARD LIST</title>
</head>
<body>
    <div class="container">
        <div class="jumbotron">
            <h1>Books NEW</h1>
            <p>views/board/boardList.jsp</p>
        </div>
        <form action="<c:url value="/books" />" method="post">
            <div class="form-group form-group-lg">
                <label class="control-label">글제목</label>
                <input name="title" type="text" class="form-control">
            </div>
            <div class="form-group form-group-lg">
                <label class="control-label">작성자</label>
                <input name="author" type="text" class="form-control">
            </div>
            <div class="form-group form-group-lg">
                <label class="control-label">내용</label>
                <input name="image" type="text" class="form-control">
            </div>
            <button type="submit" class="btn btn-lg btn-primary">등록</button>
        </form>
    </div>
</body>
</html>