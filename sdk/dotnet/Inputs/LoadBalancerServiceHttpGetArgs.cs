// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud.Inputs
{

    public sealed class LoadBalancerServiceHttpGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("certificates")]
        private InputList<int>? _certificates;

        /// <summary>
        /// List of IDs from certificates which the Load Balancer has.
        /// </summary>
        public InputList<int> Certificates
        {
            get => _certificates ?? (_certificates = new InputList<int>());
            set => _certificates = value;
        }

        /// <summary>
        /// Lifetime of the cookie for sticky session (in seconds). Default: `300`
        /// </summary>
        [Input("cookieLifetime")]
        public Input<int>? CookieLifetime { get; set; }

        /// <summary>
        /// Name of the cookie for sticky session. Default: `HCLBSTICKY`
        /// </summary>
        [Input("cookieName")]
        public Input<string>? CookieName { get; set; }

        /// <summary>
        /// Redirect HTTP to HTTPS traffic. Only supported for services with `protocol` `https` using the default HTTP port `80`.
        /// </summary>
        [Input("redirectHttp")]
        public Input<bool>? RedirectHttp { get; set; }

        /// <summary>
        /// Enable sticky sessions
        /// </summary>
        [Input("stickySessions")]
        public Input<bool>? StickySessions { get; set; }

        public LoadBalancerServiceHttpGetArgs()
        {
        }
        public static new LoadBalancerServiceHttpGetArgs Empty => new LoadBalancerServiceHttpGetArgs();
    }
}
