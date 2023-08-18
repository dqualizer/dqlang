package io.github.dqualizer.dqlang.types.load_test_configuration;

import com.fasterxml.jackson.annotation.*;
import io.github.dqualizer.dqlang.types.domain_architecture_mapping.Endpoint;
import io.github.dqualizer.dqlang.types.rqa_definition.Artifact;
import io.github.dqualizer.dqlang.types.rqa_definition.ResponseMeasure;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import java.beans.ConstructorProperties;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * One particular load test
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "artifact",
        "description",
        "stimulus",
        "response_measure",
        "endpoint"
})
@Generated("jsonschema2pojo")
public class LoadTest {

    /**
     * (Required)
     */

    @JsonProperty("artifact")
    @Valid

    public Artifact artifact;
    /**
     * Description of this loadtest (Can be null)
     */

    @JsonProperty("description")
    @JsonPropertyDescription("Description of this loadtest")
    public String description;
    /**
     * (Required)
     */
    @JsonProperty("stimulus")

    public Object stimulus;
    /**
     * (Required)
     */
    @JsonProperty("response_measure")
    @Valid

    public ResponseMeasure responseMeasure;
    /**
     * (Required)
     */

    @JsonProperty("endpoint")
    @Valid

    public Endpoint endpoint;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public LoadTest() {
    }

    /**
     * @param source the object being copied
     */
    public LoadTest(LoadTest source) {
        super();
        this.artifact = source.artifact;
        this.description = source.description;
        this.stimulus = source.stimulus;
        this.responseMeasure = source.responseMeasure;
        this.endpoint = source.endpoint;
    }

    /**
     * @param description Description of this loadtest.
     */
    @ConstructorProperties({
            "artifact",
            "description",
            "stimulus",
            "responseMeasure",
            "endpoint"
    })
    public LoadTest(Artifact artifact,
                    String description,
                    Object stimulus,
                    ResponseMeasure responseMeasure,
                    Endpoint endpoint) {
        super();
        this.artifact = artifact;
        this.description = description;
        this.stimulus = stimulus;
        this.responseMeasure = responseMeasure;
        this.endpoint = endpoint;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LoadTest.class.getName())
          .append('@')
          .append(Integer.toHexString(System.identityHashCode(this)))
          .append('[');
        sb.append("artifact");
        sb.append('=');
        sb.append(((this.artifact == null) ? "<null>" : this.artifact));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("stimulus");
        sb.append('=');
        sb.append(((this.stimulus == null) ? "<null>" : this.stimulus));
        sb.append(',');
        sb.append("responseMeasure");
        sb.append('=');
        sb.append(((this.responseMeasure == null) ? "<null>" : this.responseMeasure));
        sb.append(',');
        sb.append("endpoint");
        sb.append('=');
        sb.append(((this.endpoint == null) ? "<null>" : this.endpoint));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.artifact == null) ? 0 : this.artifact.hashCode()));
        result = ((result * 31) + ((this.responseMeasure == null) ? 0 : this.responseMeasure.hashCode()));
        result = ((result * 31) + ((this.endpoint == null) ? 0 : this.endpoint.hashCode()));
        result = ((result * 31) + ((this.stimulus == null) ? 0 : this.stimulus.hashCode()));
        result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoadTest) == false) {
            return false;
        }
        LoadTest rhs = ((LoadTest) other);
        return (((((((this.artifact == rhs.artifact) || ((this.artifact != null) && this.artifact.equals(rhs.artifact))) && ((this.responseMeasure == rhs.responseMeasure) || ((this.responseMeasure != null) && this.responseMeasure.equals(
                rhs.responseMeasure)))) && ((this.endpoint == rhs.endpoint) || ((this.endpoint != null) && this.endpoint.equals(
                rhs.endpoint)))) && ((this.stimulus == rhs.stimulus) || ((this.stimulus != null) && this.stimulus.equals(
                rhs.stimulus)))) && ((this.description == rhs.description) || ((this.description != null) && this.description.equals(
                rhs.description)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(
                rhs.additionalProperties))));
    }

}
