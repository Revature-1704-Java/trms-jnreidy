<%@ page import="java.util.List" %>
<%@ page import="com.revature.beans.Reimbursements"%>
<%@ page import="com.revature.beans.Employees"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
<title>EmployeeView</title>
</head>
<body>
<script src=view.js></script>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Tuition Reimbursement</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Create<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login">Logout</a>
      </li>
    </ul>
  </div>
</nav>
<% Employees emp = (Employees) request.getSession().getAttribute("emp"); %>
<h1>Hello <%= emp.getFirstname() %> <%= emp.getLastname()%></h1>
<table id="ReimbursementTable" border="1">
	<tbody>
		<tr>
			<td>ReimbursementID</td>
			<td>EmployeeID</td>
			<td>Cost</td>
			<td>Type</td>
			<td>Description</td>
			<td>Status</td>
			<td>Delete</td>
		</tr>
		<% List<Reimbursements> reimb = (List<Reimbursements>) request.getSession().getAttribute("reimbursements");%>
		<% for(int i = 0; i < reimb.size(); i++){ %>
		<tr>
			<td><%= reimb.get(i).getRid() %></td>
			<td><%= reimb.get(i).getEid()%></td>
			<td><%= reimb.get(i).getCost()%></td>
			<td><%= reimb.get(i).getRtype()%></td>
			<td><%= reimb.get(i).getDescription() %></td>
			<td><%= reimb.get(i).getStatus() %> </td>	
			<td><button id="deleteButton<%=reimb.get(i).getRid()%>" type="button" onclick='deleteReimb(<%=reimb.get(i).getRid()%>)'>Delete</button>
		</tr> 
		<% } %>	
	</tbody>
</table>
</body>
</html>