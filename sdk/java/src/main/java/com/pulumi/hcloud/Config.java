// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.hcloud;

import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("hcloud");
    public Optional<String> endpoint() {
        return Codegen.stringProp("endpoint").config(config).get();
    }
    public Optional<String> pollInterval() {
        return Codegen.stringProp("pollInterval").config(config).get();
    }
/**
 * The API token to access the Hetzner cloud.
 * 
 */
    public String token() {
        return Codegen.stringProp("token").config(config).require();
    }
}