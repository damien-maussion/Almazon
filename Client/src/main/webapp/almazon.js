function refreshProducts(){
	$.soap({
    	url: 'http://localhost:9763/services/ShopService/',
    	namespaceURL:'http://ShopService.shop.univnantes.fr'
	});

	$.soap({
		method: 'getItemList',
		data: {
			devise: $("#select-devise").val()
		},
		soap12: true,
		success: function (soapResponse) {
		    console.log(soapResponse);
		    updateProducts(soapResponse.toJSON());
		},
		error: function (soapResponse) {
		    console.log('that other server might be down...');
		    console.log(soapResponse);
		    console.log(soapResponse.toString());
		}
	});
};

var cleanProducts = function(o)
{
	return o['#document']['ns:getItemListResponse']['ns:return'];
};


var products;
var updateProducts = function(p)
{
	products=cleanProducts(p);
	console.log(products);
	var divProd=$('#div-products');
	divProd.html("");
	for(var i =0; i<products.length;i++)
	{
		products[i].price._ = parseFloat(products[i].price._);
		var str = '<div class="col-md-3 col-sm-6 hero-feature">'+
            '<div class="thumbnail">'+
                '<div class="caption">'+
                    '<h3>'+products[i].name._+'</h3>'+
                    '<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>'+
                    '<div class="div-qt">'+
                        '<span class="span-qt">'+
                            '<span>Quantity:</span><input type="text" id="spinner-qt-item-'+products[i].refId._+'" data-index="'+i+'" class="spinner-qt" value="1"/>'+
                        '</span>'+
                        '<span class="span-price">'+
                            '<span id="price-item-'+products[i].refId._+'">'+products[i].price._.toFixed(2)+'</span><span class="span_devise">'+$("#select-devise option:selected").text()+'</span>'+
                        '</span>'+
                    '</div>'+
                    '<p>'+
                        '<a href="#" class="btn btn-primary btn-buy" data-toggle="modal" data-target="#myModal" onclick="prepareModal(\''+products[i].refId._+'\', '+i+')" >Buy Now!</a>'+
                    '</p>'+
                '</div>'+
            '</div>'+
        '</div>';

        divProd.append(str);
	}

	$( ".spinner-qt" ).spinner({
		min: 1, 
		spin: function(event,ui){
			var me =$(this);
			var itemId = me.attr("id").split("-")[3];
		    var price = ui.value*products[parseInt(me.data("index"))].price._;

		    //console.log("spin : "+itemId+" - "+me.val()" - "+price);
		    $("#price-item-"+itemId).html(price.toFixed(2));
		}
	});
};

function prepareModal(itemId, index){
	$("#myModal").attr("data-itemId", itemId);
	$("#modal-qt").html($("#spinner-qt-item-"+itemId).val());
	$("#modal-product-name").html(products[index].name._);
	$("#modal-price").html($("#price-item-"+itemId).html());
	$("#modal-devise").html($("#select-devise option:selected").text());
}

function confirmBuy(){
	$.soap({
		method: 'buy',
		data: {
			itemId: $("#myModal").attr("data-itemId"),
			qt: parseInt($("#modal-qt").html()),
			devise: $("#select-devise").val(),
			clientFirstName: $("#modal-cfn").val(),
			clientName: $("#modal-cn").val(),
			numero: $("#modal-n").val,
			expirationMonth: parseInt($("#modal-em").val()),
			expirationYear: parseInt($("#modal-ey").val()),
			key: $("#modal-k").val()
		},
		soap12: true,
		success: function (soapResponse) {
		    console.log(soapResponse);
		    var cleanResp = soapResponse.toJSON()['#document']['ns:buyResponse']['ns:return'];

		    if (cleanResp=="true"){
		    	alert("Commande ok.");
		    }
		    else{
		    	alert("Commande fail.");
		    }
		},
		error: function (soapResponse) {
		    alert("Commande fail.");
		    console.log('that other server might be down...');
		    console.log(soapResponse);
		    console.log(soapResponse.toString());
		}
	});
}

function refreshPrices(i){
	$.soap({
		method: 'getPrice',
		data: {
			itemId: products[i].refId._,
			devise: $("#select-devise").val()
		},
		soap12: true,
		success: function (soapResponse) {
		    console.log(soapResponse);
		    //console.log(i);
		    var cleanResp = soapResponse.toJSON()['#document']['ns:getPriceResponse']['ns:return'];
		    //console.log(cleanResp);
		    products[i].price._=parseFloat(cleanResp).toFixed(2);

		    var price = cleanResp*parseFloat($("#spinner-qt-item-"+products[i].refId._).val());
		    $("#price-item-"+products[i].refId._).html(price.toFixed(2));
		},
		error: function (soapResponse) {
		    console.log('that other server might be down...');
		    console.log(soapResponse);
		    console.log(soapResponse.toString());
		}
	});
}

$(function() {
    
    $("#select-devise").change(function(){
        $(".span_devise").text($("#select-devise option:selected").text());

        console.log(products);

        for (var i = products.length - 1; i >= 0; i--) {
        	refreshPrices(i);
        }
       
    });

    refreshProducts();
    console.log(products);

    $("#modal-em").spinner({
    	min: 1,
    	max: 12
    });
    $("#modal-ey").spinner({
    	min: 2015
    });


});