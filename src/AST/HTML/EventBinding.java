package AST.HTML;

import AST.CustomStringBuilder;

public class EventBinding implements HtmlBinding{
    private String eventName ;
    private String eventValue ;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventValue() {
        return eventValue;
    }

    public void setEventValue(String eventValue) {
        this.eventValue = eventValue;
    }

    @Override
    public String toString() {
        CustomStringBuilder sb = new CustomStringBuilder();
        sb.appendTabOpenScope("EventBinding{\n");
        if (eventName != null ) {
            sb.appendTab("eventName :").append(eventName).append("\n");

        }
        if (eventValue != null ) {
            sb.appendTab("eventValue :").append(eventValue).append("\n");

        }
        sb.appendTabCloseScope("}\n");
        return sb.toString();
    }
}
