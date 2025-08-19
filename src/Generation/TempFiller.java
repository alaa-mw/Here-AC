package Generation;

import java.util.HashMap;
import java.util.Map;

public  class TempFiller {

    // Class field properly declared
    private static Map<String, ComponentModel> componentModelsFiller = new HashMap<>();
    public static void fill(Map<String, ComponentModel> map) {

        // 1. ProductListComponent
        ComponentModel productList = new ComponentModel();

        productList.getFunctions().add(new ComponentFunction("ngOnInit", ""));
        productList.getFunctions().add(new ComponentFunction("goToDetails", "handleRoute(`/product/${id}`);"));
        productList.getFunctions().add(new ComponentFunction("deleteProduct", "state.deleteProduct(id);\nhandleRoute('/');"));
        productList.getFunctions().add(new ComponentFunction("editProduct", "handleRoute(`/edit/${id}`);"));

        productList.setRender("renderList");
        productList.setDomElement( new DomElement("listSection", "product-list-section") );

        productList.getEvents().add(new ComponentEvent("goToDetails",null, "details-btn", "true"));
        productList.getEvents().add(new ComponentEvent("editProduct",null, "edit-btn", "true"));
        productList.getEvents().add(new ComponentEvent("deleteProduct", null,"delete-btn", "true"));

        map.put("ProductListComponent", productList);

        // 2. AddProductComponent
        ComponentModel addProduct = new ComponentModel();


        addProduct.getFunctions().add(new ComponentFunction("ngOnInit", ""));
        addProduct.getFunctions().add(new ComponentFunction("onSubmit",
                "e.preventDefault();\nconsole.log(formProduct)\nif (editingId) {\n" +
                        "state.updateProduct({\nid: editingId,\n...formProduct\n});\n} else {\n" +
                        "state.addProduct(formProduct);\n}\nhandleRoute('/');"));
        addProduct.getFunctions().add(new ComponentFunction("cancel", "e.preventDefault();\nhandleRoute('/');"));

        addProduct.setRender("renderForm");
        addProduct.setDomElement(new DomElement("formSection", "add-edit-product-section"));

        addProduct.getEvents().add(new ComponentEvent("onSubmit", null,"submit", "false"));
        addProduct.getEvents().add(new ComponentEvent("cancel", null,"cancel", "false"));

        map.put("AddProductComponent", addProduct);

        // 3. ProductDetailsComponent
        ComponentModel productDetails = new ComponentModel();

        productDetails.getFunctions().add(new ComponentFunction("ngOnInit", ""));

        productDetails.setRender("renderDetails");
        productDetails.setDomElement(new DomElement("detailsSection", "product-details-section"));

        map.put("ProductDetailsComponent", productDetails);
    }

    public static Map<String, ComponentModel> getComponentModels() {
        if (componentModelsFiller.isEmpty()) {
            fill(componentModelsFiller);
        }
        return componentModelsFiller;
    }

}
