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
 * This class is a default [IPortAllocator] implementation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortAllocator">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [DefaultPortAllocator] with default settings.
 * @see [defaultPortBorderGapRatio]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortAllocator%23DefaultPortAllocator-constructor-DefaultPortAllocator">Online Documentation</a>
 */
external open class DefaultPortAllocator  () : IPortAllocator {

/**
 * Gets or sets whether or not this [IPortAllocator] considers edges with strong [PortConstraint][yfiles.layout.PortConstraint]s or fixed [PortCandidate][yfiles.layout.PortCandidate].
 * 
 * Default value - `true`. Edges with strong/fixed ports are considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortAllocator%23considerFixedPorts">Online Documentation</a>
 */
open var considerFixedPorts: Boolean
/**
 * Gets or sets the border gap ratio for the default port.
 * 
 * Default value - `0.5`. Ports are distributed along the side of the node.
 * @throws ArgumentError if the given ratio is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortAllocator%23defaultPortBorderGapRatio">Online Documentation</a>
 */
open var defaultPortBorderGapRatio: Double
/**
 * Assigns source and target port coordinates to each edge of the graph.
 * @param [graph] the input graph
 * @param [layers] the given [ILayers] instance containing the layering structure
 * @param [ldp] the [ILayoutDataProvider] containing information about the nodes and edges of the graph
 * @param [itemFactory] the [IItemFactory] used for creating and destroying helper structures
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortAllocator%23DefaultPortAllocator-method-assignPorts">Online Documentation</a>
 */
 override   fun assignPorts( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider ,
 itemFactory: IItemFactory )
/**
 * Callback method used for determining the port border gap for each node and side.
 * @param [graph] the input graph
 * @param [ldp] the [ILayoutDataProvider] containing information about the nodes and edges of the graph
 * @param [node] the given node
 * @param [sideIndex] the zero-based (top is 0) clock-wise index of the side of the node (for top-to-bottom layouts)
 * @param [sideLength] the width/height of the side
 * @param [edgeCount] the number of edges/ports that connect to this side
 * @return the absolute gap on both sides of the ports
 * @see [getPortDistanceDelta]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortAllocator%23DefaultPortAllocator-method-getPortBorderGap">Online Documentation</a>
 */
 open protected   fun getPortBorderGap( graph: LayoutGraph ,
 ldp: ILayoutDataProvider ,
 node: Node ,
 sideIndex: Int ,
 sideLength: Double ,
 edgeCount: Int ):Double
/**
 * Callback method used for determining the port border gap ratio.
 * @param [graph] the input graph
 * @param [ldp] the [ILayoutDataProvider] containing information about the nodes and edges of the graph
 * @param [node] the given node
 * @param [sideIndex] the zero-based (top is 0) clock-wise index of the side of the node (for top-to-bottom layouts)
 * @param [sideLength] the width/height of the side
 * @param [edgeCount] the number of edges/ports that connect to this side
 * @return the border gap ratio
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortAllocator%23DefaultPortAllocator-method-getPortBorderGapRatio">Online Documentation</a>
 */
 open protected   fun getPortBorderGapRatio( graph: LayoutGraph ,
 ldp: ILayoutDataProvider ,
 node: Node ,
 sideIndex: Int ,
 sideLength: Double ,
 edgeCount: Int ):Double
/**
 * Callback method used for determining the distance between two adjacent ports.
 * @param [graph] the input graph
 * @param [ldp] the [ILayoutDataProvider] containing information about the nodes and edges of the graph
 * @param [node] the given node
 * @param [sideIndex] the zero-based (top is 0) clock-wise index of the side of the node (for top-to-bottom layouts)
 * @param [sideLength] the width/height of the side
 * @param [edgeCount] the number of edges/ports that connect to this side
 * @param [portBorderGap] the previously calculated port border gap
 * @return the absolute distance between two adjacent ports
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultPortAllocator%23DefaultPortAllocator-method-getPortDistanceDelta">Online Documentation</a>
 */
 open protected   fun getPortDistanceDelta( graph: LayoutGraph ,
 ldp: ILayoutDataProvider ,
 node: Node ,
 sideIndex: Int ,
 sideLength: Double ,
 edgeCount: Int ,
 portBorderGap: Double ):Double

companion object : ClassMetadata<DefaultPortAllocator> {
}
}

inline fun DefaultPortAllocator(
    block: DefaultPortAllocator.() -> Unit
): DefaultPortAllocator {
    return DefaultPortAllocator()
        .apply(block)
}
