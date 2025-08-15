package Generation;

import java.util.HashMap;
import java.util.Map;

public  class TempFiller {

    // Class field properly declared
    private static Map<String, ComponentModel> componentModelsFiller = new HashMap<>();
    public static void fill(Map<String, ComponentModel> map) {

        // 1. ProductListComponent
        ComponentModel productList = new ComponentModel();
        productList.getAttributes().add("products$");
        productList.setNgOnInit(null);

        productList.getFunctions().add(new ComponentFunction("goToDetails", "handleRoute(`/product/${id}`);"));
        productList.getFunctions().add(new ComponentFunction("deleteProduct", "state.deleteProduct(id);\nhandleRoute('/');"));
        productList.getFunctions().add(new ComponentFunction("editProduct", "handleRoute(`/edit/${id}`);"));

        productList.setRender("renderList");
        productList.getDomElements().add( new DomElement("listSection", "product-list-section") );

        productList.getEvents().add(new ComponentEvent("goToDetails", "details-btn", true));
        productList.getEvents().add(new ComponentEvent("editProduct", "edit-btn", true));
        productList.getEvents().add(new ComponentEvent("deleteProduct", "delete-btn", true));

        map.put("ProductListComponent", productList);

        // 2. AddProductComponent
        ComponentModel addProduct = new ComponentModel();
        addProduct.getAttributes().add("formProduct");
        addProduct.getAttributes().add("editingId");
        addProduct.setNgOnInit("ngOninitForm");

        addProduct.getFunctions().add(new ComponentFunction("onSubmit",
                "e.preventDefault();\nconsole.log(formProduct)\nif (editingId) {\n" +
                        "state.updateProduct({\nid: editingId,\n...formProduct\n});\n} else {\n" +
                        "state.addProduct(formProduct);\n}\nhandleRoute('/');"));
        addProduct.getFunctions().add(new ComponentFunction("cancel", "e.preventDefault();\nhandleRoute('/');"));

        addProduct.setRender("renderForm");
        addProduct.getDomElements().add(new DomElement("formSection", "add-edit-product-section"));
        addProduct.getDomElements().add(new DomElement("form", "product-form"));

        addProduct.getEvents().add(new ComponentEvent("onSubmit", "submit", false));
        addProduct.getEvents().add(new ComponentEvent("cancel", "cancel", false));

        map.put("AddProductComponent", addProduct);

        // 3. ProductDetailsComponent
        ComponentModel productDetails = new ComponentModel();
        productDetails.getAttributes().add("selectedProduct");
        productDetails.setNgOnInit("ngOnInitDetails");
        productDetails.setRender("renderDetails");
        productDetails.getDomElements().add(new DomElement("detailsSection", "product-details-section"));

        map.put("ProductDetailsComponent", productDetails);
    }

    public static Map<String, ComponentModel> getComponentModels() {
        if (componentModelsFiller.isEmpty()) {
            fill(componentModelsFiller);
        }
        return componentModelsFiller;
    }

}
