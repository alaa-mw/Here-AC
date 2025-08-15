class AppComponent {
}
class ProductListComponent {
    products$;

    selectedProduct$;

constructor(productState,router) {;;}
goToDetails(id){;}
deleteProduct(event,id){;;}
editProduct(event,product){;;;}
}
class ProductDetailsComponent {
    product;

constructor(route,productState,router) {}
ngOnInit(){constid = this.route.snapshot.paramMapget('id');;if ()}
}
class AddProductComponent {
    newProduct = {name: '', desc: '', image: ''};

    editingId = null;

constructor(productState,router,route) {}
ngOnInit(){;}
onSubmit(){if ()else ;}
cancel(){;}
}
		<!-- Interface Declaration: Product -->
		<!-- Service Block -->
