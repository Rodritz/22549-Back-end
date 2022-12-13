<%-- comentario jsp --%>
<%-- scritlet donde puedo escribir codigo java --%> 
<%
 int[] edades = new int[]{10,11,12};//construyo un array con valores predefinidos
%>
<ul>
	<%
	 for(int edad : edades){//voy a recorrer el array
	%>
	<!-- estatico -->
	<li><%=edad%></li><!-- lo que tengo dentro del li vendria a ser un sout que me mostara las edades del array -->
	<%
	 }
	%>
</ul>
<%--en el sciptlet lo que hice fue crear un listado que me muestra los resultados del recorrido del array --%>