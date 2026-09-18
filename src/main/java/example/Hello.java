//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<Object, Response> {
    public Hello() {
    }

    public Response handleRequest(Object input, Context context) {
        return new Response("Hello from Lambda 4!", 200);
    }
}

