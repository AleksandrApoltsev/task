package tasks.model;

import java.util.List;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonIgnoreProperties;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultsModel {
    @JsonProperty("results")
    private List<GenderModel> results = null;
    @JsonProperty("info")
    private InfoModel info;
}