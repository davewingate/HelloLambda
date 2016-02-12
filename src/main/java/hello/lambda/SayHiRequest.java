package hello.lambda;

import java.util.Set;

/**
 * A pojo representing a request to say 'hi'.  Lambda runtime is gonna help us out by marshalling inbound event json
 * to an instance of this class.
 *
 * Here's some sample json corresponding to this request object.
 * <code>
 *     { "greeting": "Hi there", "recipients": ["Peter", "Paul", "Mary"] }
 * </code>
 */
public class SayHiRequest {
    private String greeting;
    private Set<String> recipients;

    public SayHiRequest() { /* no args constructor for json unmarshall */ }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Set<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(Set<String> recipients) {
        this.recipients = recipients;
    }

    public String toString() {
        return this.getClass().getName() + "(greeting=" + this.greeting + ", recipients=" + this.recipients + ")";
    }
}
