class ProductService{
getProducts(){
return this.products
; 
}
getSelectedProduct(){
return this.selectedProduct
; 
}
selectProduct(product){
this.selectedProduct
 = product;
}
}
const productService = new ProductService();    let product = {name1: "sami1", pro1: {name2: "sami", pro2: {name3: "sami"}}};

    let product = {name1: "sami1", pro1: {name2: "sami", pro2: {name3: "sami"}}};

    let products = [];

    let selectedProduct = null;

    let userData = null;


function selectProductAppComponent(product){
productService.selectProduct(product);selectedProduct
 = productService.getSelectedProduct();
}

function loadAppComponent(){
this.userName
 = userData.r
;
}

    let x = 10;

    let message4 = 'Hello Test 3';



// ===== Generated Event Listener =====



// ===== Generated Event Listener =====

  renderProductListComponent();
  handleRoute(window.location.pathname);