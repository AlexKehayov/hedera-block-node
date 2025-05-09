// SPDX-License-Identifier: Apache-2.0
import org.hiero.block.node.subscriber.SubscriberServicePlugin;

// SPDX-License-Identifier: Apache-2.0
module org.hiero.block.node.subscriber {
    uses com.swirlds.config.api.spi.ConfigurationBuilderFactory;

    requires transitive com.hedera.pbj.runtime;
    requires transitive org.hiero.block.node.spi;
    requires transitive org.hiero.block.protobuf;
    requires com.swirlds.metrics.api;
    requires com.github.spotbugs.annotations;

    provides org.hiero.block.node.spi.BlockNodePlugin with
            SubscriberServicePlugin;
}
