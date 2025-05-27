// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.Node
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * [AsIsLayerer] assigns nodes to layers by analyzing already existing node coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AsIsLayerer">Online Documentation</a>
 * 
 * @constructor Creates an instance of [AsIsLayerer] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AsIsLayerer%23AsIsLayerer-constructor-AsIsLayerer">Online Documentation</a>
 */
external open class AsIsLayerer  () : ILayerer {

/**
 * Gets or sets the maximum size of a node used for calculating layer overlaps.
 * 
 * Default value - [Number.MAX_VALUE]
 * @throws ArgumentError if the specified value is less than `0`
 * @see [nodeScalingFactor]
 * @see [nodeHalo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AsIsLayerer%23maximumNodeSize">Online Documentation</a>
 */
open var maximumNodeSize: Double
/**
 * Gets or sets the minimum size of a node used for calculating layer overlaps.
 * 
 * Default value - `0.0`
 * @throws ArgumentError if the specified value is less than `0`
 * @see [nodeScalingFactor]
 * @see [nodeHalo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AsIsLayerer%23minimumNodeSize">Online Documentation</a>
 */
open var minimumNodeSize: Double
/**
 * Gets or sets the size of the halo around a node, that means the insets that are used for calculating layer overlaps.
 * 
 * Default value - `0.0`
 * @see [nodeScalingFactor]
 * @see [minimumNodeSize]
 * @see [maximumNodeSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AsIsLayerer%23nodeHalo">Online Documentation</a>
 */
open var nodeHalo: Double
/**
 * Gets or sets the scaling factor used for scaling the size of the nodes.
 * 
 * Default value - `1.0`
 * @throws ArgumentError if the specified value is less than `0`
 * @see [minimumNodeSize]
 * @see [maximumNodeSize]
 * @see [nodeHalo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AsIsLayerer%23nodeScalingFactor">Online Documentation</a>
 */
open var nodeScalingFactor: Double
/**
 * Assigns all nodes of the graph to layers by analyzing already existing node coordinates and adds them to the [ILayers] instance.
 * @param [graph] the input graph
 * @param [layers] the [ILayers] instance that will be filled with the results of the calculation
 * @param [ldp] the [ILayoutDataProvider] used for querying information about the nodes and edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AsIsLayerer%23AsIsLayerer-method-assignLayers">Online Documentation</a>
 */
 override   fun assignLayers( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider )
/**
 * Callback used for calculating the lower (max) value of a given node.
 * @param [graph] the graph
 * @param [node] the node
 * @return the lower (max) of a given node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AsIsLayerer%23AsIsLayerer-method-getMax">Online Documentation</a>
 */
 open protected   fun getMax( graph: LayoutGraph ,
 node: Node ):Double
/**
 * Callback used for calculating the upper (min) value of a given node.
 * @param [graph] the graph
 * @param [node] the node
 * @return the upper (min) value of a given node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AsIsLayerer%23AsIsLayerer-method-getMin">Online Documentation</a>
 */
 open protected   fun getMin( graph: LayoutGraph ,
 node: Node ):Double

companion object : ClassMetadata<AsIsLayerer> {
}
}

inline fun AsIsLayerer(
    block: AsIsLayerer.() -> Unit
): AsIsLayerer {
    return AsIsLayerer()
        .apply(block)
}
