
package us.kbase.kbasecollections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import us.kbase.common.service.Tuple2;


/**
 * <p>Original spec-file type: FeatureList</p>
 * <pre>
 * @optional description
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "description",
    "elements"
})
public class FeatureList {

    @JsonProperty("description")
    private java.lang.String description;
    @JsonProperty("elements")
    private List<Tuple2 <String, String>> elements;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("description")
    public java.lang.String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public FeatureList withDescription(java.lang.String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("elements")
    public List<Tuple2 <String, String>> getElements() {
        return elements;
    }

    @JsonProperty("elements")
    public void setElements(List<Tuple2 <String, String>> elements) {
        this.elements = elements;
    }

    public FeatureList withElements(List<Tuple2 <String, String>> elements) {
        this.elements = elements;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((("FeatureList"+" [description=")+ description)+", elements=")+ elements)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
