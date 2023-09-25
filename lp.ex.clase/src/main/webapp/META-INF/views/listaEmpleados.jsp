<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista de Empleados</h1>
    <table>
        <tr>
            <th>IdEmpleado</th>
            <th>Apellidos</th>
            <th>Nombres</th>
            <th>Edad</th>
            <th>Sexo</th>
            <th>Salario</th>
        </tr>
        <c:forEach items="${empleados}" var="empleado">
            <tr>
                <td>${empleado.idEmpleado}</td>
                <td>${empleado.apellidos}</td>
                <td>${empleado.nombres}</td>
                <td>${empleado.edad}</td>
                <td>${empleado.sexo}</td>
                <td>${empleado.salario}</td>
            </tr>
        </c:forEach>
    </table>
    
    <!-- Formulario de registro -->
    <h2>Registrar Empleado</h2>
    <form method="post" action="/registrar">
        <label for="idEmpleado">IdEmpleado:</label>
        <input type="text" id="idEmpleado" name="idEmpleado" required><br>
        <label for="apellidos">Apellidos:</label>
        <input type="text" id="apellidos" name="apellidos" required><br>
        <label for="nombres">Nombres:</label>
        <input type="text" id="nombres" name="nombres" required><br>
        <label for="edad">Edad:</label>
        <input type="number" id="edad" name="edad" required><br>
        <label for="sexo">Sexo:</label>
        <input type="text" id="sexo" name="sexo" required><br>
        <label for="salario">Salario:</label>
        <input type="number" id="salario" name="salario" required><br>
        <input type="submit" value="Registrar">
    </form>
    
    <a href="/empleados">Volver a la Lista de Empleados</a>
    
    <!-- Mensaje de éxito -->
    <p>${mensaje}</p>
</body>
</html>