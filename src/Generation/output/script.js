class AppComponent {
}
function renderproductListSection() {
const template = 
state.products.map(product => `
<div class="product-item"  id="product-item" >
<h3>
${product.name}
</h3>
<div class="product-content" >
<img src= "${product.image}"  />
<div class="product-actions" >
<button id="details-btn" data-id="${product.id}" >
 Details
</button>
<button id="edit-btn" data-id="${product.id}" >
 Edit
</button>
<button id="delete-btn" data-id="${product.id}" >
 Delete
</button>

</div>

</div>

</div>
`).join('');
productListSection.innerHTML = template;
}
class ProductListComponent {
    products$;

constructor(productState,router) {;}
goToDetails(id){;}
deleteProduct(event,id){;;;}
editProduct(event,id){;;}
}
function renderproductDetailsSection() {
const template = 
selectedProduct 
? `<div>
<h1>
${selectedProduct.name}
</h1>
<p>
${selectedProduct.desc}
</p>
<img src= "${selectedProduct.image}"  />

</div>
: `<p>Product not found</p>`;
productDetailsSection.innerHTML = template;
}
class ProductDetailsComponent {
    selectedProduct;

constructor(route,productState,router) {}
ngOnInit(){constid = this.route.snapshot.paramMapget('id');;if ()}
}
function renderaddEditProductSection() {
const template = 
`
<form id="product-form" >
<div>
<label>
 Name
</label>
<input />

</div>
<div>
<label>
 Description
</label>
<input />

</div>
<div>
<label>
 Image URL
</label>
<input />

</div>
<button id="submit"  type="submit" >

</button>
<button id="cancel"  type="button" >
 Cancel
</button>

</form>
`;
addEditProductSection.innerHTML = template;
}
class AddProductComponent {
    formProduct = {name: '', desc: '', image: ''};

    editingId = null;

constructor(productState,router,route) {}
ngOnInit(){;}
onSubmit(){if ()else ;}
cancel(){;}
}
		<!-- Interface Declaration: Product -->
		<!-- Service Block -->
const addEditProductSection = document.getElementById('add-edit-product-section');
