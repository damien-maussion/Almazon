# Almazon
Services Project

# Import it

Import it as Maven project in eclipse

# To (re)build stubs

Generate .wsdl2 from BankService and SupplierServices
Put them in $Axis2/bin directory

```
cd $Axis2/bin
./wsdl2java.sh -uri BankService.wsdl -p fr.univnantes.shop.ShopService.BankStub -wv 2.0 -or
./wsdl2java.sh -uri SupplierService.wsdl -p fr.univnantes.shop.ShopService.SupplierStub -wv 2.0 -or
```

# Generate jars

```
mvn package
```

