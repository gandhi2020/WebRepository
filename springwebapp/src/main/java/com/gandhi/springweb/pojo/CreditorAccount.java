package com.gandhi.springweb.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "SchemeName", "Identification", "Name", "SecondaryIdentification" })
public class CreditorAccount {

	@JsonProperty("SchemeName")
	private String schemeName;
	@JsonProperty("Identification")
	private String identification;
	@JsonProperty("Name")
	private String name;
	@JsonProperty("SecondaryIdentification")
	private String secondaryIdentification;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("SchemeName")
	public String getSchemeName() {
		return schemeName;
	}

	@JsonProperty("SchemeName")
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	@JsonProperty("Identification")
	public String getIdentification() {
		return identification;
	}

	@JsonProperty("Identification")
	public void setIdentification(String identification) {
		this.identification = identification;
	}

	@JsonProperty("Name")
	public String getName() {
		return name;
	}

	@JsonProperty("Name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("SecondaryIdentification")
	public String getSecondaryIdentification() {
		return secondaryIdentification;
	}

	@JsonProperty("SecondaryIdentification")
	public void setSecondaryIdentification(String secondaryIdentification) {
		this.secondaryIdentification = secondaryIdentification;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
