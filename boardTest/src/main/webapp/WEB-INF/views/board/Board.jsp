<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Board</title>
</head>
<body>
  <h1>Board</h1>

  <c:if test="${not empty sessionScope.userId}">
    <p>환영합니다, ${sessionScope.userId}</p>
    <a href="/auth/Logout">로그아웃</a>
  </c:if>

  <table border="1">
    <thead>
      <tr>
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="post" items="${postList}">
        <tr>
          <td><a href="${pageContext.request.contextPath}/post/${post.id}">${post.title}</a></td>
          <td>${post.author}</td>
          <td>${post.createdAt}</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
<p>
  <a href="/contentWrite/Write">글쓰기</a>
</p>
</body>
</html>
