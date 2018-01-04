<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Reimbursement</title>
</head>
<body>
<h1>Create Reimbursement</h1>
<form action="Create" method="post">
  Select the type of reimbursement:
  <select name="rtype">
    <option value="University Course">University Course</option>
    <option value="Seminar">Seminar</option>
    <option value="Certification">Certification</option>
    <option value="Technical Training">Technical Training</option>
    <option value="Other">Other</option>
  </select>
  Cost of Course: 
  <input name="cost" type="text" placeholder="0.00">
  <br>
  Description:
  <input name="description" type="text" placeholder="Description">
  Location:
  <input name="location" type="text" placeholder="Loaction">
  Grading Format:
  <select name="grade">
  	<option value="Pass/Fail">Pass/Fail</option>
  	<option value="4.0 Scale">4.0 scale</option>
  </select>
  <button type="submit">Submit</button>
</form>
</body>
</html>