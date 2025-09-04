package AST.HTML;

public class AngularEvent {
    private EventName event;

    public AngularEvent(EventName event) {
        this.event = event;
    }

    public EventName getEvent() {
        return event;
    }

    public void setEvent(EventName event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "(" + event.toString() + ")";
    }

    // Translate (click) → onclick
    public String generateHTML() {
        if ("click".equals(event.toString())) {
            return "onclick";
        }
        if ("ngSubmit".equals(event.toString())) {
            return "id";
        }
        return "on" + event.generateHTML();
    }
}
