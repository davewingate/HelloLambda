package hello.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SayHiLambda implements RequestHandler<SayHiRequest, SayHiResult> {

    private static final Logger log = LoggerFactory.getLogger(SayHiLambda.class);

    /**
     * We'll configure lambda to run this method in response to inbound events.
     */
    public SayHiResult handleRequest(SayHiRequest sayHiRequest, Context context) {
        try {
            log.info("received this request: {}", sayHiRequest);
            final String msg = String.format("%s, %s", sayHiRequest.getGreeting(), Joiner.on(" & ").join(sayHiRequest.getRecipients()));
            log.info(msg);
            return SayHiResult.success(msg);
        } catch (Exception ex) {
            log.error("failed to say hi", ex);
            return SayHiResult.fail();
        }
    }

    /**
     * convenience for running locally before deploying to lambda
     */
    public static void main(String args[]) {
        final SayHiRequest request = new SayHiRequest();
        request.setGreeting("Hello");
        request.setRecipients(ImmutableSet.of("John", "Paul", "George", "Ringo"));

        final SayHiResult result = new SayHiLambda().handleRequest(request, null /* lambda context */);
        System.out.println(result);
    }
}
