//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.io.IOException;
import java.net.URL;

public class Hello implements RequestHandler<Object, Response> {
    public Hello() {
    }

    public Response handleRequest(Object input, Context context) {

        context.getLogger().log("test");

        String data = "aaa";

        try {

          

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return new Response(data, 200);
    }
}

