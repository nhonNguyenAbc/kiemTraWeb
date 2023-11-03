<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/Common/taglib.jsp" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <!-- Site meta -->
   	
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Free Bootstrap 4 Ecommerce Template</title>
    <!-- CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,300,600" rel="stylesheet" type="text/css">
    <link href='../templates/admin/css/style.css' rel="stylesheet" type="text/css">
</head>
<body>
	<%@ include file ="/Common/admin/header.jsp" %>
	
	<div class="fluid-container">
	
		<table border="1" style="width: 100%" >
			<tr>
			<td valign="top" style="width:10%">
			<td valign="top" style="width:60%">
					<decorator:body></decorator:body>
					</td>
					<td><%@ include file = "/Common/admin/right.jsp" %> </td>
			</tr>
		</table>
	</div>
	
	<%@ include file ="/Common/admin/footer.jsp" %>
	
	
	
	<!-- JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" type="text/javascript"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" type="text/javascript"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>