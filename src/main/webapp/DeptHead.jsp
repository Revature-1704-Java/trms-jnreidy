<%@ page import="java.util.List" %>
<%@ page import="com.revature.beans.Reimbursements"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://getbootstrap.com/docs/4.0/examples/starter-template/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="starter-template.css" rel="stylesheet">
<title>DepartmentHead</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Tuition Reimbursement</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login">Logout</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
      </li>
    </ul>
  </div>
</nav>
<h1>Hello dept head</h1>
<table id="ReimbursementTable" border="1">
	<tbody>
		<tr>
			<td>ReimbursementID</td>
			<td>EmployeeID</td>
			<td>Cost</td>
			<td>Type</td>
			<td>Description</td>
			<td>Status</td>
			<td>Approve</td>
			<td>Deny</td>
		</tr>
		<% List<Reimbursements> reimb = (List<Reimbursements>) request.getSession().getAttribute("reimbursements");%>
		<% for(int i = 0; i < reimb.size(); i++){ %>
		<tr>
			<td><%= reimb.get(i).getRid() %></td>
			<td><%= reimb.get(i).getEid() %></td>
			<td><%= reimb.get(i).getCost()%></td>
			<td><%= reimb.get(i).getRtype() %></td>
			<td><%= reimb.get(i).getDescription() %></td>
			<td><%= reimb.get(i).getStatus() %> </td>	
			<td><button type="button" onclick="alert('Approved')">Approve</button>
			<td><button type="button" onclick="alert('Denied')">Deny</button></td>
		</tr> 
		<% } %>	
	</tbody>
</table>
</body>
</html>