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
}