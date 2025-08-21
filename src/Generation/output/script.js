class ProductState{
constructor(){
this.initProducts()
}
initProducts(){
const initialProducts = [{id: '1', name: 'Product 1 Camera', desc: 'Capture moments with this amazing camera.', image: 'https://images.unsplash.com/photo-1516035069371-29a1b244cc32'}, {id: '2', name: 'Product 2 Laptop', desc: 'High performance laptop for all your needs.', image: 'https://images.unsplash.com/photo-1496181133206-80ce9b88a853'}, {id: '3', name: 'Product 3 Wireless Headphones', desc: 'Experience premium sound quality wirelessly.', image: 'https://images.unsplash.com/photo-1505740420928-5e560c06d30e'}];this.products=(initialProducts);
}
addProduct(product){
const newProduct = {...product
, id: Math.random().toString(36).substring(2, 9)};this.products=([...this.products
, newProduct]);
}
deleteProduct(id){
const updatedProducts = this.products.filter(p => p.id
 !== id);this.products=(updatedProducts);
}
updateProduct(updatedProduct){
const updatedProducts = this.products.map(product => product.id
 === updatedProduct.id
?updatedProduct:product);this.products=(updatedProducts);
}
}
const productState = new ProductState();    let products ;


function goToDetailsProductListComponent(id){
handleRoute(`/product/${id}`);
}

function deleteProductProductListComponent(event,id){
event.stopPropagation();productState.deleteProduct(id);handleRoute('/');
}

function editProductProductListComponent(event,id){
event.stopPropagation();handleRoute(`/edit/${id}`);
}

function renderProductListComponent() {
const template = 
productState.products.map(product => `
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
    let selectedProduct = null;


function ngOnInitProductDetailsComponent( id ){

 if (id){
selectedProduct
 = productState.products.find(p => p.id
 === id);;
}

}

function renderProductDetailsComponent() {
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
` : `  	<p>
		Product		not		found
	</p>

` 
productDetailsSection.innerHTML = template;
}
    let formProduct = {name: '', desc: '', image: ''};

    let editingId = null;


function ngOnInitAddProductComponent( id ){
editingId
 = id;
 if (id){
const existingProduct = productState.products.find(p => p.id
 === id);

 if (existingProduct){
formProduct
 = existingProduct;
};
}
else {
formProduct
 = {name: '', desc: '', image: ''};
}

}

function onSubmitAddProductComponent(){

 if (editingId
){
productState.updateProduct({id: editingId
, ...formProduct
});
}
else {
productState.addProduct(formProduct
);
}
handleRoute('/');
}

function cancelAddProductComponent(){
handleRoute('/');
}

function renderAddProductComponent() {
const template = 
`
<form id="product-form" >
	<div>
		<label>
			Name
		</label>
		<input value="${formProduct.name}" name="name"  />

	</div>
	<div>
		<label>
			Description
		</label>
		<input value="${formProduct.desc}" name="desc"  />

	</div>
	<div>
		<label>
			Image			URL
		</label>
		<input value="${formProduct.image}" name="image"  />

	</div>
	<button id="submit"  type="submit" >
${editingId?'Edit Product':'Add Product'}
	</button>
	<button id="cancel"  type="button" >
		Cancel
	</button>

</form>
`;
addEditProductSection.innerHTML = template;
}

function setActiveNav(navId) {
  document.querySelectorAll('nav a').forEach(x => x.classList.remove('active'));
  if (navId) document.getElementById(navId).classList.add('active');
 }

// ===== Generated Routing =====
function handleRoute(path) {
    history.pushState(null, '', path);
    const idAddProduct = path.match(/^\/edit\/([^\/]+)$/);
    const idProductDetails = path.match(/^\/product\/([^\/]+)$/);
    
    if (path.includes('/add')) {
        ngOnInitAddProductComponent(null);
        renderAddProductComponent();
        showSection(addEditProductSection);
        setActiveNav('nav-add');
    }
    else if (path.includes('/edit')) {
        ngOnInitAddProductComponent(idAddProduct[1]);
        renderAddProductComponent();
        showSection(addEditProductSection);
    }
    else if (path.includes('/product')) {
        ngOnInitProductDetailsComponent(idProductDetails[1]);
        renderProductDetailsComponent();
        showSection(productDetailsSection);
    }
    else if (path.includes('/')) {
        renderProductListComponent();
        showSection(productListSection);
        setActiveNav('nav-list');
    }
}

function showSection(section) {
  [addEditProductSection, productDetailsSection, productListSection].forEach(s => s.style.display = 'none');
  section.style.display = 'block';
}

 // HANDLE browser back/forward buttons
  window.addEventListener('popstate', () => {
    handleRoute(window.location.pathname);
  }); 
const navAdd = document.getElementById('nav-add');
const addEditProductSection = document.getElementById('add-edit-product-section');
const productListSection = document.getElementById('product-list-section');
const productDetailsSection = document.getElementById('product-details-section');


// ===== Generated Event Listener =====
addEditProductSection.addEventListener("input", (e) => {
  formProduct[e.target.name] = e.target.value;
});

addEditProductSection.addEventListener('click', e => {
const id = e.target.dataset.id; 
  if (e.target.id === 'submit') {
  e.preventDefault();
 if (editingId
){
productState.updateProduct({id: editingId
, ...formProduct
});
}
else {
productState.addProduct(formProduct
);
}
handleRoute('/');
  }
});

addEditProductSection.addEventListener('click', e => {
const id = e.target.dataset.id; 
  if (e.target.id === 'cancel') {
	handleRoute('/');
  }
});

productListSection.addEventListener('click', e => {
const id = e.target.dataset.id; 
  if (e.target.id === 'details-btn') {
	handleRoute(`/product/${id}`);
  }
});

productListSection.addEventListener('click', e => {
const id = e.target.dataset.id; 
  if (e.target.id === 'edit-btn') {
	event.preventDefault();handleRoute(`/edit/${id}`);
  }
});

productListSection.addEventListener('click', e => {
const id = e.target.dataset.id; 
  if (e.target.id === 'delete-btn') {
	event.preventDefault();productState.deleteProduct(id);handleRoute('/');
  }
});



// ===== Generated Event Listener =====

document.getElementById('nav-list').addEventListener('click', e => {
   e.preventDefault();
   handleRoute('/');
});

document.getElementById('nav-add').addEventListener('click', e => {
   e.preventDefault();
   handleRoute('/add');
});

  renderProductListComponent();
  handleRoute(window.location.pathname);