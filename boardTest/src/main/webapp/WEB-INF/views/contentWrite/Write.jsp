<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
          margin: auto;
        }
        input[type="text"] {
          border: 1.5px rgb(68, 136, 244) solid;
          width: 500px;
          height: 30px;
          border-radius: 5px;
          padding-left: 10px;
        }
        textarea {
          border: 1.5px rgb(68, 136, 244) solid;
          width: 500px;
          height: 400px;
          border-radius: 5px;
          padding-left: 10px;
          padding-top: 10px;
          resize: none;
        }
        .header {
          height: 30px;
        }
        input[type="submit"] {
          width: 100px;
          height: 40px;
          font-size: 15px;
          border: 0;
          outline: 1.5px rgb(68, 136, 244) solid;
          border-radius: 5px;
          padding-left: 10px;
          background-color: rgb(164, 199, 255);
        }
        input[type="submit"]:active {
          width: 100px;
          height: 40px;
          font-size: 15px;
          border: 0;
          border-radius: 5px;
          outline: 1.5px rgb(27, 76, 155) solid;
          padding-left: 10px;
          background-color: rgb(68, 136, 244);
        }
    </style>
</head>
<body>
<form action="Write.jsp" method="post">
    <table>
        <tr><td><h2>글쓰기</h2></td></tr>
        <tr><td class="header">Title</td></tr>
        <tr><td><input type="text" placeholder="제목을 입력하세요." name="title"></td></tr>
        <tr><td class="header">Comment</td></tr>
        <tr><td><textarea placeholder="내용을 입력하세요." name="detail"></textarea></td></tr>
        <tr><td><input type="submit" value="등록" onclick="alert('작성완료')"></td></tr>
    </table>
</form>

</body>
</html>
