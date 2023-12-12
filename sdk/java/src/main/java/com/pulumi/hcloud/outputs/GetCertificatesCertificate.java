// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCertificatesCertificate {
    private String certificate;
    private String created;
    private List<String> domainNames;
    private String fingerprint;
    private Integer id;
    private Map<String,Object> labels;
    private @Nullable String name;
    private String notValidAfter;
    private String notValidBefore;
    private String type;

    private GetCertificatesCertificate() {}
    public String certificate() {
        return this.certificate;
    }
    public String created() {
        return this.created;
    }
    public List<String> domainNames() {
        return this.domainNames;
    }
    public String fingerprint() {
        return this.fingerprint;
    }
    public Integer id() {
        return this.id;
    }
    public Map<String,Object> labels() {
        return this.labels;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String notValidAfter() {
        return this.notValidAfter;
    }
    public String notValidBefore() {
        return this.notValidBefore;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificatesCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certificate;
        private String created;
        private List<String> domainNames;
        private String fingerprint;
        private Integer id;
        private Map<String,Object> labels;
        private @Nullable String name;
        private String notValidAfter;
        private String notValidBefore;
        private String type;
        public Builder() {}
        public Builder(GetCertificatesCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.created = defaults.created;
    	      this.domainNames = defaults.domainNames;
    	      this.fingerprint = defaults.fingerprint;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.notValidAfter = defaults.notValidAfter;
    	      this.notValidBefore = defaults.notValidBefore;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder certificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        @CustomType.Setter
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        @CustomType.Setter
        public Builder domainNames(List<String> domainNames) {
            this.domainNames = Objects.requireNonNull(domainNames);
            return this;
        }
        public Builder domainNames(String... domainNames) {
            return domainNames(List.of(domainNames));
        }
        @CustomType.Setter
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder notValidAfter(String notValidAfter) {
            this.notValidAfter = Objects.requireNonNull(notValidAfter);
            return this;
        }
        @CustomType.Setter
        public Builder notValidBefore(String notValidBefore) {
            this.notValidBefore = Objects.requireNonNull(notValidBefore);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetCertificatesCertificate build() {
            final var _resultValue = new GetCertificatesCertificate();
            _resultValue.certificate = certificate;
            _resultValue.created = created;
            _resultValue.domainNames = domainNames;
            _resultValue.fingerprint = fingerprint;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.name = name;
            _resultValue.notValidAfter = notValidAfter;
            _resultValue.notValidBefore = notValidBefore;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
