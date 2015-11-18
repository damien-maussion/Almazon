function test(){
	alert("Hello World!");
	$.soap({
    	url: 'http://localhost:9763/services/ShopService/',
    	namespaceURL:'http://ShopService.shop.univnantes.fr'
	});

	$.soap({
		method: 'getExchangeRate',
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

$(document).ready(function(){
    $('#myTable').DataTable();
});

var cleanProducts = function(o)
{
	return o['#document']['ns:getExchangeRateResponse']['ns:return'];
};

var updateProducts = function(products)
{
	products=cleanProducts(products);
	console.log(products);
	alert(products);
};
