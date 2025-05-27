// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A [BusDescriptor] defines settings for edges routed on a common bus and forming a bus substructure for [HierarchicLayout].
 * @see [HierarchicLayout.BUS_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutBusDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new instance of a [BusDescriptor] with the default values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutBusDescriptor%23BusDescriptor-constructor-BusDescriptor">Online Documentation</a>
 */
@JsName("HierarchicLayoutBusDescriptor")
external open class BusDescriptor  () : YObject {

/**
 * Gets or sets the maximum number of nodes in a layer that are placed after the common bus segment.
 * 
 * Default value - `0`. If the maximum number of nodes before the bus is `0` too, then the number of nodes is unrestricted, otherwise all nodes are placed before the bus.
 * @throws ArgumentError if the given node count is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutBusDescriptor%23maximumNodesAfterBus">Online Documentation</a>
 */
open var maximumNodesAfterBus: Int
/**
 * Gets or sets the maximum number of nodes in a layer that are placed before the common bus segment.
 * 
 * Default value - `0`. If the maximum number of nodes after the bus is `0` too, then the number of nodes is unrestricted, otherwise all nodes are placed after the bus.
 * @throws ArgumentError if the given node count is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutBusDescriptor%23maximumNodesBeforeBus">Online Documentation</a>
 */
open var maximumNodesBeforeBus: Int

companion object : ClassMetadata<BusDescriptor> {
/**
 * A data provider key for assigning nodes to a specific side of the common bus.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutBusDescriptor%23PLACE_BEFORE_BUS_DP_KEY">Online Documentation</a>
 */
 val PLACE_BEFORE_BUS_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for assigning nodes to specific layers relative to the root node of the bus.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutBusDescriptor%23ROOT_OFFSET_DP_KEY">Online Documentation</a>
 */
 val ROOT_OFFSET_DP_KEY: NodeDpKey<Double>
}
}

inline fun BusDescriptor(
    block: BusDescriptor.() -> Unit
): BusDescriptor {
    return BusDescriptor()
        .apply(block)
}
