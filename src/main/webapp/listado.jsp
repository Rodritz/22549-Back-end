<!-- importamos las clases List y Articulo (ctrl + space sobre la palabra) -->
<%@page import="ar.com.codoacodo.domain.Articulo"%>
<%@page import="java.util.List"%>

<!Doctype html>
<html lang="es">
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<!-- navbar incluida mediante el jsp file-->
	<jsp:include page="navbar.jsp"/>
	<div class="container">
		<div class="row">
			<h1>Listado de productos</h1>
			<div class="col-12">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">Titulo</th>
							<th scope="col">Autor</th>
							<th scope="col">Precio</th>
							<th scope="col">Imagen</th>
						</tr>
					</thead>
					<tbody>
						<!-- repetir sobre la lista de productos que cargue en el controller -->
						<!-- lo que hay dentro del scriptlet lo interpreta como java -->
						<%
							//capturar /bajar el listado del objeto request
							//ademas tenemos que importar la clase List y la clase Articulo
							List<Articulo> articulos = (List<Articulo>)request.getAttribute("productos");//con el getAttribute obtengo
							for(Articulo articulo : articulos){
						%>
								
							<tr>
								<th scope="row"><%=articulo.getId()%></th>
								<td><%=articulo.getTitulo()%></td>
								<td><%=articulo.getAutor()%></td>
								<td><%=articulo.getPrecio()%></td>
								<td><%=articulo.getImg()%></td>
							</tr>
								
						<%	
							}
						%>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
