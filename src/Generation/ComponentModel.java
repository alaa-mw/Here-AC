package Generation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ComponentModel {
    // class
    private List<String> attributes = new ArrayList<>();
    private List<ComponentFunction> functions = new ArrayList<>();
    // component
    private String render;
    private DomElement domElement ;
    private List<ComponentEvent> events = new ArrayList<>();

    // Getters and setters
    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    public List<ComponentFunction> getFunctions() {
        return functions;
    }

    public void setFunctions(List<ComponentFunction> functions) {
        this.functions = functions;
    }

    public String getRender() {
        return render;
    }

    public void setRender(String render) {
        this.render = render;
    }

    public DomElement getDomElement() {
        return domElement;
    }

    public void setDomElement(DomElement domElement) {
        this.domElement = domElement;
    }

    public List<ComponentEvent> getEvents() {
        return events;
    }

    public void setEvents(List<ComponentEvent> events) {
        this.events = events;
    }

    public String getNgOnInitFunction() {
        for (ComponentFunction fn : functions) {
            if (fn.getName().startsWith("ngOnInit")) {
                return fn.getName();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ComponentModel{" +
//                "attributes=" + attributes +'\n' +
//                ", ngOnInit='" + ngOnInit +'\''+'\n' +
                ", functions=" + functions +'\n' +
                ", render='" + render +'\''+'\n' +
                ", domElements=" + domElement +'\n' +
                ", events=" + events +'\n' +
                '}'+'\n'+'\n';
    }
}


class ComponentFunction {
    private String name;
    private String implement;

    public ComponentFunction(String name, String implement) {
        this.name = name;
        this.implement = implement;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getImplement() { return implement; }
    public void setImplement(String implement) { this.implement = implement; }

    @Override
    public String toString() {
        return "\nComponentFunction{" +
                "name='" + name + '\'' +
                ", implement='" + implement + '\'' +
                '}';
    }
}

class DomElement {
    private String constant;
    private String id;

    public DomElement(String constant, String id) {
        this.constant = constant;
        this.id = id;
    }

    // Getters and setters
    public String getConstant() { return constant; }
    public void setConstant(String constant) { this.constant = constant; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }


    @Override
    public String toString() {
        return "\nDomElement{" +
                "constant='" + constant + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

class ComponentEvent {
    private String buttonFunction;
    private String routerLink;
    private String id;
    private String reference;

    public ComponentEvent(String buttonFunction, String routerLink, String id, String reference) {
        this.buttonFunction = buttonFunction;
        this.routerLink = routerLink;
        this.id = id;
        this.reference = reference;
    }

    // Getters and setters
    public String getButtonFunction() { return buttonFunction; }
    public void setButtonFunction(String buttonFunction) { this.buttonFunction = buttonFunction; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getRouterLink() {
        return routerLink;
    }

    public void setRouterLink(String routerLink) {
        this.routerLink = routerLink;
    }

    @Override
    public String toString() {
        return "\nComponentEvent{" +
                "buttonFunction='" + buttonFunction + '\'' +
                ", routerLink='" + routerLink + '\'' +
                ", id='" + id + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}

/* for imagine
{
[key]>> "ProductListComponent": {

        "attributes":["products$"],
        "ngOnInit":null,
        "functions":[
        {
        "name":"goToDetails",
        "implement":"handleRoute(`/product/${id}`);"
        },
        {
        "name":"deleteProduct",
        "implement":"state.deleteProduct(id);\nhandleRoute('/'); "
        },
        {
        "name":"editProduct",
        "implement":"handleRoute(`/edit/${id}`);"
        }
        ],

        "render":"renderList",
        "domElement":
        {"const":"listSection","id":"product-list-section"}
        ,
        "events":[
        {"buttonFunction":"goToDetails", "id":"details-btn", "data-id":true},
        {"buttonFunction":"editProduct", "id":"edit-btn", "data-id":true},
        {"buttonFunction":"deleteProduct", "id":"delete-btn", "data-id":true}
        ]
        },
        "AddProductComponent":{

        "attributes":["formProduct","editingId"],
        "ngOnInit":"ngOninitForm",
        "functions":[
        {
        "name":"onSubmit",
        "implement":" e.preventDefault();\nconsole.log(formProduct)\nif (editingId) {\nstate.updateProduct({\nid: editingId,\n...formProduct\n});\n} else {\nstate.addProduct(formProduct);\n}\nhandleRoute('/');"},
        {
        "name":"cancel",
        "implement":" e.preventDefault();\nhandleRoute('/');"
        }
        ],

        "render":"renderForm",
        "domElement":
        {"const":"formSection","id":"add-edit-product-section"},

        "events":[
        {"buttonFunction":"onSubmit", "id":"submit", "data-id":false},
        {"buttonFunction":"cancel", "id":"cancel", "data-id":false}
        ]
        },

        "ProductDetailsComponent":{

        "attributes":["selectedProduct"],
        "ngOnInit":"ngOnInitDetails",
        "functions":[],

        "render":"renderDetails",
        "domElement":
        {"const":"detailsSection","id":"product-details-section"}
        ,
        "events":[]
        }
        }
        */