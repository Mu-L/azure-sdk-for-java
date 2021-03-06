// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Base class for topology sink nodes. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@type",
        defaultImpl = SinkNodeBase.class)
@JsonTypeName("SinkNodeBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.IotHubMessageSink", value = IotHubMessageSink.class),
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.FileSink", value = FileSink.class),
    @JsonSubTypes.Type(name = "#Microsoft.VideoAnalyzer.VideoSink", value = VideoSink.class)
})
@Fluent
public class SinkNodeBase {
    /*
     * Node name. Must be unique within the topology.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * An array of upstream node references within the topology to be used as
     * inputs for this node.
     */
    @JsonProperty(value = "inputs", required = true)
    private List<NodeInput> inputs;

    /**
     * Creates an instance of SinkNodeBase class.
     *
     * @param name the name value to set.
     * @param inputs the inputs value to set.
     */
    @JsonCreator
    public SinkNodeBase(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "inputs", required = true) List<NodeInput> inputs) {
        this.name = name;
        this.inputs = inputs;
    }

    /**
     * Get the name property: Node name. Must be unique within the topology.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the inputs property: An array of upstream node references within the topology to be used as inputs for this
     * node.
     *
     * @return the inputs value.
     */
    public List<NodeInput> getInputs() {
        return this.inputs;
    }
}
