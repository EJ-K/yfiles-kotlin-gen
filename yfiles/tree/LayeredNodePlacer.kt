// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.Node
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.LayoutGraph

/**
 * A [LayeredNodePlacer] arranges the nodes of a subtree respecting layers.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayeredNodePlacer">Online Documentation</a>
 * 
 * @constructor Creates a new [LayeredNodePlacer] instance whose direction is specified by the given modification matrix.
 * @param [modificationMatrix] the transformation matrix for this [RotatableNodePlacerBase] [RotatableNodePlacerMatrix.DEFAULT] if none is provided.
 * @param [id] the [LayeredNodePlacer] ID
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayeredNodePlacer%23LayeredNodePlacer-constructor-LayeredNodePlacer">Online Documentation</a>
 */
external open class LayeredNodePlacer  ( modificationMatrix: RotatableNodePlacerMatrix?  = definedExternally,
 id: Id?  = definedExternally) : RotatableNodePlacerBase {

/**
 * Gets or sets the vertical bus alignment for orthogonally routed edges.
 * 
 * Default value - `0.5`
 * @throws ArgumentError if the specified alignment is outside `[0..1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayeredNodePlacer%23busAlignment">Online Documentation</a>
 */
open var busAlignment: Double
/**
 * Gets or sets whether or not the layering is done dendrogram-like.
 * 
 * Default value - `false`. The nodes are assigned to the topmost layer.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayeredNodePlacer%23dendrogramStyle">Online Documentation</a>
 */
open var dendrogramStyle: Boolean
/**
 * Gets the ID of this [LayeredNodePlacer].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayeredNodePlacer%23id">Online Documentation</a>
 */
open val id: Id
/**
 * Gets or sets the distance between two adjacent layers.
 * 
 * Default value - `40`
 * @throws ArgumentError if the specified spacing is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayeredNodePlacer%23layerSpacing">Online Documentation</a>
 */
open var layerSpacing: Double
/**
 * Gets or sets whether or not straight edges are extended to avoid label overlaps.
 * 
 * Default value - `false`. Edges are only routed straight.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayeredNodePlacer%23polylineLabeling">Online Documentation</a>
 */
open var polylineLabeling: Boolean
/**
 * Gets or sets the [RootAlginment][RootNodeAlignment] that defines how the root node is aligned with its children and their shapes.
 * 
 * Default value - [RootNodeAlignment.CENTER_OVER_CHILDREN]
 * @throws ArgumentError if the given root alignment is `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayeredNodePlacer%23rootAlignment">Online Documentation</a>
 */
open var rootAlignment: RootNodeAlignment
/**
 * Gets or sets the routing style for the edges in the subtree.
 * 
 * Default value - [LayeredRoutingStyle.STRAIGHT]
 * @throws ArgumentError if the specified routing style specifier is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayeredNodePlacer%23routingStyle">Online Documentation</a>
 */
open var routingStyle: LayeredRoutingStyle
/**
 * Gets or sets the relative vertical alignment of nodes within their respective layers.
 * 
 * Default value - `0.5`. Nodes are center aligned.
 * @throws ArgumentError if the specified alignment is outside `[0..1]`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayeredNodePlacer%23verticalAlignment">Online Documentation</a>
 */
open var verticalAlignment: Double
/**
 * Creates a [IProcessor] that distributes the nodes over the layers.
 * @param [graph] the input graph
 * @param [currentRoot] the current root node for this node placer
 * @return the [IProcessor] or `null` if the layer information is already assigned to the current root
 * @see [dendrogramStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayeredNodePlacer%23LayeredNodePlacer-method-createProcessor">Online Documentation</a>
 */
 override   fun createProcessor( layouter: TreeLayout ,
 graph: LayoutGraph ,
 currentRoot: Node ):IProcessor?
/**
 * Returns [ParentConnectorDirection.NORTH] for every given child node.
 * @return [ParentConnectorDirection.NORTH]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayeredNodePlacer%23LayeredNodePlacer-method-determineChildConnector">Online Documentation</a>
 */
 override   fun determineChildConnector( child: Node ):ParentConnectorDirection
/**
 * Places the children of local root in layers.
 * @param [localRoot] the local root node
 * @param [parentConnectorDirection] the direction specifier for the connector of the local root node to its parent node
 * @return the merged subtree shape that contains the local root node and all its children
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayeredNodePlacer%23LayeredNodePlacer-method-placeSubtreeOfNode">Online Documentation</a>
 */
 override   fun placeSubtreeOfNode( localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):RotatedSubtreeShape

companion object : ClassMetadata<LayeredNodePlacer> {
}
}

inline fun LayeredNodePlacer(
    block: LayeredNodePlacer.() -> Unit
): LayeredNodePlacer {
    return LayeredNodePlacer()
        .apply(block)
}
