
package com.demo.app.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.util.Map;
import java.util.HashMap;

public class LambdaHandler implements RequestHandler<Map<String, Object>, Map<String, Object>> {

    @Override
    public Map<String, Object> handleRequest(Map<String, Object> input, Context context) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "WELCOME TO THE DEMO SESSION - SESHADRI KANDALA!");
        response.put("thankyou", "THANK YOU FOR JOINING THE DEMO SESSION.");
        return response;
    }
}
