class AppComponent {
}
function renderproduct-item() {
productitem.innerHTML = state.this.products.map(p=>`

<h3>${.product.name}
</h3>
<div class="product-content">
<img src="product.image" />
<div class="product-actions">
<button id="details-btn"> Details
</button>
<button id="edit-btn"> Edit
</button>
<button id="delete-btn"> Delete
</button>
</div>
</div>`).join('');
}
class ProductListComponent {
    products$;





}
class ProductDetailsComponent {
    selectedProduct;



}
class AddProductComponent {
    formProduct = {name: '', desc: '', image: ''};

    editingId = null;





}
		<!-- Interface Declaration: Product -->
		<!-- Service Block -->
const navlist = document.getElementById('nav-list');
const navadd = document.getElementById('nav-add');
const productlistsection = document.getElementById('product-list-section');
const productitem = document.getElementById('product-item');
const productdetailssection = document.getElementById('product-details-section');
const addeditproductsection = document.getElementById('add-edit-product-section');
const productform = document.getElementById('product-form');
const submit = document.getElementById('submit');
const cancel = document.getElementById('cancel');
