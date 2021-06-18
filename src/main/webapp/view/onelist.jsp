
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div{width:600px; margin:100px auto; text-align: center;}
	a{text-decoration: none;}
	table
	{
		width: 600px;
		border-collapse: collapse;
		text-align: center;
	}
	table, th, td
	{
		border: 1px solid black;
		padding: 5px;
		margin: auto;
	}
</style>
<script type="text/javascript">
	function update_go(f) 
	{
		f.action="${pageContext.request.contextPath }/MyController?cmd=update";
		f.submit();
	}
	function delete_go(f) 
	{
		f.action="${pageContext.request.contextPath }/MyController?cmd=del";
		f.submit();
	}
</script>
</head>
<body>
	<div>
		<h2>내용 화면</h2>
		<hr>
		<p>[ <a href="${pageContext.request.contextPath }/MyController?cmd=list">게시물 목록으로 이동</a> ]</p>
		<form method="post">
			<table>
				<tbody>
					<tr><th>작성자</th><td>${vo.name}</td></tr>
					<tr><th>제목</th><td>${vo.subject}</td></tr>
					<tr><th>Email</th><td>${vo.email}</td></tr>
					<tr style="text-align: left;">
						<td colspan="2" style="padding: 0px 50px;">
								<pre>
									${vo.content}
								</pre>
						</td>
					</tr>
				</tbody>
				<tfoot>
					<tr>
						<td colspan="2">
							<input type="button" value="수정" onclick="update_go(this.form)">
							<input type="button" value="삭제" onclick="delete_go(this.form)">
							<input type="hidden" name="idx" value="${vo.idx}">
							<input type="hidden" name="pwd" value="${vo.pwd}">
						</td>
					</tr>
				</tfoot>
			</table>
		</form>
	</div>
</body>
</html>