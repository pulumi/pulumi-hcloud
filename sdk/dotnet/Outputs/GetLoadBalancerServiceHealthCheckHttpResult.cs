// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud.Outputs
{

    [OutputType]
    public sealed class GetLoadBalancerServiceHealthCheckHttpResult
    {
        /// <summary>
        /// string) Domain we try to access when performing the Health Check.
        /// </summary>
        public readonly string Domain;
        /// <summary>
        /// (string) Path we try to access when performing the Health Check.
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// (string) Response we expect to be included in the Target response when a Health Check was performed.
        /// </summary>
        public readonly string Response;
        /// <summary>
        /// (list[int]) We expect that the target answers with these status codes. If not the target is marked as `unhealthy`.
        /// </summary>
        public readonly ImmutableArray<int> StatusCodes;
        /// <summary>
        /// (bool) Enable TLS certificate checking.
        /// </summary>
        public readonly bool Tls;

        [OutputConstructor]
        private GetLoadBalancerServiceHealthCheckHttpResult(
            string domain,

            string path,

            string response,

            ImmutableArray<int> statusCodes,

            bool tls)
        {
            Domain = domain;
            Path = path;
            Response = response;
            StatusCodes = statusCodes;
            Tls = tls;
        }
    }
}
