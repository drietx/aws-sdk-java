/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model.transform;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StreamingDistributionConfigWithTags StAX Unmarshaller
 */
public class StreamingDistributionConfigWithTagsStaxUnmarshaller
        implements
        Unmarshaller<StreamingDistributionConfigWithTags, StaxUnmarshallerContext> {

    public StreamingDistributionConfigWithTags unmarshall(
            StaxUnmarshallerContext context) throws Exception {
        StreamingDistributionConfigWithTags streamingDistributionConfigWithTags = new StreamingDistributionConfigWithTags();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return streamingDistributionConfigWithTags;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("StreamingDistributionConfig",
                        targetDepth)) {
                    streamingDistributionConfigWithTags
                            .setStreamingDistributionConfig(StreamingDistributionConfigStaxUnmarshaller
                                    .getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tags", targetDepth)) {
                    streamingDistributionConfigWithTags
                            .setTags(TagsStaxUnmarshaller.getInstance()
                                    .unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return streamingDistributionConfigWithTags;
                }
            }
        }
    }

    private static StreamingDistributionConfigWithTagsStaxUnmarshaller instance;

    public static StreamingDistributionConfigWithTagsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StreamingDistributionConfigWithTagsStaxUnmarshaller();
        return instance;
    }
}