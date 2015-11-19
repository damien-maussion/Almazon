<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Almazon - New Shop, Best Prices</title>

    <link href="style/jquery-ui.min.css" rel="stylesheet">
    <!-- Bootstrap Core CSS -->
    <link href="style/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="style/heroic-features.css" rel="stylesheet">

    <link rel="stylesheet" type="text/css" href="style/almazon.css" />
</head>

<body>

    <!-- Page Content -->
    <div class="container">

        <!-- Jumbotron Header -->
        <header class="jumbotron hero-spacer">
            <h1>Almazon Welcome!</h1>
            <p>A new shop to buy anything for low coast.</p>
            </p>
             <select id="select-devise">
              <option value="dollar">$</option>
              <option value="euro">&euro;</option>
            </select> 
        </header>

        <hr>

        <!-- Title -->
        <div class="row">
            <div class="col-lg-12">
                <h3>Available products</h3>
            </div>
        </div>
        <!-- /.row -->

        <!-- Page Features -->
        <div id="div-products" class="row text-center"></div>
        <!-- /.row -->

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Almazon 2014</p>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.container -->



	<script type="text/javascript" src="bower_components/jquery/dist/jquery.min.js"></script>

    <!-- jQuery -->
    <script src="js/jquery.js"></script>
    <script src="js/jquery-ui.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

	<script type="text/javascript" src="bower_components/jquery.xml2json/src/xml2json.js"></script>
	<script type="text/javascript" src="bower_components/jquery.soap/jquery.soap.js"></script>

	<script type="text/javascript" src="almazon.js"></script>
</body>

</html>