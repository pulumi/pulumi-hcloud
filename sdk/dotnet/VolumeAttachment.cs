// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.HCloud
{
    /// <summary>
    /// Provides a Hetzner Cloud Volume attachment to attach a Volume to a Hetzner Cloud Server. Deleting a Volume Attachment will detach the Volume from the Server.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using HCloud = Pulumi.HCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var node1 = new HCloud.Server("node1", new()
    ///     {
    ///         Name = "node1",
    ///         Image = "debian-11",
    ///         ServerType = "cx22",
    ///         Datacenter = "nbg1-dc3",
    ///     });
    /// 
    ///     var master = new HCloud.Volume("master", new()
    ///     {
    ///         Location = "nbg1",
    ///         Size = 10,
    ///     });
    /// 
    ///     var main = new HCloud.VolumeAttachment("main", new()
    ///     {
    ///         VolumeId = master.Id,
    ///         ServerId = node1.Id,
    ///         Automount = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Volume Attachments can be imported using the `volume_id`:
    /// 
    /// ```sh
    /// $ pulumi import hcloud:index/volumeAttachment:VolumeAttachment example "$VOLUME_ID"
    /// ```
    /// </summary>
    [HCloudResourceType("hcloud:index/volumeAttachment:VolumeAttachment")]
    public partial class VolumeAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Automount the volume upon attaching it.
        /// </summary>
        [Output("automount")]
        public Output<bool> Automount { get; private set; } = null!;

        /// <summary>
        /// Server to attach the Volume to.
        /// </summary>
        [Output("serverId")]
        public Output<int> ServerId { get; private set; } = null!;

        /// <summary>
        /// ID of the Volume.
        /// </summary>
        [Output("volumeId")]
        public Output<int> VolumeId { get; private set; } = null!;


        /// <summary>
        /// Create a VolumeAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VolumeAttachment(string name, VolumeAttachmentArgs args, CustomResourceOptions? options = null)
            : base("hcloud:index/volumeAttachment:VolumeAttachment", name, args ?? new VolumeAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VolumeAttachment(string name, Input<string> id, VolumeAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("hcloud:index/volumeAttachment:VolumeAttachment", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing VolumeAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VolumeAttachment Get(string name, Input<string> id, VolumeAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new VolumeAttachment(name, id, state, options);
        }
    }

    public sealed class VolumeAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Automount the volume upon attaching it.
        /// </summary>
        [Input("automount")]
        public Input<bool>? Automount { get; set; }

        /// <summary>
        /// Server to attach the Volume to.
        /// </summary>
        [Input("serverId", required: true)]
        public Input<int> ServerId { get; set; } = null!;

        /// <summary>
        /// ID of the Volume.
        /// </summary>
        [Input("volumeId", required: true)]
        public Input<int> VolumeId { get; set; } = null!;

        public VolumeAttachmentArgs()
        {
        }
        public static new VolumeAttachmentArgs Empty => new VolumeAttachmentArgs();
    }

    public sealed class VolumeAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Automount the volume upon attaching it.
        /// </summary>
        [Input("automount")]
        public Input<bool>? Automount { get; set; }

        /// <summary>
        /// Server to attach the Volume to.
        /// </summary>
        [Input("serverId")]
        public Input<int>? ServerId { get; set; }

        /// <summary>
        /// ID of the Volume.
        /// </summary>
        [Input("volumeId")]
        public Input<int>? VolumeId { get; set; }

        public VolumeAttachmentState()
        {
        }
        public static new VolumeAttachmentState Empty => new VolumeAttachmentState();
    }
}
