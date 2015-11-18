function test () {
	$.soap({
    	url: 'http://localhost:9763/services/ShopService/',
    	namespaceURL:'http://ShopService.shop.univnantes.fr'
	});

	$.soap({
		method: 'getItemList',
		data: {},
		soap12: true,
		success: function (soapResponse) {
		    // do stuff with soapResponse
		    console.log(soapResponse);
		    //console.log(soapResponse.toString());
		    //alert(soapResponse.toString());
		    updateProducts(soapResponse.toJSON());
		},
		error: function (soapResponse) {
		    console.log('that other server might be down...');
		    console.log(soapResponse);
		    console.log(soapResponse.toString());
		}
	});
}

var cleanProducts = function(o)
{
	return o['#document']['ns:getItemListResponse']['ns:return'];
};

var updateProducts = function(products)
{
	products=cleanProducts(products);
	console.log(products);
	alert(products);
	//$('.products').html("<ul></ul>");
	/*for(var i =0; i<products.length;i++)
	{
		$('.products ul').append().append('<li><div>'+products[i].name["_"]+'</div><div>Quantity: '+products[i].quantity["_"]+'</div><div>Price: '+products[i].price["_"]+'</div><div><button onclick="add(\''+products[i].name["_"]+'\')">Ajouter</button><div/></li>');
	}*/
};
