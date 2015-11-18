<html>
	<head>
		<meta charset="utf-8" />
		<link rel="stylesheet" type="text/css" href="style/almazon.css" />
		<link rel="stylesheet" type="text/css" href="style/jquery.dataTables.min.css" />
		<title>Almazon</title>
	</head>
	
	<body>

		<h1><a href="https://github.com/damien-maussion/Almazon" target="_blank">Almazon</a></h1>
		
		<table id="myTable" class="display">
			<thead>
				<tr>
				    <th>Produit</th>
				    <th>Prix</th>
					<th>Quantité</th>
				</tr>
			</thead>
			<tbody>
				<tr>
				    <td>truc</td>
				    <td>2$</td>
					<td><input type="text" name="quantité"></td>
				</tr>
				<tr>
				    <td>machin</td>
				    <td>10$</td>
					<td><input type="text" name="quantité"></td>
				</tr>
			</tbody>
		</table>

		<script type="text/javascript" src="bower_components/jquery/dist/jquery.min.js"></script>
		<script type="text/javascript" src="bower_components/jquery.xml2json/src/xml2json.js"></script>
		<script type="text/javascript" src="bower_components/jquery.soap/jquery.soap.js"></script>
		<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
		<script type="text/javascript" src="js/almazon.js"></script>
	</body>
</html>
