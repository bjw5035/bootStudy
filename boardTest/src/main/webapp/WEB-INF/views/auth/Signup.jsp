<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
    <h2>회원가입</h2>
<form action="Signup.jsp" method="POST">
    <div>
        <p>
            <label for="joinId">아이디 : </label>
            <input type="text" id="joinId" name="joinId">
        </p>
        <p>
            <label for="joinPw">패스워드 : </label>
            <input type="text" id="joinPw" name="joinPw">
        </p>
        <p>
            <label for="joinName">이름 : </label>
            <input type="text" id="joinName" name="joinName">
        </p>
        <button class="ui-button" id="join" name="btnJoin" type="submit">회원가입</button>
    </div>
</form>

<%--    <script type="text/javascript" src="/WEB-INF/js/user.js"></script>--%>
</body>
</html>
