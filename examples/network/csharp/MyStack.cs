using Pulumi;
using HCloud = Pulumi.HCloud;

class MyStack : Stack
{
    public MyStack()
    {
        var network = new HCloud.Network("demo-network", new HCloud.NetworkArgs
        {
            IpRange = "10.0.1.0/24",
        });

        this.NetworkName = network.Name;
    }

    [Output] public Output<string> NetworkName { get; set; }
}
