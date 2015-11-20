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
            <h1><a href="https://github.com/damien-maussion/Almazon" target="_blank" style="color:black;cursor:pointer;text-decoration:none;">Almazon Welcome!</a></h1>
            <p>A new shop to buy anything for low cost.</p>
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

        <div class="modal fade" id="myModal" role="dialog">
            <div class="modal-dialog">
            
              <!-- Modal content-->
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">It's time to pay</h4>
                </div>
                <div class="modal-body">
                	 <h3>Your command:</h3>
	                  <p><span id="modal-qt"></span> <span id="modal-product-name"></span> for <span id="modal-price"></span><span id="modal-devise"></span></p>
	                  <h3>Bank information</h3>
	                  <label>First name :</label><input id="modal-cfn" type="text"/> <br/>
	                  <label>Name :</label><input id="modal-cn" type="text"/> <br/>
	                  <label>Numero :</label><input id="modal-n" type="text"/> <br/>
	                  <label>Expiration month :</label><input id="modal-em" type='text' id="spinner-em" value="1"/> <br/>
	                  <label>Expiration year :</label><input id="modal-ey" type='text' id="spinner-ey" value="2015"/> <br/>
	                  <label>Key :</label><input id="modal-k" type="text"/>
                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="confirmBuy()">Buy</button>
                  <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
                </div>
              </div>
              
            </div>
          </div>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Almazon 2015</p>
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
