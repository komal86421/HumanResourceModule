<%!
	String id;
%>
<%
	id = request.getParameter("id");
%>
<html>
<head>
<title>By Avinash Mahlawat</title>
<style>
h1{text-align:center;}
</style>
</head>

<body bgcolor="pink">
<form action="http://localhost:2017/HRM/updateProjectServlet">
<h1>EDIT YOUR PROJECT</h1>
<table bgcolor="99FFFF">
<tr>
<td>Enter Project Id</td>
<%
out.print("<td><input type=text name='id' size='30' readonly='readonly'  value='"+id+"'></td>");
%>
</tr>
<tr>
<td>Enter Name of the Project</td>
<td><input type=text name="name" size="30"></td>
</tr>
<tr>
<td>Enter startdate</td>
<td><input type="date" name="startdate" size="30"/></td>
</tr>
<tr>
<td>Enter enddate</td>
<td><input type="date" name="enddate"  size="30"/></td>
</tr>
<tr>
<td>Enter technology</td> 
<td>
<select name = "technology">
               <option value = "javascript">Java</option>
               <option value = "java">JavaScript</option>
               <option value = "php">php</option>
</select>
</td>
</tr>
<tr>
<td>Enter name of client</td>
<td><input type="text" name="client" size="30"/></td>
</tr>
<tr>
<td>Enter team size</td>
<td><input type="text" name="teamsize" size="30"/></td>
</tr>

<tr><td>Enter details</td>
<td><textarea name="details" rows="10" cols="30" >Enter details of Project</textarea></td>
</tr>
<tr>
<td><input type="submit" value="Edit & Save"></td>
</tr>
<tr>
<td><input type="reset" value="reset"></td>
</tr>

</table>
</form>
</body>
</html>
	