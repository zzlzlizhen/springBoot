<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script type="text/javascript" src="../assets/js/jquery-1.10.2.min.js"></script>
	
	<script type="text/javascript">
		function req(){
			$.ajax({
				url:"myConverter",
				data:"1-lizhen",
				type:"POST",
				contentType:"application/x-wisely",
				success:function(data){
					alert(data);
					$("#resp").html(data);
				}
			});
		}
	</script>
</head>
<body>
	<id id="resp">
	
	</id>
	<input type="button" onclick="req();" value="请求"/>
</body>
</html>