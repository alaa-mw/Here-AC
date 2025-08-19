class ProductState{
constructor(){
this.initProducts()
}
initProducts(){
const initialProducts = [{id: '1', name: 'Product 1 Camera', desc: 'Capture moments with this amazing camera.', image: 'https://images.unsplash.com/photo-1516035069371-29a1b244cc32'}, {id: '2', name: 'Product 2 Laptop', desc: 'High performance laptop for all your needs.', image: 'https://images.unsplash.com/photo-1496181133206-80ce9b88a853'}, {id: '3', name: 'Product 3 Wireless Headphones', desc: 'Experience premium sound quality wirelessly.', image: 'https://images.unsplash.com/photo-1505740420928-5e560c06d30e'}];this.products=(initialProducts)
}
addProduct(product){
const newProduct = {...product
, id: Math.random().toString(36).substring(2, 9)};const updatedProducts = [...this.products
, newProduct];this.products=(updatedProducts)
}
updateProduct(updatedProduct){
const updatedProducts = this.products.map(p => p.id
 === updatedProduct.id
?updatedProduct:p);this.products=(updatedProducts)
}
deleteProduct(id){
const updatedProducts = this.products.filter(p => p.id
 !== id);this.products=(updatedProducts)
}
}
const state = new ProductState();
class AddProductComponent {
    formProduct = {name: '', desc: '', image: ''};

    editingId = null;

function ngOnInitAddProductComponent( id ){
editingId
 = id
 if (id){
const existingProduct = state.products.find(p => p.id
 === id);

 if (existingProduct){
formProduct
 = existingProduct
}
}

 else {
formProduct
 = {name: '', desc: '', image: ''}
}

}

}
class ProductDetailsComponent {
    selectedProduct = null;

constructor(route,productState,router) {}
function ngOnInitProductDetailsComponent( id ){

 if (id){
selectedProduct
 = state.products.find(p => p.id
 === id)
}

}

}
