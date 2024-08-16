// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
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
    private Map<String,String> labels;
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
    public Map<String,String> labels() {
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
        private Map<String,String> labels;
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
            if (certificate == null) {
              throw new MissingRequiredPropertyException("GetCertificatesCertificate", "certificate");
            }
            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder created(String created) {
            if (created == null) {
              throw new MissingRequiredPropertyException("GetCertificatesCertificate", "created");
            }
            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder domainNames(List<String> domainNames) {
            if (domainNames == null) {
              throw new MissingRequiredPropertyException("GetCertificatesCertificate", "domainNames");
            }
            this.domainNames = domainNames;
            return this;
        }
        public Builder domainNames(String... domainNames) {
            return domainNames(List.of(domainNames));
        }
        @CustomType.Setter
        public Builder fingerprint(String fingerprint) {
            if (fingerprint == null) {
              throw new MissingRequiredPropertyException("GetCertificatesCertificate", "fingerprint");
            }
            this.fingerprint = fingerprint;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCertificatesCertificate", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetCertificatesCertificate", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder notValidAfter(String notValidAfter) {
            if (notValidAfter == null) {
              throw new MissingRequiredPropertyException("GetCertificatesCertificate", "notValidAfter");
            }
            this.notValidAfter = notValidAfter;
            return this;
        }
        @CustomType.Setter
        public Builder notValidBefore(String notValidBefore) {
            if (notValidBefore == null) {
              throw new MissingRequiredPropertyException("GetCertificatesCertificate", "notValidBefore");
            }
            this.notValidBefore = notValidBefore;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetCertificatesCertificate", "type");
            }
            this.type = type;
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
